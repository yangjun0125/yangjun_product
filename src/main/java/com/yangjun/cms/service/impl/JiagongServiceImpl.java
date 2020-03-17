/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: JiagongServiceImpl.java 
 * @Prject: yangjun_product
 * @Package: com.yangjun.cms.service.impl 
 * @Description: TODO
 * @author: Y   
 * @date: 2020年3月17日 上午11:22:21 
 * @version: V1.0   
 */
package com.yangjun.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangjun.cms.dao.JiagongMapper;
import com.yangjun.cms.entity.Jiagong;
import com.yangjun.cms.service.JiagongService;

/** 
 * @ClassName: JiagongServiceImpl 
 * @Description: TODO
 * @author: Y
 * @date: 2020年3月17日 上午11:22:21  
 */
@Service
public class JiagongServiceImpl implements JiagongService {

	@Resource
	JiagongMapper jiagongMapper;

	/* (non Javadoc) 
	 * @Title: Insert
	 * @Description: TODO
	 * @param jiagong
	 * @return 
	 * @see com.yangjun.cms.service.JiagongService#Insert(com.yangjun.cms.entity.Jiagong) 
	 */
	@Override
	public int Insert(Jiagong jiagong) {
		// TODO Auto-generated method stub
		return jiagongMapper.Insert(jiagong);
	}

	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: TODO
	 * @param jiagong
	 * @return 
	 * @see com.yangjun.cms.service.JiagongService#selects(com.yangjun.cms.entity.Jiagong) 
	 */
	@Override
	public PageInfo<Jiagong> selects(Jiagong jiagong,Integer page,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		List<Jiagong> selects = jiagongMapper.selects(jiagong);
		return new PageInfo<Jiagong>(selects);
	}

	/* (non Javadoc) 
	 * @Title: selectbyid
	 * @Description: TODO
	 * @param jiagong
	 * @return 
	 * @see com.yangjun.cms.service.JiagongService#selectbyid(com.yangjun.cms.entity.Jiagong) 
	 */
	@Override
	public Jiagong selectbyid(Jiagong jiagong) {
		// TODO Auto-generated method stub
		return jiagongMapper.selectsbyid(jiagong);
	}

	/* (non Javadoc) 
	 * @Title: updateid
	 * @Description: TODO
	 * @param jiagong 
	 * @see com.yangjun.cms.service.JiagongService#updateid(com.yangjun.cms.entity.Jiagong) 
	 */
	@Override
	public void updateid(Jiagong jiagong) {
		// TODO Auto-generated method stub
		jiagongMapper.update(jiagong);
	}
	
}
