package com.entity.model;

import com.entity.JingqujieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 景区介绍
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public class JingqujieshaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景区地址
	 */
	
	private String jingqudizhi;
		
	/**
	 * 景区等级
	 */
	
	private String jingqudengji;
		
	/**
	 * 景区介绍
	 */
	
	private String jingqujieshao;
		
	/**
	 * 门票价格
	 */
	
	private Integer menpiaojiage;
		
	/**
	 * 空气状况
	 */
	
	private String kongqizhuangkuang;
		
	/**
	 * 雾霾状况
	 */
	
	private String wumaizhuangkuang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 景区热线
	 */
	
	private String jingqurexian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：景区等级
	 */
	 
	public void setJingqudengji(String jingqudengji) {
		this.jingqudengji = jingqudengji;
	}
	
	/**
	 * 获取：景区等级
	 */
	public String getJingqudengji() {
		return jingqudengji;
	}
				
	
	/**
	 * 设置：景区介绍
	 */
	 
	public void setJingqujieshao(String jingqujieshao) {
		this.jingqujieshao = jingqujieshao;
	}
	
	/**
	 * 获取：景区介绍
	 */
	public String getJingqujieshao() {
		return jingqujieshao;
	}
				
	
	/**
	 * 设置：门票价格
	 */
	 
	public void setMenpiaojiage(Integer menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	
	/**
	 * 获取：门票价格
	 */
	public Integer getMenpiaojiage() {
		return menpiaojiage;
	}
				
	
	/**
	 * 设置：空气状况
	 */
	 
	public void setKongqizhuangkuang(String kongqizhuangkuang) {
		this.kongqizhuangkuang = kongqizhuangkuang;
	}
	
	/**
	 * 获取：空气状况
	 */
	public String getKongqizhuangkuang() {
		return kongqizhuangkuang;
	}
				
	
	/**
	 * 设置：雾霾状况
	 */
	 
	public void setWumaizhuangkuang(String wumaizhuangkuang) {
		this.wumaizhuangkuang = wumaizhuangkuang;
	}
	
	/**
	 * 获取：雾霾状况
	 */
	public String getWumaizhuangkuang() {
		return wumaizhuangkuang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：景区热线
	 */
	 
	public void setJingqurexian(String jingqurexian) {
		this.jingqurexian = jingqurexian;
	}
	
	/**
	 * 获取：景区热线
	 */
	public String getJingqurexian() {
		return jingqurexian;
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
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
