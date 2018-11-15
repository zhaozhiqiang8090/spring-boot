package com.zzq.commontraining.controller;

import com.zzq.commontraining.configuration.ConfigParent;
import com.zzq.commontraining.model.Dog;
import com.zzq.commontraining.model.Person;
import com.zzq.commontraining.service.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/configuration")
public class ConfigurationController {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationController.class);

    @Autowired
    Person person;

    @Autowired
    Dog dog;

    @RequestMapping("/person")
    @ResponseBody
    public String getPerson() {
        return person == null ? null : person.toString();
    }

    @RequestMapping("/dog")
    @ResponseBody
    public String getDog() {
        return dog == null ? null : dog.toString();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigParent.class);
        Car car = (Car) annotationConfigApplicationContext.getBean("toyota");
        car.print();

        car = (Car) annotationConfigApplicationContext.getBean("bmw");
        car.print();
    }

}
