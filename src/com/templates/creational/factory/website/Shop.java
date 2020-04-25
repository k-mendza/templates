package com.templates.creational.factory.website;

import com.templates.creational.factory.page.CartPage;
import com.templates.creational.factory.page.ItemPage;
import com.templates.creational.factory.page.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
