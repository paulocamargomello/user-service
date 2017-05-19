/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author stefanini
 */
@SpringBootApplication
@EnableEurekaClient
public class DatabaseApp {
    
    public static void main(String[] args) {
        SpringApplication.run(DatabaseApp.class, args);
    }
}