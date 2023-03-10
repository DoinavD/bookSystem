package model;

import bll.CategoryManager;
import entities.Category;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.List;

public class ModelCategory {
    private CategoryManager categoryManager;
    private ObservableList<Category> categories = FXCollections.observableArrayList();

    public  ModelCategory(){ categoryManager = new CategoryManager();}

    public ObservableList<Category> getAllCategories() throws SQLException {
        List<Category> b = categoryManager.getAllCategories();
        return categories = FXCollections.observableArrayList(b);
    }
    public void createNewCategory(Category category) throws SQLException {
        categoryManager.createNewCategory(category);
        categories.add(category);
    }


    public void deleteCategory(Category category) throws SQLException {
        categoryManager.deleteCategory(category.getId());
        categories.remove(category);
    }
}
