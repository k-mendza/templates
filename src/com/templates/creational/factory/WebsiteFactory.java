package com.templates.creational.factory;

import com.templates.creational.factory.website.Blog;
import com.templates.creational.factory.website.Shop;
import com.templates.creational.factory.website.Website;
import com.templates.creational.factory.website.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
