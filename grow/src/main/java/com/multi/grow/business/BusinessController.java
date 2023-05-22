package com.multi.grow.business;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BusinessController {
	@Autowired
	BusinessDAO dao;
	
	@PostMapping("business/insert")
	public void insert(BusinessVO bag, HttpServletRequest request, MultipartFile file, Model model) throws Exception {
		
		System.out.println(bag.toString());
		String savedName= file.getOriginalFilename();
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/upload");
		System.err.println("uploadPath : "+uploadPath);
		File target=new File(uploadPath+ "/" +savedName);
		file.transferTo(target);
		
		model.addAttribute("savedName",savedName);
		bag.setB_image(savedName);
		System.out.println(uploadPath+ "/" +savedName);

		System.out.println("insert");
		System.out.println(bag);
		
		dao.insert(bag);
		 
		
		
		
	}
}
