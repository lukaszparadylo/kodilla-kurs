package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.social.socials.TwitterPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        User john = new Millenials("John");
        User frank = new YGeneration("Frank");
        User michael = new ZGeneration("Michael");

        String johnShouldPublish = john.sharePost();
        System.out.println("John should share post on: " + johnShouldPublish);
        String frankShouldPublish = frank.sharePost();
        System.out.println("Frank should share post on: " + frankShouldPublish);
        String michaelShouldPublish = michael.sharePost();
        System.out.println("Michael should share post on: " + michaelShouldPublish);

        Assertions.assertEquals("Facebook ", johnShouldPublish);
        Assertions.assertEquals("Twitter ", frankShouldPublish);
        Assertions.assertEquals("Snapchat ", michaelShouldPublish);
    }

    @Test
    void testIndividualSharingStrategy(){
        User john = new Millenials("John");

        String johnShouldPublish = john.sharePost();
        System.out.println("John should share post on: " + johnShouldPublish);
        john.setPublishingStrategy(new TwitterPublisher());
        johnShouldPublish = john.sharePost();
        System.out.println("John should now share post on: " + johnShouldPublish);

        assertEquals("Twitter ", johnShouldPublish);
    }
}
