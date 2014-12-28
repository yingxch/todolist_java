/**
 * 
 */
package com.vizzlab.todolist.biz.ao.impl;

import java.util.List;

import com.google.common.collect.Lists;
import com.vizzlab.todolist.biz.ao.UserAO;
import com.vizzlab.todolist.biz.domain.User;
import com.vizzlab.todolist.biz.manager.UserManager;

/**
 * @description
 * @author daoming.yxc
 * @date 2014-12-28 ÏÂÎç4:40:43
 */
public class UserAOImpl implements UserAO {

	private UserManager userManager;
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@Override
	public List<User> getUserList() {
		
		try {
			return userManager.getUserList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lists.newArrayList();
	}

	
}
