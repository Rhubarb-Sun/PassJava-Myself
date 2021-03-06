package com.rhubarb.passjava.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.rhubarb.passjava.member.feign")
@EnableDiscoveryClient
@MapperScan("com.rhubarb.passjava.member.dao")
@SpringBootApplication
public class PassjavaMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaMemberApplication.class, args);
	}

}
