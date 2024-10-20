package com.dao;

import com.entity.WupinchuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinchuzuVO;
import com.entity.view.WupinchuzuView;


/**
 * 物品出租
 * 
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinchuzuDao extends BaseMapper<WupinchuzuEntity> {
	
	List<WupinchuzuVO> selectListVO(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
	
	WupinchuzuVO selectVO(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
	
	List<WupinchuzuView> selectListView(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);

	List<WupinchuzuView> selectListView(Pagination page,@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
	
	WupinchuzuView selectView(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinchuzuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinchuzuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinchuzuEntity> wrapper);



}
