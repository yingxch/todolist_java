/**
 * 
 */
package com.vizzlab.todolist.biz.dao;

import java.util.List;

import com.vizzlab.todolist.biz.domain.User;

/**
 * @description 
 * @author daoming.yxc
 * @date 2014-12-14 обнГ4:46:15
 */
public interface UserDAO {

	public List<User> getUserList() throws Exception;

	public void delUserByName(String username) throws Exception;

	public void updateUser(User user) throws Exception;

	public void addUser(User user) throws Exception;

	public User findUserByName(String username) throws Exception;
}
