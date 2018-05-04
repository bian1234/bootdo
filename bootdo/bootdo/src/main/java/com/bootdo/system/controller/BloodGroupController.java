package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.common.utils.Rest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.BloodGroupDO;
import com.bootdo.system.service.BloodGroupService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-05-04 13:08:03
 */
 
@Controller
@RequestMapping("/system/bloodGroup")
public class BloodGroupController {
	@Autowired
	private BloodGroupService bloodGroupService;
	
	@GetMapping()
	@RequiresPermissions("system:bloodGroup:bloodGroup")
	String BloodGroup(){
	    return "system/bloodGroup/bloodGroup";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:bloodGroup:bloodGroup")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BloodGroupDO> bloodGroupList = bloodGroupService.list(query);
		int total = bloodGroupService.count(query);
		PageUtils pageUtils = new PageUtils(bloodGroupList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:bloodGroup:add")
	String add(){
	    return "system/bloodGroup/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:bloodGroup:edit")
	String edit(@PathVariable("id") String id,Model model){
		BloodGroupDO bloodGroup = bloodGroupService.get(id);
		model.addAttribute("bloodGroup", bloodGroup);
	    return "system/bloodGroup/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:bloodGroup:add")
	public Rest save(BloodGroupDO bloodGroup){
		if(bloodGroupService.save(bloodGroup)>0){
			return Rest.ok();
		}
		return Rest.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:bloodGroup:edit")
	public Rest update(BloodGroupDO bloodGroup){
		bloodGroupService.update(bloodGroup);
		return Rest.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:bloodGroup:remove")
	public Rest remove(String id){
		if(bloodGroupService.remove(id)>0){
		return Rest.ok();
		}
		return Rest.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:bloodGroup:batchRemove")
	public Rest remove(@RequestParam("ids[]") String[] ids){
		bloodGroupService.batchRemove(ids);
		return Rest.ok();
	}
	
}
