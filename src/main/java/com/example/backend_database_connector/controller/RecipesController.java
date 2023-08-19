package com.example.backend_database_connector.controller;

import com.example.backend_database_connector.model.Recipe;

// First, we will import the actual Jdbc class to get the recipes
// Later, Spring will let us cheat and only use the interface
import com.example.backend_database_connector.dao.JdbcRecipeDao;
import com.example.backend_database_connector.dao.RecipeDao;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
public class RecipesController {
    // To use the JdbcRecipeDao class, I need to instantiate it.
    // However, Spring will make this easier in a minute.
    //    private JdbcRecipeDao jdbcRecipeDao = new JdbcRecipeDao();
    @Autowired
    RecipeDao recipeDao;

    @GetMapping(path="/test")
    public String getTest() {
        return "This is a test";
    }

    @GetMapping(path="/recipes")
    public List<Recipe> getAllRecipes() {
        // We could write all of our code here
        // Ideally, though, we hide the details
        // The controller just wants a method that will give it data
        // The controller will use the DAO to call a method to get the data
        return recipeDao.getAllRecipes();

    }

}
