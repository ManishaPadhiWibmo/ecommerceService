package com.manisha.ecommerce.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Categories implements RowMapper<Categories> {

    private long id;
    private String name;
    private String status;
    private Date created_date;
    private Date modified_date;

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
        this.setId(rs.getLong("id"));
        this.setName(rs.getString("name"));
        this.setStatus(rs.getString("name"));
        this.setCreated_date(rs.getDate("created_date"));
        this.setModified_date(rs.getDate("modified_date"));
        return this;
    }
}
