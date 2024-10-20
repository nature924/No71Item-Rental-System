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


import com.dao.DiscusswupinxinxiDao;
import com.entity.DiscusswupinxinxiEntity;
import com.service.DiscusswupinxinxiService;
import com.entity.vo.DiscusswupinxinxiVO;
import com.entity.view.DiscusswupinxinxiView;

@Service("discusswupinxinxiService")
public class DiscusswupinxinxiServiceImpl extends ServiceImpl<DiscusswupinxinxiDao, DiscusswupinxinxiEntity> implements DiscusswupinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswupinxinxiEntity> page = this.selectPage(
                new Query<DiscusswupinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusswupinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswupinxinxiEntity> wrapper) {
		  Page<DiscusswupinxinxiView> page =new Query<DiscusswupinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswupinxinxiVO> selectListVO(Wrapper<DiscusswupinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswupinxinxiVO selectVO(Wrapper<DiscusswupinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswupinxinxiView> selectListView(Wrapper<DiscusswupinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswupinxinxiView selectView(Wrapper<DiscusswupinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
