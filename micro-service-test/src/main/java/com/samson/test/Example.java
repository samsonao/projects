package com.samson.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages= {"com.samson"})
public class Example {
	
	@Autowired
	@Qualifier("PrintStuff")
	private PrintStuff printStuffBean;
	
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
    	printStuffBean.getStringAndPrint();
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
