package com.multi.grow.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjaxService {
	 
    private static MemberDAO dao;
    
    @Autowired
    public AjaxService(MemberDAO memberDao) {
        AjaxService.dao = memberDao;
    }
 
    public static int idCheck(String id) {
        int result = 0;
        
        result = dao.idCheck(id);
        return result;
    }
}
