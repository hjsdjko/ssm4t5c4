package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YiqingfengxianEntity;
import com.entity.view.YiqingfengxianView;

import com.service.YiqingfengxianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 疫情风险
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-11 14:38:57
 */
@RestController
@RequestMapping("/yiqingfengxian")
public class YiqingfengxianController {
    @Autowired
    private YiqingfengxianService yiqingfengxianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YiqingfengxianEntity yiqingfengxian, 
		HttpServletRequest request){

        EntityWrapper<YiqingfengxianEntity> ew = new EntityWrapper<YiqingfengxianEntity>();
		PageUtils page = yiqingfengxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingfengxian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YiqingfengxianEntity yiqingfengxian, 
		HttpServletRequest request){
        EntityWrapper<YiqingfengxianEntity> ew = new EntityWrapper<YiqingfengxianEntity>();
		PageUtils page = yiqingfengxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingfengxian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YiqingfengxianEntity yiqingfengxian){
       	EntityWrapper<YiqingfengxianEntity> ew = new EntityWrapper<YiqingfengxianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yiqingfengxian, "yiqingfengxian")); 
        return R.ok().put("data", yiqingfengxianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YiqingfengxianEntity yiqingfengxian){
        EntityWrapper< YiqingfengxianEntity> ew = new EntityWrapper< YiqingfengxianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yiqingfengxian, "yiqingfengxian")); 
		YiqingfengxianView yiqingfengxianView =  yiqingfengxianService.selectView(ew);
		return R.ok("查询疫情风险成功").put("data", yiqingfengxianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YiqingfengxianEntity yiqingfengxian = yiqingfengxianService.selectById(id);
        return R.ok().put("data", yiqingfengxian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YiqingfengxianEntity yiqingfengxian = yiqingfengxianService.selectById(id);
        return R.ok().put("data", yiqingfengxian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YiqingfengxianEntity yiqingfengxian, HttpServletRequest request){
    	yiqingfengxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingfengxian);

        yiqingfengxianService.insert(yiqingfengxian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YiqingfengxianEntity yiqingfengxian, HttpServletRequest request){
    	yiqingfengxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingfengxian);

        yiqingfengxianService.insert(yiqingfengxian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YiqingfengxianEntity yiqingfengxian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yiqingfengxian);
        yiqingfengxianService.updateById(yiqingfengxian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yiqingfengxianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YiqingfengxianEntity> wrapper = new EntityWrapper<YiqingfengxianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yiqingfengxianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
