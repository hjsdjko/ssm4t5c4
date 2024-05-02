package com.dao;

import com.entity.DiscussyouwangonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouwangonglveVO;
import com.entity.view.DiscussyouwangonglveView;


/**
 * 游玩攻略评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface DiscussyouwangonglveDao extends BaseMapper<DiscussyouwangonglveEntity> {
	
	List<DiscussyouwangonglveVO> selectListVO(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
	
	DiscussyouwangonglveVO selectVO(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
	
	List<DiscussyouwangonglveView> selectListView(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);

	List<DiscussyouwangonglveView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
	
	DiscussyouwangonglveView selectView(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
	
}
