package model.dao;

import model.impl.SellerDaoimplJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoimplJDBC();
		
	}

}
