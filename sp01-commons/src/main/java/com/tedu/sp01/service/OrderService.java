package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:10:00
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}

