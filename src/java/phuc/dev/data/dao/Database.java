package phuc.dev.data.dao;

import phuc.dev.data.impl.CategoryImpl;
import phuc.dev.data.impl.OrderImpl;
import phuc.dev.data.impl.OrderItemImpl;
import phuc.dev.data.impl.ProductImpl;
import phuc.dev.data.impl.UserImpl;

public class Database extends DatabaseDao {

    
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductImpl();
	}

}
