package com.example.maysara_.myapplication.Helpers;

import android.content.Context;

import com.example.maysara_.myapplication.Models.Budget;
import com.example.maysara_.myapplication.Models.Category;
import com.example.maysara_.myapplication.Models.User;

public class DB_Helper implements queries {

    public DB_Helper(Context context) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public Budget[] getAllBudgets() {
        return new Budget[0];
    }

    @Override
    public Category[] getCategoriesForBudget(int id) {
        return new Category[0];
    }


    @Override
    public Budget getBudget(int id) {
        return null;
    }

    @Override
    public void createBudget(Budget budget) {

    }

    @Override
    public Budget removeBudget(int id) {
        return null;
    }

    @Override
    public void createCategory(Category category) {

    }

    @Override
    public Category[] getAllCategories() {
        return new Category[0];
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }

    @Override
    public Category removeCategory(int id) {
        return null;
    }
}
