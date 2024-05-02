package com.dao;

import com.entity.DiscussjingqujieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingqujieshaoVO;
import com.entity.view.DiscussjingqujieshaoView;


/**
 * 景区介绍评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface DiscussjingqujieshaoDao extends BaseMapper<DiscussjingqujieshaoEntity> {
	
	List<DiscussjingqujieshaoVO> selectListVO(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
	
	DiscussjingqujieshaoVO selectVO(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
	
	List<DiscussjingqujieshaoView> selectListView(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);

	List<DiscussjingqujieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
	
	DiscussjingqujieshaoView selectView(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
	
}
