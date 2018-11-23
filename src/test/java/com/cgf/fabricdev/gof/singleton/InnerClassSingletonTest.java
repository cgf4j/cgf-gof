package com.cgf.fabricdev.gof.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 说明:饿汉式单例测试类
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午4:37:49
 */
public class InnerClassSingletonTest {
	@Test
	public void test() {
		InnerClassSingleton u1 = InnerClassSingleton.getInstance();
		InnerClassSingleton u2 = InnerClassSingleton.getInstance();
		InnerClassSingleton u3 = InnerClassSingleton.getInstance();
		assertEquals(u1, u2);
		assertEquals(u1, u3);
		assertEquals(u2, u3);
	}
}
