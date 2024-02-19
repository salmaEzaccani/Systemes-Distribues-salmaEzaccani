package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

//INJECTION DES DEPENDANCES: prendre adrs memoire d'un objet et le met dans a une variable de l'autre objet
public class Pres1 {

    public static void main(String[] args) {

        //methode 1 "instanciation statique"

        DaoImpl dao=new DaoImpl(); // lorsque fait new une adrs memoire va se genere et stocker dans var dao ,"instanciation statique"
        MetierImpl metier=new MetierImpl();//inject via constructor on va mettre ici parameter dao et on va supprimer set
        metier.setDao(dao);//injection des dependances
        System.out.println("RESS="+metier.calcul());

        //methode 2 "instanciation dynamique??
        // IL FAUT CREER UN FICHIER DE CONFIGURATION"
    }
}
