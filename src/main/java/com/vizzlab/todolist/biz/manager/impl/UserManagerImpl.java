/**
 * 
 */
package com.vizzlab.todolist.biz.manager.impl;

import java.util.List;

import com.vizzlab.todolist.biz.dao.UserDAO;
import com.vizzlab.todolist.biz.domain.User;
import com.vizzlab.todolist.biz.manager.UserManager;

/**
 * @description
 * @author daoming.yxc
 * @date 2014-12-28 обнГ4:34:07
 */
public class UserManagerImpl implements UserManager {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> getUserList() throws Exception {
		return userDAO.getUserList();
	}

}
