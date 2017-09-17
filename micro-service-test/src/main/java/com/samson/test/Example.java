package com.samson.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/getMajorInfo")
    Map<String, String> getMajorInfo() {
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("name", "Samson");
    	map.put("age", "35");
    	return map;
    }
    
    @RequestMapping("/getBean")
    TestBean getBean() {
    	TestBean testBean = new TestBean();
    	testBean.setAge(35);
    	testBean.setFirstName("Samson");
    	testBean.setLastName("Ao");
    	return testBean;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}