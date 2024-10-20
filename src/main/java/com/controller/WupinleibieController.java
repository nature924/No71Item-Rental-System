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

import com.entity.WupinleibieEntity;
import com.entity.view.WupinleibieView;

import com.service.WupinleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物品类别
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
@RestController
@RequestMapping("/wupinleibie")
public class WupinleibieController {
    @Autowired
    private WupinleibieService wupinleibieService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WupinleibieEntity wupinleibie,
		HttpServletRequest request){
        EntityWrapper<WupinleibieEntity> ew = new EntityWrapper<WupinleibieEntity>();

		PageUtils page = wupinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WupinleibieEntity wupinleibie, 
		HttpServletRequest request){
        EntityWrapper<WupinleibieEntity> ew = new EntityWrapper<WupinleibieEntity>();

		PageUtils page = wupinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinleibie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WupinleibieEntity wupinleibie){
       	EntityWrapper<WupinleibieEntity> ew = new EntityWrapper<WupinleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wupinleibie, "wupinleibie")); 
        return R.ok().put("data", wupinleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WupinleibieEntity wupinleibie){
        EntityWrapper< WupinleibieEntity> ew = new EntityWrapper< WupinleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wupinleibie, "wupinleibie")); 
		WupinleibieView wupinleibieView =  wupinleibieService.selectView(ew);
		return R.ok("查询物品类别成功").put("data", wupinleibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WupinleibieEntity wupinleibie = wupinleibieService.selectById(id);
        return R.ok().put("data", wupinleibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WupinleibieEntity wupinleibie = wupinleibieService.selectById(id);
        return R.ok().put("data", wupinleibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WupinleibieEntity wupinleibie, HttpServletRequest request){
    	wupinleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinleibie);
        wupinleibieService.insert(wupinleibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WupinleibieEntity wupinleibie, HttpServletRequest request){
    	wupinleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinleibie);
        wupinleibieService.insert(wupinleibie);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WupinleibieEntity wupinleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wupinleibie);
        wupinleibieService.updateById(wupinleibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wupinleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
