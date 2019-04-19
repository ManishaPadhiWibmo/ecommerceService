package com.manisha.ecommerce.controllers;


import com.manisha.ecommerce.model.Categories;
import com.manisha.ecommerce.model.Items;
import com.manisha.ecommerce.model.Orders;
import com.manisha.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EcommerceController {
    @Autowired
    EcommerceService ecommerceService;


    //AddCategory
    @PostMapping("/category/add")
    public String addCategory(@RequestBody Categories categories){

        return ecommerceService.addCategory(categories);
    }

    //get All Categories
    @GetMapping("/categories")
    public  List<Categories> getAll(){

         return ecommerceService.getCatogories();
        //return "hello";
    }

    //uodate status Category
    @PutMapping("/categories")
    public  String updateCategoryStatus(@RequestBody Categories categories){

        return ecommerceService.updateCategoryStatus(categories);
    }

    @DeleteMapping("/categories/{id}")
    public  String deleteCategories(@PathVariable long id){

        return ecommerceService.deleteCategory(id);
    }



    //get One getgory
    @GetMapping("/categories/{id}")
    public Categories getCategory(@PathVariable("id") long id){

        return ecommerceService.getCategory(id);
    }

    //get Item
    @GetMapping("/items/{categoryId}")
    public List<Items> getItem(@PathVariable("categoryId") long id){

        return ecommerceService.getItem(id);
    }

    //get Item
    @GetMapping("/item/{id}")
    public Items getItemDetail(@PathVariable("id") long id){

        return ecommerceService.getItemDetail(id);
    }

    //addItem
    @PostMapping("/items/add")
    public String addItem(@RequestBody Items items){
        return ecommerceService.addItem(items);
    }


    //uodate status Item
    @PutMapping("/Item")
    public  String updateItemStatus(@RequestBody Items items){

        return ecommerceService.updateItemStatus(items);
    }

    @DeleteMapping("/item/{id}")
    public  String deleteItems(@PathVariable long id){

        return ecommerceService.deleteCategory(id);
    }

    //place order
    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody Orders orders){
        return ecommerceService.placeOrder(orders);
    }

    //uodate status Item
    @PutMapping("/cancel/{id}")
    public  String cancelOrder(@PathVariable long id){

        return ecommerceService.cancelOrder(id);
    }



    //get AllOrder
    @GetMapping("/orders/{emailId}")
    public List<Orders> getOrders(@PathVariable("emailId") String id){
        return ecommerceService.getOrders(id);
    }

    @GetMapping("/order/{id}")
    public Orders getOrders(@PathVariable("id") long id){
        return ecommerceService.getOrderDetail(id);

    }

   /* @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Request ID not found")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler(){


    }*/






}
