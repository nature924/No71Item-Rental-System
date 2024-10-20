package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaoleixingView;


/**
 * 公告类型
 *
 * @author 
 * @email 
 * @date 2023-05-01 12:14:49
 */
public interface GonggaoleixingService extends IService<GonggaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaoleixingVO> selectListVO(Wrapper<GonggaoleixingEntity> wrapper);
   	
   	GonggaoleixingVO selectVO(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
   	
   	List<GonggaoleixingView> selectListView(Wrapper<GonggaoleixingEntity> wrapper);
   	
   	GonggaoleixingView selectView(@Param("ew") Wrapper<GonggaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaoleixingEntity> wrapper);
   	

}

