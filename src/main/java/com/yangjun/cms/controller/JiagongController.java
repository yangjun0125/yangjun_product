/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: JiagongController.java 
 * @Prject: yangjun_product
 * @Package: com.yangjun.cms.controller 
 * @Description: TODO
 * @author: Y   
 * @date: 2020年3月17日 上午11:22:29 
 * @version: V1.0   
 */
package com.yangjun.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yangjun.cms.entity.Jiagong;
import com.yangjun.cms.service.JiagongService;

/** 
 * @ClassName: JiagongController 
 * @Description: TODO
 * @author: Y
 * @date: 2020年3月17日 上午11:22:29  
 */
@Controller
public class JiagongController {
	
	@Resource
	JiagongService jiagongService;
	
	@RequestMapping("jiagong")
	public String jiagong() {
		
		return "jiagong";
	}
	
	@RequestMapping("add")
	public String insert(Jiagong jiagong) {
		System.out.println(1);
		jiagongService.Insert(jiagong);
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String list(Model model,Jiagong jiagong,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Jiagong> list = jiagongService.selects(jiagong,page,pageSize);
		model.addAttribute("info", list);
		model.addAttribute("jia", jiagong);
		return "list";
	}
	
	
	@RequestMapping("update")
	public String update(Jiagong jiagong,Model model) {
		Jiagong jiagong2=jiagongService.selectbyid(jiagong);
		model.addAttribute("jiagong", jiagong2);
		return "update";
	}
	
	@RequestMapping("updateid")
	public String updateid(Jiagong jiagong,Model model) {
		jiagongService.updateid(jiagong);
		return "redirect:list";
	}

}
