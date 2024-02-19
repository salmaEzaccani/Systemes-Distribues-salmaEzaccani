package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component   // 2eme method de spring annotation
public class MetierImpl implements IMetier {


    @Autowired  //injecter dans cet var un type Idao
    private IDao dao;   //couplage faible je depends d'une interface

    //injection via constructor je supprime Autowired

   /* public MetierImpl(IDao dao) {
        this.dao = dao;
    }*/
    @Override
    public double calcul() {
        double data= dao.getData();
        double res=data*11;
        return res;
    }

    //  pour permettre d'injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
