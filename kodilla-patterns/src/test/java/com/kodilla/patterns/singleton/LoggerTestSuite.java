package com.kodilla.patterns.singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;
    private final String LOG_TEST = "something";

    @BeforeEach
    public void createLogger(){
        this.logger = Logger.LOG;
    }

    @Test
    void testGetLastLog(){
        logger.log(LOG_TEST);

        boolean test = LOG_TEST == logger.getLastLog();

        Assertions.assertTrue(test);
    }

}
