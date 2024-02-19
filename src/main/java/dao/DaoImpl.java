package dao;


import org.springframework.stereotype.Component;

@Component("dao") //creer un objet de cette class au demarrage c une autre annotation de spring ca remplace fichier xml
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version baase de données ");
        double data=34;
        return data;
    }
}
