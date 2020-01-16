package dev;

import dev.dao.PlatDaoFichier;
import dev.dao.PlatDaoMemoire;
import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;
import dev.service.PlatServiceVersion2;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		//Scanner scanner = context.getBean(Scanner.class);

        //PlatDaoMemoire platDaoMemoire = new PlatDaoMemoire();

        // TODO adapter le chemin du fichier (utiliser un répertoire existant)
       // ClassLoader classLoader = new App().getClass().getClassLoader();
        //System.out.println(classLoader.getResource("restaurant.txt"));
        //PlatDaoFichier platDaoFichier = new PlatDaoFichier(classLoader.getResource("restaurant.txt").toString());
        PlatDaoFichier platDaoFichier = new PlatDaoFichier("src/main/resources/restaurant.txt");
        
        //PlatServiceVersion1 platServiceVersion1 = new PlatServiceVersion1(platDaoFichier);
        //PlatServiceVersion2 platServiceVersion2 = new PlatServiceVersion2(platDaoMemoire);

     // récupération du bean Menu
        Menu menu = context.getBean(Menu.class);
        menu.afficher();
        // fermeture du Scanner
        context.getBean(Scanner.class).close();
        // fermeture du contextes
        context.close();


    }
}
