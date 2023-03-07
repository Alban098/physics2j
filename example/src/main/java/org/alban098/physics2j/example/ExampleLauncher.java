package org.alban098.physics2j.example;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleLauncher.class);
    public static void main(String[] args) {
        PropertyConfigurator.configure("./log4j.properties");
        LOGGER.info("Successfully launched !");
    }
}
