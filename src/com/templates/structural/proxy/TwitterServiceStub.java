package com.templates.structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
