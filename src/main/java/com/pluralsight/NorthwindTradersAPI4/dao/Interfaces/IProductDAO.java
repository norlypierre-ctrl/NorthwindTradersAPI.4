package com.pluralsight.NorthwindTradersAPI4.dao.Interfaces;

import com.pluralsight.NorthwindTradersAPI4.models.Product;

import java.util.List;

public interface IProductDAO {

    List<Product> getAll();

    Product getById(int productID);

    Product insert(Product product);
}
