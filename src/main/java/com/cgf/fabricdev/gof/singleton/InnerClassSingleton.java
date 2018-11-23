package com.cgf.fabricdev.gof.singleton;

/**
 * 说明:静态内部类，同时拥有懒汉式及饿汉式的优点 1，延迟加载；2，在第一次使用时才进行实例化；3，线程安全
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午5:10:06
 */
public class InnerClassSingleton {
	// 构造方法私有化
	private InnerClassSingleton() {

	}

	// 静态方法，获取对象
	public static InnerClassSingleton getInstance() {
		return Singleton.INNER_CLASS_SINGLETON;
	}

	// 私有内部静态类
	private static class Singleton {
		private static final InnerClassSingleton INNER_CLASS_SINGLETON = new InnerClassSingleton();
	}
}
