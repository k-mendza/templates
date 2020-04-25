package com.templates.creational.factory.website;

import com.templates.creational.factory.page.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
