package com.multi.travel;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO { 
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MembershipVO bag) {
		my.insert("membership.create", bag);
	}
	
	public void delete(String id) {
		my.delete("membership.del", id);
	}
	
	public void update(MembershipVO bag) {
		int result = my.update("membership.up", bag);
		System.out.println(result);
	}
	
	public MembershipVO one(String id) {
		//타입 MemberVo  //one은 selectOne
		MembershipVO vo = my.selectOne("membership.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<MembershipVO> list() {
		//row하나당 어떤 vo에 넣을지만 지정하면 my.selectList()를 호출한 경우에는 
		//myBatis가 list vo가 잔뜩 들어간 LIst로 만들어준다.
		//타입 List<MemberVO>  //list는 selectList
		List<MembershipVO> list = my.selectList("membership.all");
		System.out.println(list.size());
		return list;
	}
	
}