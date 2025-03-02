package org.Ext;

import org.Dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version 2");
        return 55;
    }
}
