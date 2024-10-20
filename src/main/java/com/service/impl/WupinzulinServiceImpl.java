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


import com.dao.WupinzulinDao;
import com.entity.WupinzulinEntity;
import com.service.WupinzulinService;
import com.entity.vo.WupinzulinVO;
import com.entity.view.WupinzulinView;

@Service("wupinzulinService")
public class WupinzulinServiceImpl extends ServiceImpl<WupinzulinDao, WupinzulinEntity> implements WupinzulinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinzulinEntity> page = this.selectPage(
                new Query<WupinzulinEntity>(params).getPage(),
                new EntityWrapper<WupinzulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinzulinEntity> wrapper) {
		  Page<WupinzulinView> page =new Query<WupinzulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinzulinVO> selectListVO(Wrapper<WupinzulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinzulinVO selectVO(Wrapper<WupinzulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinzulinView> selectListView(Wrapper<WupinzulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinzulinView selectView(Wrapper<WupinzulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WupinzulinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WupinzulinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WupinzulinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
