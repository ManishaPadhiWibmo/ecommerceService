package com.manisha.ecommerce.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Items  implements RowMapper<Items> {
    private long id;
    private long categoryId;
    private String name;
    private String status;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Items mapRow(ResultSet rs, int rowNum) throws SQLException {
        this.setId(rs.getLong("id"));
        this.setName(rs.getString("name"));
        this.setStatus(rs.getString("status"));
        this.setPrice(rs.getDouble("price"));


       return this;
    }
}
