package com.entity.view;

import com.entity.WupinzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
@TableName("wupinzulin")
public class WupinzulinView  extends WupinzulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinzulinView(){
	}
 
 	public WupinzulinView(WupinzulinEntity wupinzulinEntity){
 	try {
			BeanUtils.copyProperties(this, wupinzulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
