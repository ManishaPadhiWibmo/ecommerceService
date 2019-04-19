package com.manisha.ecommerce.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Orders implements RowMapper<Orders> {
    private long id;
    private long categoryId;
    private long itemId;
    private String itemName;
    private String categoryName;
    private String status;
    private double price;
    private String invoiceNo;
    private Date dateOfOrder;
    private String emailId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
        this.setId(rs.getLong("id"));
        this.setItemName(rs.getString("itemName"));
        this.setStatus(rs.getString("status"));
        this.setCategoryId(rs.getLong("categoryId"));
        this.setCategoryName(rs.getString("categoryName"));
        this.setDateOfOrder( rs.getDate("dateOfOrder"));
        this.setEmailId(rs.getString("emailId"));
        this.setInvoiceNo(rs.getString("invoiceNo"));
        this.setPrice(rs.getDouble("price"));
        this.setStatus(rs.getString("status"));
        return this;
    }
}
