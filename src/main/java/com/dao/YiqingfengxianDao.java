package com.dao;

import com.entity.YiqingfengxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingfengxianVO;
import com.entity.view.YiqingfengxianView;


/**
 * 疫情风险
 * 
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface YiqingfengxianDao extends BaseMapper<YiqingfengxianEntity> {
	
	List<YiqingfengxianVO> selectListVO(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
	
	YiqingfengxianVO selectVO(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
	
	List<YiqingfengxianView> selectListView(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);

	List<YiqingfengxianView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
	
	YiqingfengxianView selectView(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
	
}
