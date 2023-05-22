package com.multi.grow.business;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BusinessVO bag) {
		
		System.out.println("BusinessVO :" +bag);
		int result= my.insert("business.create",bag);
		
		return result;
	}

}
