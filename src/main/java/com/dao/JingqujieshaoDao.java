package com.dao;

import com.entity.JingqujieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqujieshaoVO;
import com.entity.view.JingqujieshaoView;


/**
 * 景区介绍
 * 
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface JingqujieshaoDao extends BaseMapper<JingqujieshaoEntity> {
	
	List<JingqujieshaoVO> selectListVO(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
	
	JingqujieshaoVO selectVO(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
	
	List<JingqujieshaoView> selectListView(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);

	List<JingqujieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
	
	JingqujieshaoView selectView(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
	
}
