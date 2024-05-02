package com.dao;

import com.entity.YouwangonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouwangonglveVO;
import com.entity.view.YouwangonglveView;


/**
 * 游玩攻略
 * 
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface YouwangonglveDao extends BaseMapper<YouwangonglveEntity> {
	
	List<YouwangonglveVO> selectListVO(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
	
	YouwangonglveVO selectVO(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
	
	List<YouwangonglveView> selectListView(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);

	List<YouwangonglveView> selectListView(Pagination page,@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
	
	YouwangonglveView selectView(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
	
}
