package com.manisha.ecommerce.Dao;


import com.manisha.ecommerce.model.Categories;
import com.manisha.ecommerce.model.Orders;

import java.util.List;

public interface EcomDao {

    public abstract List<Categories> getCategories();
    public abstract  void addCategories(Categories categories);
    public abstract Categories getCategory(long id);
    public abstract List<Orders> getCustOrders(long id);
    public abstract List<Orders> getOrders(long id);
}
