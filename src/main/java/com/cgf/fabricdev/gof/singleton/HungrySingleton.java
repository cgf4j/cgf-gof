package com.cgf.fabricdev.gof.singleton;

/**
 * 说明:饿汉式单例，特点： 1，类加载时实例化；2，线程安全；3，调用效率高；4，因为类加载时就创建，如果始终没有使用的话会造成内存的浪费
 * 
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午4:26:13
 */
public class HungrySingleton {
	// 类加载时创建对象
	private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

	// 构造方法私有化
	private HungrySingleton() {
	};

	// 静态方法，获取对象
	public static HungrySingleton getInstance() {
		return HUNGRY_SINGLETON;
	}
}
