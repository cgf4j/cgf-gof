package com.cgf.fabricdev.gof.common.util;

import java.lang.reflect.Method;

/**
 * 
 * 说明:通用工具类
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月16日 - 下午1:08:18
 */
public class CommonUtil {
	private static final String GET = "get";

	/**
	 * 
	 * 说明:生成属性的get方法
	 * 
	 * @Author: chenguifeng
	 * @Email: chengf4j@163.com
	 * @QQ: 946952530@qq.com
	 * @WebChat: 18310827687
	 * @WebSite: www.fabricdev.com
	 * @Date: 2018年11月16日 - 下午1:08:41
	 * @param fieldName
	 * @param claz
	 * @return
	 * @throws Exception
	 */
	public static Method generateGetMethod(String fieldName, Class<? extends Object> claz) throws Exception {
		String first = fieldName.substring(0, 1).toUpperCase();
		String tail = fieldName.substring(1);
		String getMethod = GET + first + tail;
		Method get = claz.getMethod(getMethod);
		return get;
	}

	/**
	 * 
	 * 说明:对象为空判断
	 * 
	 * @Author: chenguifeng
	 * @Email: chengf4j@163.com
	 * @QQ: 946952530@qq.com
	 * @WebChat: 18310827687
	 * @WebSite: www.fabricdev.com
	 * @Date: 2018年11月16日 - 下午1:09:00
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		return object == null;

	}

	/**
	 * 
	 * 说明:对象非空判断
	 * 
	 * @Author: chenguifeng
	 * @Email: chengf4j@163.com
	 * @QQ: 946952530@qq.com
	 * @WebChat: 18310827687
	 * @WebSite: www.fabricdev.com
	 * @Date: 2018年11月16日 - 下午1:09:28
	 * @param object
	 * @return
	 */
	public static boolean isNotNull(Object object) {
		return !(object == null);

	}
}
