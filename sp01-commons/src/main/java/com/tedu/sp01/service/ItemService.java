package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:06:58
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
public interface ItemService {
	List<Item> getItems(String OrderId);
	void decreaseNumbers(List<Item> list);
	
}

