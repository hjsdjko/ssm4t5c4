package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouwangonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouwangonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwangonglveView;


/**
 * 游玩攻略
 *
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface YouwangonglveService extends IService<YouwangonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouwangonglveVO> selectListVO(Wrapper<YouwangonglveEntity> wrapper);
   	
   	YouwangonglveVO selectVO(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
   	
   	List<YouwangonglveView> selectListView(Wrapper<YouwangonglveEntity> wrapper);
   	
   	YouwangonglveView selectView(@Param("ew") Wrapper<YouwangonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouwangonglveEntity> wrapper);
   	
}

