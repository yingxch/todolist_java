/**
 * 
 */
package com.vizzlab.todolist.biz.dao.impl;

import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.vizzlab.todolist.biz.dao.UserDAO;
import com.vizzlab.todolist.biz.domain.User;

/**
 * @description 
 * @author daoming.yxc
 * @date 2014-12-14 下午4:50:06
 */
public class UserDAOImpl implements UserDAO {
	
	protected SqlMapClient sqlMapClient;

	/**
	 * @param sqlMapClient the sqlMapClient to set
	 */
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	/**
	 * 注意：此处要在配置文件中注入SqlMapClient
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUserList() throws Exception {
		return sqlMapClient.queryForList("UserDAO.getUserList");
	}

	public void addUser(User user) throws Exception {
		sqlMapClient.insert("UserDAO.addUser",user);
	}

	public void delUserByName(String username) throws Exception {
		sqlMapClient.delete("UserDAO.delUserByName", username) ;
	}

	public void updateUser(User user) throws Exception {
		sqlMapClient.update("UserDAO.updateUser", user) ;
	}

	public User findUserByName(String username) throws Exception {
		return (User)sqlMapClient.queryForObject("UserDAO.findUserByName",username) ;
	}


}
