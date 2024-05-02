package com.entity.view;

import com.entity.LianxiwomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 联系我们
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@TableName("lianxiwomen")
public class LianxiwomenView  extends LianxiwomenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LianxiwomenView(){
	}
 
 	public LianxiwomenView(LianxiwomenEntity lianxiwomenEntity){
 	try {
			BeanUtils.copyProperties(this, lianxiwomenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
