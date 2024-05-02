package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 游玩攻略
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@TableName("youwangonglve")
public class YouwangonglveEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouwangonglveEntity() {
		
	}
	
	public YouwangonglveEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 景区名称
	 */
					
	private String jingqumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：景区名称
	 */
	public void setJingqumingcheng(String jingqumingcheng) {
		this.jingqumingcheng = jingqumingcheng;
	}
	/**
	 * 获取：景区名称
	 */
	public String getJingqumingcheng() {
		return jingqumingcheng;
	}
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
