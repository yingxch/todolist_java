/**
 * 
 */
package com.vizzlab.todolist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vizzlab.todolist.biz.ao.UserAO;

/**
 * @description 
 * @author daoming.yxc
 * @date 2014-12-14 下午5:43:47
 */
public class UserController extends MultiActionController {
	/**
	 * 注入viewPage   
	 * viewPage 代表处理完后要返回的页面
	 */
	private String page_listUser ;
	
	private UserAO userAO;

	public void setUserAO(UserAO userAO) {
		this.userAO = userAO;
	}

	public ModelAndView findUserByName(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//接收输入域数据
//		String username = request.getParameter("input") ;
// 
//		User user = userService.findUserByName(username) ;
//		System.out.println("user-----"+user);
//		if(null==username||username.trim().length()==0){
//			return new ModelAndView(page_listUser,"users",userService.getAllUsers()) ;
//		}
//
//		List<User> list = null  ;
//		if(user!=null){
//			list = new ArrayList<User>() ;
//			list.add(user);	
//		}
//		System.out.println("list---"+list);		
		return new ModelAndView(page_listUser,"users", null);
	}
	
	public ModelAndView listUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		return new ModelAndView(page_listUser,"users",userAO.getUserList()) ;
	}

	public String getPage_listUser() {
		return page_listUser;
	}

	public void setPage_listUser(String page_listUser) {
		this.page_listUser = page_listUser;
	}

}

