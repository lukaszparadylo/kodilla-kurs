package com.kodilla.patterns.strategy.social.socials;

import com.kodilla.patterns.strategy.social.SocialPublisher;
import com.kodilla.patterns.strategy.social.User;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        //System.out.println("Twitter ");
        return "Twitter ";
    }
}
