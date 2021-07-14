package com.kodilla.patterns.strategy.social;

public class User {
    public final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost(){
        return this.socialPublisher.share();
    }

    public void setPublishingStrategy(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
