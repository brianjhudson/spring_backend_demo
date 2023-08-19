package com.example.backend_database_connector.model;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private String description;
    private String webUrl;
    private String imageUrl;

    public Recipe() {

    }
    public Recipe(int rId, String rName, String rDescription, String rWebUrl, String rImageUrl) {
        recipeId = rId;
        recipeName = rName;
        description = rDescription;
        webUrl = rWebUrl;
        imageUrl = rImageUrl;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getDescription() {
        return description;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
