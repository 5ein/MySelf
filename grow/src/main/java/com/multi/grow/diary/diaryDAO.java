package com.multi.grow.diary;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class diaryDAO {

	@Autowired
	SqlSessionTemplate my;

	public int cardview(diaryVO bag) {
		int result = my.insert("diary.create", bag);
		//						namespace.id 
		return result;
	}

/*		public int delete(String id) {
		int result = my.delete("kids.del", id);
		return result;
	}

	public int update(kidsVO bag) {
		int result = my.update("kids.up", bag);
		return result;
	}


	public kidsVO one(String id) {
		kidsVO result = my.selectOne("kids.one", id);
		return result;
	}*/

	public List<diaryVO> list() {
		List<diaryVO> list = my.selectList("diary.list");
		return list;
	}

}