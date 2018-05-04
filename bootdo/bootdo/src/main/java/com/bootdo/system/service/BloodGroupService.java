package com.bootdo.system.service;

import com.bootdo.system.domain.BloodGroupDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-05-04 13:08:03
 */
public interface BloodGroupService {
	
	BloodGroupDO get(String id);
	
	List<BloodGroupDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BloodGroupDO bloodGroup);
	
	int update(BloodGroupDO bloodGroup);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
