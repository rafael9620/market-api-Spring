package com.market.domain;

public class Category {

    private int categoryID;
    private String category;
    private Boolean active;

    public int getIdCategory() {
        return categoryID;
    }

    public void setIdCategory(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
