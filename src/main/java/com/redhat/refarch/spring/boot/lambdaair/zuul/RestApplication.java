package com.redhat.refarch.spring.boot.lambdaair.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableZuulProxy
public class RestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(RestApplication.class, args);
	}
}