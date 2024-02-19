package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresVecSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier"); // scanner les 2 packages chercher sil ya components il va instansier et si autowired il fait injection des dependances
        IMetier metier= context.getBean(IMetier.class);//donne moi un bean qui implemente interface IMetier
        System.out.println("RES="+metier.calcul());
    }
}
