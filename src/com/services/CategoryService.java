package com.services;

import java.sql.ResultSet;

public interface CategoryService {

	boolean createCategory();
	
	ResultSet getCategories() throws Exception;
	
	
}
