package com.cgf.fabricdev.gof.singleton;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

/**
 * 说明:单例类通过反射生成多实例的漏洞
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月23日 - 上午9:36:01
 */
public class ReflectionSingletonTest {

	@Test
	public void test() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		HungrySingleton singleton1 = HungrySingleton.getInstance();
		HungrySingleton singleton2 = HungrySingleton.getInstance();
		HungrySingleton singleton3 = HungrySingleton.getInstance();
		HungrySingleton singleton4 = HungrySingleton.getInstance();

		assertEquals(singleton1, singleton2);
		assertEquals(singleton1, singleton3);
		assertEquals(singleton1, singleton4);
		Class<HungrySingleton> cla = HungrySingleton.class;
		Constructor<HungrySingleton> constructor = cla.getDeclaredConstructor();
		// 通过修改构造方法的访问权限，实现多实例化的目的
		constructor.setAccessible(true);
		HungrySingleton singleton5 = constructor.newInstance();
		HungrySingleton singleton6 = constructor.newInstance();
		HungrySingleton singleton7 = constructor.newInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
		System.out.println(singleton4);
		System.out.println(singleton5);
		System.out.println(singleton6);
		System.out.println(singleton7);

	}
}
