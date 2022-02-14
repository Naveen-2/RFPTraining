package com.JavaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final Logger LOG = LogManager.getLogger(App.class); 
        String message = "Hello World!" ;
        LOG.debug(message + "printed in debug");
    }
}
