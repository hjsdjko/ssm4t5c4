package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouwangonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouwangonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouwangonglveView;


/**
 * 游玩攻略评论表
 *
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface DiscussyouwangonglveService extends IService<DiscussyouwangonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouwangonglveVO> selectListVO(Wrapper<DiscussyouwangonglveEntity> wrapper);
   	
   	DiscussyouwangonglveVO selectVO(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
   	
   	List<DiscussyouwangonglveView> selectListView(Wrapper<DiscussyouwangonglveEntity> wrapper);
   	
   	DiscussyouwangonglveView selectView(@Param("ew") Wrapper<DiscussyouwangonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouwangonglveEntity> wrapper);
   	
}

