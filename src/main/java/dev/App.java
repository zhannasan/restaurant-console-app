package dev;

import dev.ihm.Menu;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
     // récupération du bean Menu
        Menu menu = context.getBean(Menu.class);
        menu.afficher();
        // fermeture du Scanner
        context.getBean(Scanner.class).close();
        // fermeture du contextes
        context.close();


    }
}
