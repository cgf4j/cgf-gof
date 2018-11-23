package com.cgf.fabricdev.gof.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 说明:加锁双重验证单例测试类
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午4:37:49
 */
public class EnumSingletonTest {
	@Test
	public void test() {
		EnumSingleton u1 = EnumSingleton.INSTANCE;
		EnumSingleton u2 = EnumSingleton.INSTANCE;
		EnumSingleton u3 = EnumSingleton.INSTANCE;
		assertEquals(u1, u2);
		assertEquals(u1, u3);
		assertEquals(u2, u3);
	}
}
