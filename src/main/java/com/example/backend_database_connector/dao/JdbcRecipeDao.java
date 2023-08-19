package com.example.backend_database_connector.dao;
/*
* This will be the class that connects to our database
* For now, we are just using it as a utility to shift the logic from the controller
* There is one other wrinkle--in Spring, we don't need to instantiate it
* First, we'll do it the plain Java way
* */

import com.example.backend_database_connector.dao.RecipeDao;
import com.example.backend_database_connector.model.Recipe;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.ArrayList;

@Component
public class JdbcRecipeDao implements RecipeDao {

    private final JdbcTemplate db;

    public JdbcRecipeDao(JdbcTemplate jTemplate) {
        db = jTemplate;
    }

    public List<Recipe> getAllRecipes() {
        // Dummy logic to replace database logic
//        Recipe recipe = new Recipe();
//        Recipe recipe2 = new Recipe();
//        Recipe recipe3 = new Recipe();
//        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
//        recipes.add(recipe);
//        recipes.add(recipe2);
//        recipes.add(recipe3);
        // When I connect to the database, I will convert SQL rows into Recipes
        // and put them in the list
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        String sqlStatement = "SELECT * FROM recipes;";
        SqlRowSet results = db.queryForRowSet(sqlStatement);

        // Loop through each row using .next()
        while(results.next()) {
            // For each row, create a new Recipe, using our model
            // Translate the SQL result into properties in our model
            Recipe recipe = new Recipe();
            int id = results.getInt("id");
            recipe.setRecipeId(id);
            String recipeName = results.getString("recipe_name");
            recipe.setRecipeName(recipeName);

            recipes.add(recipe);
        }

        return recipes;
    }
}
