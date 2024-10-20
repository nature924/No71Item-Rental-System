package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GonggaoleixingEntity;
import com.entity.view.GonggaoleixingView;

import com.service.GonggaoleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 公告类型
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-01 12:14:49
 */
@RestController
@RequestMapping("/gonggaoleixing")
public class GonggaoleixingController {
    @Autowired
    private GonggaoleixingService gonggaoleixingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggaoleixingEntity gonggaoleixing,
		HttpServletRequest request){
        EntityWrapper<GonggaoleixingEntity> ew = new EntityWrapper<GonggaoleixingEntity>();

		PageUtils page = gonggaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaoleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggaoleixingEntity gonggaoleixing, 
		HttpServletRequest request){
        EntityWrapper<GonggaoleixingEntity> ew = new EntityWrapper<GonggaoleixingEntity>();

		PageUtils page = gonggaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaoleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggaoleixingEntity gonggaoleixing){
       	EntityWrapper<GonggaoleixingEntity> ew = new EntityWrapper<GonggaoleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggaoleixing, "gonggaoleixing")); 
        return R.ok().put("data", gonggaoleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggaoleixingEntity gonggaoleixing){
        EntityWrapper< GonggaoleixingEntity> ew = new EntityWrapper< GonggaoleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggaoleixing, "gonggaoleixing")); 
		GonggaoleixingView gonggaoleixingView =  gonggaoleixingService.selectView(ew);
		return R.ok("查询公告类型成功").put("data", gonggaoleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GonggaoleixingEntity gonggaoleixing = gonggaoleixingService.selectById(id);
        return R.ok().put("data", gonggaoleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GonggaoleixingEntity gonggaoleixing = gonggaoleixingService.selectById(id);
        return R.ok().put("data", gonggaoleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggaoleixingEntity gonggaoleixing, HttpServletRequest request){
    	gonggaoleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaoleixing);
        gonggaoleixingService.insert(gonggaoleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggaoleixingEntity gonggaoleixing, HttpServletRequest request){
    	gonggaoleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaoleixing);
        gonggaoleixingService.insert(gonggaoleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GonggaoleixingEntity gonggaoleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggaoleixing);
        gonggaoleixingService.updateById(gonggaoleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggaoleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
