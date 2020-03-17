/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: ZhizaoMapper.java 
 * @Prject: yangjun_product
 * @Package: com.yangjun.cms.dao 
 * @Description: TODO
 * @author: Y   
 * @date: 2020年3月17日 上午11:15:18 
 * @version: V1.0   
 */
package com.yangjun.cms.dao;

import java.util.List;

import com.yangjun.cms.entity.Jiagong;

/** 
 * @ClassName: ZhizaoMapper 
 * @Description: TODO
 * @author: Y
 * @date: 2020年3月17日 上午11:15:18  
 */
public interface JiagongMapper {
	int Insert (Jiagong jiagong);
	
	List<Jiagong> selects(Jiagong jiagong);

	/** 
	 * @Title: selectsbyid 
	 * @Description: TODO
	 * @param jiagong
	 * @return
	 * @return: Jiagong
	 */
	Jiagong selectsbyid(Jiagong jiagong);

	/** 
	 * @Title: update 
	 * @Description: TODO
	 * @param jiagong
	 * @return: void
	 */
	void update(Jiagong jiagong);
}
