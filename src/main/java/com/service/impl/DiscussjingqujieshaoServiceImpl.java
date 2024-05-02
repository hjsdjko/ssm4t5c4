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


import com.dao.DiscussjingqujieshaoDao;
import com.entity.DiscussjingqujieshaoEntity;
import com.service.DiscussjingqujieshaoService;
import com.entity.vo.DiscussjingqujieshaoVO;
import com.entity.view.DiscussjingqujieshaoView;

@Service("discussjingqujieshaoService")
public class DiscussjingqujieshaoServiceImpl extends ServiceImpl<DiscussjingqujieshaoDao, DiscussjingqujieshaoEntity> implements DiscussjingqujieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingqujieshaoEntity> page = this.selectPage(
                new Query<DiscussjingqujieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscussjingqujieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingqujieshaoEntity> wrapper) {
		  Page<DiscussjingqujieshaoView> page =new Query<DiscussjingqujieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingqujieshaoVO> selectListVO(Wrapper<DiscussjingqujieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingqujieshaoVO selectVO(Wrapper<DiscussjingqujieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingqujieshaoView> selectListView(Wrapper<DiscussjingqujieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingqujieshaoView selectView(Wrapper<DiscussjingqujieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
