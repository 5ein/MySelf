package com.multi.muluck.follow;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FollowDAO { 
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(FollowVO bag) {
		my.insert("member.create", bag);
	}
	
	public void delete(String id) {
		my.delete("member.del", id);
	}
	
	public void update(FollowVO bag) {
		int result = my.update("member.up", bag);
		System.out.println(result);
	}
	
	public FollowVO one(String id) {
		//타입 MemberVo  //one은 selectOne
		FollowVO vo = my.selectOne("member.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<FollowVO> list() {
		//row하나당 어떤 vo에 넣을지만 지정하면 my.selectList()를 호출한 경우에는 
		//myBatis가 list vo가 잔뜩 들어간 LIst로 만들어준다.
		//타입 List<MemberVO>  //list는 selectList
		List<FollowVO> list = my.selectList("member.all");
		System.out.println(list.size());
		return list;
	}
	
}