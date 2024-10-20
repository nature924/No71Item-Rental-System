package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswupinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswupinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswupinxinxiView;


/**
 * 物品信息评论表
 *
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface DiscusswupinxinxiService extends IService<DiscusswupinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswupinxinxiVO> selectListVO(Wrapper<DiscusswupinxinxiEntity> wrapper);
   	
   	DiscusswupinxinxiVO selectVO(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
   	
   	List<DiscusswupinxinxiView> selectListView(Wrapper<DiscusswupinxinxiEntity> wrapper);
   	
   	DiscusswupinxinxiView selectView(@Param("ew") Wrapper<DiscusswupinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswupinxinxiEntity> wrapper);
   	

}

