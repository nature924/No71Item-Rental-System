package com.entity.vo;

import com.entity.WupinchuzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物品出租
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
public class WupinchuzuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 服务区域
	 */
	
	private String fuwuquyu;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 卖方公司
	 */
	
	private String gongsi;
		
	/**
	 * 商家地址
	 */
	
	private String sjdz;
		
	/**
	 * 发帖
	 */
	
	private String fatie;
		
	/**
	 * 来源
	 */
	
	private String laiyuan;
		
	/**
	 * 店铺介绍
	 */
	
	private String detail;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：服务区域
	 */
	 
	public void setFuwuquyu(String fuwuquyu) {
		this.fuwuquyu = fuwuquyu;
	}
	
	/**
	 * 获取：服务区域
	 */
	public String getFuwuquyu() {
		return fuwuquyu;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：卖方公司
	 */
	 
	public void setGongsi(String gongsi) {
		this.gongsi = gongsi;
	}
	
	/**
	 * 获取：卖方公司
	 */
	public String getGongsi() {
		return gongsi;
	}
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setSjdz(String sjdz) {
		this.sjdz = sjdz;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getSjdz() {
		return sjdz;
	}
				
	
	/**
	 * 设置：发帖
	 */
	 
	public void setFatie(String fatie) {
		this.fatie = fatie;
	}
	
	/**
	 * 获取：发帖
	 */
	public String getFatie() {
		return fatie;
	}
				
	
	/**
	 * 设置：来源
	 */
	 
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	
	/**
	 * 获取：来源
	 */
	public String getLaiyuan() {
		return laiyuan;
	}
				
	
	/**
	 * 设置：店铺介绍
	 */
	 
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	/**
	 * 获取：店铺介绍
	 */
	public String getDetail() {
		return detail;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
