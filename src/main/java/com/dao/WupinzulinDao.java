package com.dao;

import com.entity.WupinzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinzulinVO;
import com.entity.view.WupinzulinView;


/**
 * 物品租赁
 * 
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinzulinDao extends BaseMapper<WupinzulinEntity> {
	
	List<WupinzulinVO> selectListVO(@Param("ew") Wrapper<WupinzulinEntity> wrapper);
	
	WupinzulinVO selectVO(@Param("ew") Wrapper<WupinzulinEntity> wrapper);
	
	List<WupinzulinView> selectListView(@Param("ew") Wrapper<WupinzulinEntity> wrapper);

	List<WupinzulinView> selectListView(Pagination page,@Param("ew") Wrapper<WupinzulinEntity> wrapper);
	
	WupinzulinView selectView(@Param("ew") Wrapper<WupinzulinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinzulinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinzulinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WupinzulinEntity> wrapper);



}
