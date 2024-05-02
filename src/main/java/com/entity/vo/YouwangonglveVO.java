package com.entity.vo;

import com.entity.YouwangonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 游玩攻略
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public class YouwangonglveVO  implements Serializable {
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
	 * 旅游费用
	 */
	
	private String lvyoufeiyong;
		
	/**
	 * 推荐景点
	 */
	
	private String tuijianjingdian;
		
	/**
	 * 特色介绍
	 */
	
	private String tesejieshao;
		
	/**
	 * 攻略内容
	 */
	
	private String gonglveneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
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
	 * 设置：旅游费用
	 */
	 
	public void setLvyoufeiyong(String lvyoufeiyong) {
		this.lvyoufeiyong = lvyoufeiyong;
	}
	
	/**
	 * 获取：旅游费用
	 */
	public String getLvyoufeiyong() {
		return lvyoufeiyong;
	}
				
	
	/**
	 * 设置：推荐景点
	 */
	 
	public void setTuijianjingdian(String tuijianjingdian) {
		this.tuijianjingdian = tuijianjingdian;
	}
	
	/**
	 * 获取：推荐景点
	 */
	public String getTuijianjingdian() {
		return tuijianjingdian;
	}
				
	
	/**
	 * 设置：特色介绍
	 */
	 
	public void setTesejieshao(String tesejieshao) {
		this.tesejieshao = tesejieshao;
	}
	
	/**
	 * 获取：特色介绍
	 */
	public String getTesejieshao() {
		return tesejieshao;
	}
				
	
	/**
	 * 设置：攻略内容
	 */
	 
	public void setGonglveneirong(String gonglveneirong) {
		this.gonglveneirong = gonglveneirong;
	}
	
	/**
	 * 获取：攻略内容
	 */
	public String getGonglveneirong() {
		return gonglveneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}
