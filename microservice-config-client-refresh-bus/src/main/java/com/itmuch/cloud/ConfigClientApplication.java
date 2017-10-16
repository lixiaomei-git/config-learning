package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RefreshScope
public class ConfigClientApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
