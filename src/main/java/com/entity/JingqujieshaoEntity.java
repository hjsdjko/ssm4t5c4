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
 * 景区介绍
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@TableName("jingqujieshao")
public class JingqujieshaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingqujieshaoEntity() {
		
	}
	
	public JingqujieshaoEntity(T t) {
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
