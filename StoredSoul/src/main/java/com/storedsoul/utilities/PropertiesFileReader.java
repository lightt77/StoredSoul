package com.storedsoul.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
* utility class to read properties file
* */
public class PropertiesFileReader
{
    private static Properties properties;
    private final static String PROPERTIES_FILE_PATH = "src/main/resources/application.properties";

    static
    {
        properties = new Properties();
        try
        {
            properties.load(new FileInputStream(PROPERTIES_FILE_PATH));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }
}
