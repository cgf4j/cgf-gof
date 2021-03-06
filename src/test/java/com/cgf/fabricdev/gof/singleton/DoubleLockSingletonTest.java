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
public class DoubleLockSingletonTest {
	@Test
	public void test() {
		DoubleLockSingleton u1 = DoubleLockSingleton.getInstance();
		DoubleLockSingleton u2 = DoubleLockSingleton.getInstance();
		DoubleLockSingleton u3 = DoubleLockSingleton.getInstance();
		assertEquals(u1, u2);
		assertEquals(u1, u3);
		assertEquals(u2, u3);
	}
}
