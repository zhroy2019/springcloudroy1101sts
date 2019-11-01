package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:00:40
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}

