package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class NetflixZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulProxyApplication.class, args);
	}
	
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
