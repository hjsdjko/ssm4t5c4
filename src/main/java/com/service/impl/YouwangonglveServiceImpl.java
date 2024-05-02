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


import com.dao.YouwangonglveDao;
import com.entity.YouwangonglveEntity;
import com.service.YouwangonglveService;
import com.entity.vo.YouwangonglveVO;
import com.entity.view.YouwangonglveView;

@Service("youwangonglveService")
public class YouwangonglveServiceImpl extends ServiceImpl<YouwangonglveDao, YouwangonglveEntity> implements YouwangonglveService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouwangonglveEntity> page = this.selectPage(
                new Query<YouwangonglveEntity>(params).getPage(),
                new EntityWrapper<YouwangonglveEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouwangonglveEntity> wrapper) {
		  Page<YouwangonglveView> page =new Query<YouwangonglveView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouwangonglveVO> selectListVO(Wrapper<YouwangonglveEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouwangonglveVO selectVO(Wrapper<YouwangonglveEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouwangonglveView> selectListView(Wrapper<YouwangonglveEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouwangonglveView selectView(Wrapper<YouwangonglveEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
