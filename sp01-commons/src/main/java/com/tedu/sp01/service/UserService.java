package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:09:27
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}

