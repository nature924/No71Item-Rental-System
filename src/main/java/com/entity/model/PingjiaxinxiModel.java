package com.entity.model;

import com.entity.PingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 评价信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public class PingjiaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 物品类别
	 */
	
	private String wupinleibie;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 信用评价
	 */
	
	private String xinyongpingjia;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 我的账号
	 */
	
	private String wodezhanghao;
		
	/**
	 * 我的姓名
	 */
	
	private String wodexingming;
		
	/**
	 * 我的电话
	 */
	
	private String wodedianhua;
		
	/**
	 * 出租账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 出租姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 出租电话
	 */
	
	private String yonghudianhua;
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：物品类别
	 */
	 
	public void setWupinleibie(String wupinleibie) {
		this.wupinleibie = wupinleibie;
	}
	
	/**
	 * 获取：物品类别
	 */
	public String getWupinleibie() {
		return wupinleibie;
	}
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
	}
				
	
	/**
	 * 设置：信用评价
	 */
	 
	public void setXinyongpingjia(String xinyongpingjia) {
		this.xinyongpingjia = xinyongpingjia;
	}
	
	/**
	 * 获取：信用评价
	 */
	public String getXinyongpingjia() {
		return xinyongpingjia;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
	}
				
	
	/**
	 * 设置：我的账号
	 */
	 
	public void setWodezhanghao(String wodezhanghao) {
		this.wodezhanghao = wodezhanghao;
	}
	
	/**
	 * 获取：我的账号
	 */
	public String getWodezhanghao() {
		return wodezhanghao;
	}
				
	
	/**
	 * 设置：我的姓名
	 */
	 
	public void setWodexingming(String wodexingming) {
		this.wodexingming = wodexingming;
	}
	
	/**
	 * 获取：我的姓名
	 */
	public String getWodexingming() {
		return wodexingming;
	}
				
	
	/**
	 * 设置：我的电话
	 */
	 
	public void setWodedianhua(String wodedianhua) {
		this.wodedianhua = wodedianhua;
	}
	
	/**
	 * 获取：我的电话
	 */
	public String getWodedianhua() {
		return wodedianhua;
	}
				
	
	/**
	 * 设置：出租账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：出租账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：出租姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：出租姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：出租电话
	 */
	 
	public void setYonghudianhua(String yonghudianhua) {
		this.yonghudianhua = yonghudianhua;
	}
	
	/**
	 * 获取：出租电话
	 */
	public String getYonghudianhua() {
		return yonghudianhua;
	}
			
}
