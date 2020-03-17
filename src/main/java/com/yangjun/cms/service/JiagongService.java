/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: JiagongService.java 
 * @Prject: yangjun_product
 * @Package: com.yangjun.cms.service 
 * @Description: TODO
 * @author: Y   
 * @date: 2020年3月17日 上午11:21:58 
 * @version: V1.0   
 */
package com.yangjun.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yangjun.cms.entity.Jiagong;

/** 
 * @ClassName: JiagongService 
 * @Description: TODO
 * @author: Y
 * @date: 2020年3月17日 上午11:21:58  
 */
public interface JiagongService {
	int Insert (Jiagong jiagong);
	
	PageInfo<Jiagong> selects(Jiagong jiagong,Integer page,Integer pageSize);

	/** 
	 * @Title: selectbyid 
	 * @Description: TODO
	 * @param jiagong
	 * @return
	 * @return: Jiagong
	 */
	Jiagong selectbyid(Jiagong jiagong);

	/** 
	 * @Title: updateid 
	 * @Description: TODO
	 * @param jiagong
	 * @return: void
	 */
	void updateid(Jiagong jiagong);
}
