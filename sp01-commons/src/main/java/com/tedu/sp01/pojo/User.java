package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhroy
 * @date: 2019年10月29日 上午10:01:37
 * @version: 1.01
 * @Description: （对类进行功能描述）
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String username;
	private String password;
}

