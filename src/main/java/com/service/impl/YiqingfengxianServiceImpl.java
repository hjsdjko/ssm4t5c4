package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiqingfengxianDao;
import com.entity.YiqingfengxianEntity;
import com.service.YiqingfengxianService;
import com.entity.vo.YiqingfengxianVO;
import com.entity.view.YiqingfengxianView;

@Service("yiqingfengxianService")
public class YiqingfengxianServiceImpl extends ServiceImpl<YiqingfengxianDao, YiqingfengxianEntity> implements YiqingfengxianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingfengxianEntity> page = this.selectPage(
                new Query<YiqingfengxianEntity>(params).getPage(),
                new EntityWrapper<YiqingfengxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingfengxianEntity> wrapper) {
		  Page<YiqingfengxianView> page =new Query<YiqingfengxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingfengxianVO> selectListVO(Wrapper<YiqingfengxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingfengxianVO selectVO(Wrapper<YiqingfengxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingfengxianView> selectListView(Wrapper<YiqingfengxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingfengxianView selectView(Wrapper<YiqingfengxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
