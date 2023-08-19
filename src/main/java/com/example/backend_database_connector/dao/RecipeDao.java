package com.example.backend_database_connector.dao;

import com.example.backend_database_connector.model.Recipe;
import java.util.List;

public interface RecipeDao {
    public List<Recipe> getAllRecipes();
}
