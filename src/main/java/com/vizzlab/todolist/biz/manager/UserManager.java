/**
 * 
 */
package com.vizzlab.todolist.biz.manager;

import java.util.List;

import com.vizzlab.todolist.biz.domain.User;

/**
 * @description
 * @author daoming.yxc
 * @date 2014-12-28 ����4:33:04
 */
public interface UserManager {

	/**
	 * ȡ�û��б�
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserList() throws Exception;
}
