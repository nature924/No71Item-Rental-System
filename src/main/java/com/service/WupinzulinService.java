package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinzulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinzulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinzulinView;


/**
 * 物品租赁
 *
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public interface WupinzulinService extends IService<WupinzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinzulinVO> selectListVO(Wrapper<WupinzulinEntity> wrapper);
   	
   	WupinzulinVO selectVO(@Param("ew") Wrapper<WupinzulinEntity> wrapper);
   	
   	List<WupinzulinView> selectListView(Wrapper<WupinzulinEntity> wrapper);
   	
   	WupinzulinView selectView(@Param("ew") Wrapper<WupinzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinzulinEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WupinzulinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WupinzulinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WupinzulinEntity> wrapper);



}

