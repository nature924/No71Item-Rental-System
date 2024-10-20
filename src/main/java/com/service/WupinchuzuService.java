package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinchuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinchuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinchuzuView;


/**
 * 物品出租
 *
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinchuzuService extends IService<WupinchuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinchuzuVO> selectListVO(Wrapper<WupinchuzuEntity> wrapper);
   	
   	WupinchuzuVO selectVO(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
   	
   	List<WupinchuzuView> selectListView(Wrapper<WupinchuzuEntity> wrapper);
   	
   	WupinchuzuView selectView(@Param("ew") Wrapper<WupinchuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinchuzuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WupinchuzuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WupinchuzuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WupinchuzuEntity> wrapper);



}

