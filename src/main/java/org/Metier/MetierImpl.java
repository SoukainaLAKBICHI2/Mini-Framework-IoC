package org.Metier;

import org.Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao=null;

    //Injection via Le Constructeur
    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
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
