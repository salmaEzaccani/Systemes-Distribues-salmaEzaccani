package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

          // DaoImpl dao=new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));//charger le ficjier txt
        String daoClassName= scanner.nextLine();//lire la premiere ligne et importer la classe
        Class cDao=Class.forName(daoClassName); // tester si cette class existe ou pas
       IDao dao=(IDao) cDao.getConstructor().newInstance();    // creer un objet de cette class qui implemente cette interface => new DaoImpl()


        //  MetierImpl metier=new MetierImpl();
        String metierClassName= scanner.nextLine(); // lire 2eme ligne
        Class cMetier=Class.forName(daoClassName);  // class charger en memoire
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance(); // creer objet de cet class


        // metier.setDao(dao);
        Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);   // injection des dependances
    }



}
