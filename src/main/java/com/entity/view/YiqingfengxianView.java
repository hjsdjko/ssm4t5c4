package com.entity.view;

import com.entity.YiqingfengxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情风险
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@TableName("yiqingfengxian")
public class YiqingfengxianView  extends YiqingfengxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingfengxianView(){
	}
 
 	public YiqingfengxianView(YiqingfengxianEntity yiqingfengxianEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingfengxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
