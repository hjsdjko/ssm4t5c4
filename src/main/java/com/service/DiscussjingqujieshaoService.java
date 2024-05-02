package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingqujieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingqujieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingqujieshaoView;


/**
 * 景区介绍评论表
 *
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface DiscussjingqujieshaoService extends IService<DiscussjingqujieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingqujieshaoVO> selectListVO(Wrapper<DiscussjingqujieshaoEntity> wrapper);
   	
   	DiscussjingqujieshaoVO selectVO(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
   	
   	List<DiscussjingqujieshaoView> selectListView(Wrapper<DiscussjingqujieshaoEntity> wrapper);
   	
   	DiscussjingqujieshaoView selectView(@Param("ew") Wrapper<DiscussjingqujieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingqujieshaoEntity> wrapper);
   	
}

