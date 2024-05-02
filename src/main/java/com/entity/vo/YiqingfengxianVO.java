package com.entity.vo;

import com.entity.YiqingfengxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫情风险
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public class YiqingfengxianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景区地址
	 */
	
	private String jingqudizhi;
		
	/**
	 * 确诊病例
	 */
	
	private String quezhenbingli;
		
	/**
	 * 疫情状况
	 */
	
	private String yiqingzhuangkuang;
		
	/**
	 * 风险等级
	 */
	
	private String fengxiandengji;
		
	/**
	 * 防疫措施
	 */
	
	private String fangyicuoshi;
		
	/**
	 * 更新日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinriqi;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
				
	
	/**
	 * 设置：景区地址
	 */
	 
	public void setJingqudizhi(String jingqudizhi) {
		this.jingqudizhi = jingqudizhi;
	}
	
	/**
	 * 获取：景区地址
	 */
	public String getJingqudizhi() {
		return jingqudizhi;
	}
				
	
	/**
	 * 设置：确诊病例
	 */
	 
	public void setQuezhenbingli(String quezhenbingli) {
		this.quezhenbingli = quezhenbingli;
	}
	
	/**
	 * 获取：确诊病例
	 */
	public String getQuezhenbingli() {
		return quezhenbingli;
	}
				
	
	/**
	 * 设置：疫情状况
	 */
	 
	public void setYiqingzhuangkuang(String yiqingzhuangkuang) {
		this.yiqingzhuangkuang = yiqingzhuangkuang;
	}
	
	/**
	 * 获取：疫情状况
	 */
	public String getYiqingzhuangkuang() {
		return yiqingzhuangkuang;
	}
				
	
	/**
	 * 设置：风险等级
	 */
	 
	public void setFengxiandengji(String fengxiandengji) {
		this.fengxiandengji = fengxiandengji;
	}
	
	/**
	 * 获取：风险等级
	 */
	public String getFengxiandengji() {
		return fengxiandengji;
	}
				
	
	/**
	 * 设置：防疫措施
	 */
	 
	public void setFangyicuoshi(String fangyicuoshi) {
		this.fangyicuoshi = fangyicuoshi;
	}
	
	/**
	 * 获取：防疫措施
	 */
	public String getFangyicuoshi() {
		return fangyicuoshi;
	}
				
	
	/**
	 * 设置：更新日期
	 */
	 
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
			
}
