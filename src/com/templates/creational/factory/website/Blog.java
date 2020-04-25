package com.templates.creational.factory.website;

import com.templates.creational.factory.page.AboutPage;
import com.templates.creational.factory.page.CommentPage;
import com.templates.creational.factory.page.ContactPage;
import com.templates.creational.factory.page.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
