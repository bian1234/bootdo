package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-05-04 13:08:03
 */
public class BloodGroupDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String id;
	//
	private String bloodGroupName;
	//
	private String bloodGroupNumber;
	//
	private String orderWeight;
	//
	private String createUser;
	//
	private Date createTime;
	//
	private String updateUser;
	//
	private Date updateTime;
	//
	private String deleteUser;
	//
	private Date deleteTime;
	//
	private String delFlag;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}
	/**
	 * 获取：
	 */
	public String getBloodGroupName() {
		return bloodGroupName;
	}
	/**
	 * 设置：
	 */
	public void setBloodGroupNumber(String bloodGroupNumber) {
		this.bloodGroupNumber = bloodGroupNumber;
	}
	/**
	 * 获取：
	 */
	public String getBloodGroupNumber() {
		return bloodGroupNumber;
	}
	/**
	 * 设置：
	 */
	public void setOrderWeight(String orderWeight) {
		this.orderWeight = orderWeight;
	}
	/**
	 * 获取：
	 */
	public String getOrderWeight() {
		return orderWeight;
	}
	/**
	 * 设置：
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}
	/**
	 * 获取：
	 */
	public String getDeleteUser() {
		return deleteUser;
	}
	/**
	 * 设置：
	 */
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	/**
	 * 获取：
	 */
	public Date getDeleteTime() {
		return deleteTime;
	}
	/**
	 * 设置：
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：
	 */
	public String getDelFlag() {
		return delFlag;
	}

	@Override
	public String toString() {
		return "BloodGroupDO{" +
				"bloodGroupName='" + bloodGroupName + '\'' +
				", bloodGroupNumber='" + bloodGroupNumber + '\'' +
				", orderWeight='" + orderWeight + '\'' +
				'}';
	}
}
