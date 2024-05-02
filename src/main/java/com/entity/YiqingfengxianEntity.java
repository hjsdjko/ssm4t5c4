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
 * 疫情风险
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@TableName("yiqingfengxian")
public class YiqingfengxianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqingfengxianEntity() {
		
	}
	
	public YiqingfengxianEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	
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
