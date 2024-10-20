package com.entity.model;

import com.entity.WupinzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物品租赁
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public class WupinzulinModel  implements Serializable {
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
	 * 新旧程度
	 */
	
	private String xinjiuchengdu;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 押金
	 */
	
	private Integer yajin;
		
	/**
	 * 租赁数量
	 */
	
	private Integer wupinshuliang;
		
	/**
	 * 租赁时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zulinshijian;
		
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
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：新旧程度
	 */
	 
	public void setXinjiuchengdu(String xinjiuchengdu) {
		this.xinjiuchengdu = xinjiuchengdu;
	}
	
	/**
	 * 获取：新旧程度
	 */
	public String getXinjiuchengdu() {
		return xinjiuchengdu;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：押金
	 */
	 
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：租赁数量
	 */
	 
	public void setWupinshuliang(Integer wupinshuliang) {
		this.wupinshuliang = wupinshuliang;
	}
	
	/**
	 * 获取：租赁数量
	 */
	public Integer getWupinshuliang() {
		return wupinshuliang;
	}
				
	
	/**
	 * 设置：租赁时间
	 */
	 
	public void setZulinshijian(Date zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	
	/**
	 * 获取：租赁时间
	 */
	public Date getZulinshijian() {
		return zulinshijian;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
