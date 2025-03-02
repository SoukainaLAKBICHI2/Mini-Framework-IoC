package org.Presentation;

import org.Dao.DaoImpl;
import org.Metier.MetierImpl;

public class InstStatic {
    public static void main(String[] args) {
        DaoImpl dao =new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); // Injection via le setter
        System.out.println(metier.calcul());
    }
}
