package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:02:58
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private  String id;
	private	User user;
	private List<Item> items;
}

