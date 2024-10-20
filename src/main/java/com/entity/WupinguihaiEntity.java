package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 物品归还
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-01 12:14:50
 */
@TableName("wupinguihai")
public class WupinguihaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WupinguihaiEntity() {
		
	}
	
	public WupinguihaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 物品编号
	 */
					
	private String wupinbianhao;
	
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
	 * 物品状态
	 */
					
	private String wupinzhuangtai;
	
	/**
	 * 归还数量
	 */
					
	private Integer wupinshuliang;
	
	/**
	 * 租金
	 */
					
	private Integer zujin;
	
	/**
	 * 租赁时间
	 */
					
	private String zulinshijian;
	
	/**
	 * 押金
	 */
					
	private Integer yajin;
	
	/**
	 * 总价格
	 */
					
	private Integer zongjiage;
	
	/**
	 * 归还时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date guihaishijian;
	
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
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：物品编号
	 */
	public void setWupinbianhao(String wupinbianhao) {
		this.wupinbianhao = wupinbianhao;
	}
	/**
	 * 获取：物品编号
	 */
	public String getWupinbianhao() {
		return wupinbianhao;
	}
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
	 * 设置：物品状态
	 */
	public void setWupinzhuangtai(String wupinzhuangtai) {
		this.wupinzhuangtai = wupinzhuangtai;
	}
	/**
	 * 获取：物品状态
	 */
	public String getWupinzhuangtai() {
		return wupinzhuangtai;
	}
	/**
	 * 设置：归还数量
	 */
	public void setWupinshuliang(Integer wupinshuliang) {
		this.wupinshuliang = wupinshuliang;
	}
	/**
	 * 获取：归还数量
	 */
	public Integer getWupinshuliang() {
		return wupinshuliang;
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
	 * 设置：租赁时间
	 */
	public void setZulinshijian(String zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	/**
	 * 获取：租赁时间
	 */
	public String getZulinshijian() {
		return zulinshijian;
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
	 * 设置：总价格
	 */
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
	/**
	 * 设置：归还时间
	 */
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
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
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
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
