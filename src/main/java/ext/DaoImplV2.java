package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service ");
        double data=14;
        return data;
    }
}
