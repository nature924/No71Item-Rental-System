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


import com.dao.GonggaoleixingDao;
import com.entity.GonggaoleixingEntity;
import com.service.GonggaoleixingService;
import com.entity.vo.GonggaoleixingVO;
import com.entity.view.GonggaoleixingView;

@Service("gonggaoleixingService")
public class GonggaoleixingServiceImpl extends ServiceImpl<GonggaoleixingDao, GonggaoleixingEntity> implements GonggaoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaoleixingEntity> page = this.selectPage(
                new Query<GonggaoleixingEntity>(params).getPage(),
                new EntityWrapper<GonggaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaoleixingEntity> wrapper) {
		  Page<GonggaoleixingView> page =new Query<GonggaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaoleixingVO> selectListVO(Wrapper<GonggaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaoleixingVO selectVO(Wrapper<GonggaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaoleixingView> selectListView(Wrapper<GonggaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaoleixingView selectView(Wrapper<GonggaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
