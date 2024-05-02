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


import com.dao.JingqujieshaoDao;
import com.entity.JingqujieshaoEntity;
import com.service.JingqujieshaoService;
import com.entity.vo.JingqujieshaoVO;
import com.entity.view.JingqujieshaoView;

@Service("jingqujieshaoService")
public class JingqujieshaoServiceImpl extends ServiceImpl<JingqujieshaoDao, JingqujieshaoEntity> implements JingqujieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqujieshaoEntity> page = this.selectPage(
                new Query<JingqujieshaoEntity>(params).getPage(),
                new EntityWrapper<JingqujieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqujieshaoEntity> wrapper) {
		  Page<JingqujieshaoView> page =new Query<JingqujieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqujieshaoVO> selectListVO(Wrapper<JingqujieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqujieshaoVO selectVO(Wrapper<JingqujieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqujieshaoView> selectListView(Wrapper<JingqujieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqujieshaoView selectView(Wrapper<JingqujieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
