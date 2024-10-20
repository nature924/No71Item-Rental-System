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

import com.entity.WupinguihaiEntity;
import com.entity.view.WupinguihaiView;

import com.service.WupinguihaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物品归还
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
@RestController
@RequestMapping("/wupinguihai")
public class WupinguihaiController {
    @Autowired
    private WupinguihaiService wupinguihaiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WupinguihaiEntity wupinguihai,
		HttpServletRequest request){
        EntityWrapper<WupinguihaiEntity> ew = new EntityWrapper<WupinguihaiEntity>();

        String tableName = request.getSession().getAttribute("tableName").toString();
        ew.andNew();
        if(tableName.equals("yonghu")) {
            ew.eq("wodezhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonghu")) {
            ew.or();
            ew.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
        }
		PageUtils page = wupinguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinguihai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WupinguihaiEntity wupinguihai, 
		HttpServletRequest request){
        EntityWrapper<WupinguihaiEntity> ew = new EntityWrapper<WupinguihaiEntity>();

		PageUtils page = wupinguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinguihai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WupinguihaiEntity wupinguihai){
       	EntityWrapper<WupinguihaiEntity> ew = new EntityWrapper<WupinguihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wupinguihai, "wupinguihai")); 
        return R.ok().put("data", wupinguihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WupinguihaiEntity wupinguihai){
        EntityWrapper< WupinguihaiEntity> ew = new EntityWrapper< WupinguihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wupinguihai, "wupinguihai")); 
		WupinguihaiView wupinguihaiView =  wupinguihaiService.selectView(ew);
		return R.ok("查询物品归还成功").put("data", wupinguihaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WupinguihaiEntity wupinguihai = wupinguihaiService.selectById(id);
        return R.ok().put("data", wupinguihai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WupinguihaiEntity wupinguihai = wupinguihaiService.selectById(id);
        return R.ok().put("data", wupinguihai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WupinguihaiEntity wupinguihai, HttpServletRequest request){
    	wupinguihai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinguihai);
        wupinguihaiService.insert(wupinguihai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WupinguihaiEntity wupinguihai, HttpServletRequest request){
    	wupinguihai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinguihai);
        wupinguihaiService.insert(wupinguihai);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WupinguihaiEntity wupinguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wupinguihai);
        wupinguihaiService.updateById(wupinguihai);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wupinguihaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
