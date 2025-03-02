package org.Presentation;

import org.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringAnno {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.Ext");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}