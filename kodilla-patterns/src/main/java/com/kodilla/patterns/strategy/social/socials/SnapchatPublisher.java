package com.kodilla.patterns.strategy.social.socials;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        //System.out.println("Snapchat ");
        return "Snapchat ";
    }
}
