package com.dao;

import com.entity.WupinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinxinxiVO;
import com.entity.view.WupinxinxiView;


/**
 * 物品信息
 * 
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinxinxiDao extends BaseMapper<WupinxinxiEntity> {
	
	List<WupinxinxiVO> selectListVO(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	WupinxinxiVO selectVO(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	List<WupinxinxiView> selectListView(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);

	List<WupinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	WupinxinxiView selectView(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinxinxiEntity> wrapper);



}
