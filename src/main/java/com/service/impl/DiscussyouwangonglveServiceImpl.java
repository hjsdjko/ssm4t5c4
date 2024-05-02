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


import com.dao.DiscussyouwangonglveDao;
import com.entity.DiscussyouwangonglveEntity;
import com.service.DiscussyouwangonglveService;
import com.entity.vo.DiscussyouwangonglveVO;
import com.entity.view.DiscussyouwangonglveView;

@Service("discussyouwangonglveService")
public class DiscussyouwangonglveServiceImpl extends ServiceImpl<DiscussyouwangonglveDao, DiscussyouwangonglveEntity> implements DiscussyouwangonglveService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouwangonglveEntity> page = this.selectPage(
                new Query<DiscussyouwangonglveEntity>(params).getPage(),
                new EntityWrapper<DiscussyouwangonglveEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouwangonglveEntity> wrapper) {
		  Page<DiscussyouwangonglveView> page =new Query<DiscussyouwangonglveView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouwangonglveVO> selectListVO(Wrapper<DiscussyouwangonglveEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouwangonglveVO selectVO(Wrapper<DiscussyouwangonglveEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouwangonglveView> selectListView(Wrapper<DiscussyouwangonglveEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouwangonglveView selectView(Wrapper<DiscussyouwangonglveEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
