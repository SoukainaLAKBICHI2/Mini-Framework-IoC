package org.Ext;

import org.Dao.IDao;
import org.Metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl2 implements IMetier {
    //@Autowired
    private IDao dao;

    //Injection via Le Constructeur
    //public MetierImpl2() {}

    public MetierImpl2(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double result = temp *23;
        return result;
    }

    //Injection via Le Setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

