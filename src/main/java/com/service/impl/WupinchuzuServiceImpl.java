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


import com.dao.WupinchuzuDao;
import com.entity.WupinchuzuEntity;
import com.service.WupinchuzuService;
import com.entity.vo.WupinchuzuVO;
import com.entity.view.WupinchuzuView;

@Service("wupinchuzuService")
public class WupinchuzuServiceImpl extends ServiceImpl<WupinchuzuDao, WupinchuzuEntity> implements WupinchuzuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinchuzuEntity> page = this.selectPage(
                new Query<WupinchuzuEntity>(params).getPage(),
                new EntityWrapper<WupinchuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinchuzuEntity> wrapper) {
		  Page<WupinchuzuView> page =new Query<WupinchuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinchuzuVO> selectListVO(Wrapper<WupinchuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinchuzuVO selectVO(Wrapper<WupinchuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinchuzuView> selectListView(Wrapper<WupinchuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinchuzuView selectView(Wrapper<WupinchuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WupinchuzuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WupinchuzuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WupinchuzuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
