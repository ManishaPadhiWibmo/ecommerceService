package com.manisha.ecommerce.service;

import com.manisha.ecommerce.model.Categories;
import com.manisha.ecommerce.model.Items;
import com.manisha.ecommerce.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
@Service
public class EcommerceService {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public String addCategory(Categories categories) {
       String sql = "INSERT INTO `category_detail` ( `name`, `status`) VALUES (?, ?)";
       int count = jdbcTemplate.update(sql, categories.getName(),categories.getStatus());
       if(count>=1){
           return "{message:Successfully Added}";
       }
       return "{message:failed to add}";
    }
    public String updateCategoryStatus(Categories categories) {
        String sql = "UPDATE `category_detail` SET `status` = ? WHERE (`id` = ?)";
        int count = jdbcTemplate.update(sql, categories.getStatus(),categories.getId());
        if(count>=1){
            return "{message:Successfully updated}";
        }
        return "{message:failed to update}";
    }

    public String deleteCategory(long id) {
        String sql = "DELETE FROM `category_detail` WHERE (`id` = ?)";
        int count = jdbcTemplate.update(sql, id);
        if(count>=1){
            return "{message:Successfully deletd}";
        }
        return "{message:failed to delete}";
    }

    public List<Categories> getCatogories() {
         String sql = "SELECT * FROM category_detail";
        jdbcTemplate.query(sql, new Categories());
        return jdbcTemplate.query(sql, new Categories());
    }

    public Categories getCategory(long id) {
        String sql = "SELECT * FROM category_detail where id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id}, new Categories());
    }

    public List<Items> getItem(long catId) {

        String sql = "SELECT id, name, status, price FROM item_detail where categoryId = ?";

        return jdbcTemplate.query(sql,new Items(), catId);
    }

    public Items getItemDetail(long id) {

        String sql = "SELECT id,name, status, price FROM item_detail where Id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id}, new Items());
    }


    public String addItem(Items items) {
        String sql = "INSERT INTO `item_detail` (`name`, `categoryId`, `status`) VALUES (?, ?, ?)";
        int count = jdbcTemplate.update(sql, items.getName(),items.getCategoryId(), items.getStatus());
        if(count>=1){
            return "{message:Successfully Added}";
        }
        return "{message:failed to add}";
    }

    public String updateItemStatus(Items items) {
        String sql = "UPDATE `item_detail` SET `status` = ? WHERE (`id` = ?)";
        int count = jdbcTemplate.update(sql, items.getStatus(),items.getId());
        if(count>=1){
            return "{message:Successfully updated}";
        }
        return "{message:failed to update}";
    }

    public String deleteItem(long id) {
        String sql = "DELETE FROM `item_detail` WHERE (`id` = ?)";
        int count = jdbcTemplate.update(sql, id);
        if(count>=1){
            return "{message:Successfully deleted}";
        }
        return "{message:failed to delete}";
    }

    public String placeOrder(Orders orders) {
    String status = (getItemDetail(orders.getId())).getStatus();
   // if (status.equalsIgnoreCase("available")){
        String sql = "INSERT INTO `order_detail` (`categoryId`, `itemId`, `itemName`, `categoryName`," +
                " `status`, `price`, `invoiceNo`, `emailId`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        int count = jdbcTemplate.update(sql, orders.getCategoryId(),orders.getItemId(), orders.getItemName(),
                orders.getCategoryName(), orders.getStatus(), orders.getPrice(), orders.getInvoiceNo(),orders.getEmailId());
        if(count>=1){
            Items items = new Items();
            items.setStatus("not available");
            items.setId(orders.getItemId());
            updateItemStatus(items);
            return "{message:Successfully Added}";
        }
        return "{message:failed to add}";

   /*}else{return "Out of Stock!!";}*/
    }

    public List<Orders> getOrders(String emailId) {
        String sql = "SELECT * FROM order_detail where emailId = ?";

        return jdbcTemplate.query(sql,new Orders(), emailId);

    }

    public Orders getOrderDetail(long id) {
        String sql = "SELECT * FROM order_detail where id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id}, new Orders());
    }

    public String cancelOrder(long id) {
        String sql = "UPDATE `order_detail` SET `status` = 'cancel' WHERE (`id` = ?)";
        int count = jdbcTemplate.update(sql, id);
        if(count>=1){
            return "{message:Successfully cancelled}";
        }
        return "{message:failed to cancel}";
    }


}
