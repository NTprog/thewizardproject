package com.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wildcodeschool.thewizardproject.models.Gandalf;
import com.wildcodeschool.thewizardproject.models.Outfit;
import com.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	
    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myRobe = context.getBean("wizard", WizardInterface.class);
        context.close();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myRobe.giveAdvice());
        System.out.println("******************");
        System.out.println(myRobe.changeDress());
        System.out.println("******************");
    }
}
