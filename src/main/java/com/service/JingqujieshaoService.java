package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqujieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqujieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqujieshaoView;


/**
 * 景区介绍
 *
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface JingqujieshaoService extends IService<JingqujieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqujieshaoVO> selectListVO(Wrapper<JingqujieshaoEntity> wrapper);
   	
   	JingqujieshaoVO selectVO(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
   	
   	List<JingqujieshaoView> selectListView(Wrapper<JingqujieshaoEntity> wrapper);
   	
   	JingqujieshaoView selectView(@Param("ew") Wrapper<JingqujieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqujieshaoEntity> wrapper);
   	
}

