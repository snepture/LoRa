package com.matthew.lora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by shuiyu on 2017/6/5.
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
    }
}