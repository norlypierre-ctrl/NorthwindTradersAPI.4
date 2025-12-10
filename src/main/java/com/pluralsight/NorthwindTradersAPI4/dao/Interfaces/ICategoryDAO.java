package com.pluralsight.NorthwindTradersAPI4.dao.Interfaces;

import com.pluralsight.NorthwindTradersAPI4.models.Category;

import java.util.List;

public interface ICategoryDAO {

    List<Category> getAll();

    Category getById(int category);

    Category insert(Category category);
}
