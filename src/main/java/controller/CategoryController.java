package controller;

import model.Category;
import model.CategoryDAO;

import java.util.Set;

public class CategoryController {
    public static Set<Category> categories() {
        return new CategoryDAO().getAll();
    }
}
