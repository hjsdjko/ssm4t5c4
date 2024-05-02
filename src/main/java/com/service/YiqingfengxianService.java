package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingfengxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingfengxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingfengxianView;


/**
 * 疫情风险
 *
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
public interface YiqingfengxianService extends IService<YiqingfengxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingfengxianVO> selectListVO(Wrapper<YiqingfengxianEntity> wrapper);
   	
   	YiqingfengxianVO selectVO(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
   	
   	List<YiqingfengxianView> selectListView(Wrapper<YiqingfengxianEntity> wrapper);
   	
   	YiqingfengxianView selectView(@Param("ew") Wrapper<YiqingfengxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingfengxianEntity> wrapper);
   	
}

