package com.cgf.fabricdev.gof.singleton;
/**
 * 说明:懒汉式单例模式.特点：1，延迟加载在使用时才进行创建；2，资源利用率高，3，在高并发下会造成创建多个对象，因此需要使用同步锁，整个方法效率较低
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午4:41:49
 */

import java.io.ObjectStreamException;

import com.cgf.fabricdev.gof.common.util.CommonUtil;

public class LazySingleton {

	private static LazySingleton lazySingleton;

	// 构造函数私有化
	private LazySingleton() {
		if (CommonUtil.isNotNull(lazySingleton)) {
			throw new RuntimeException();
		}
	}

	// 静态方法，获取对象
	public static synchronized LazySingleton getInstance() {
		if (CommonUtil.isNull(lazySingleton)) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}

	// 防反序列化
	public LazySingleton readResolve()throws ObjectStreamException {
		return lazySingleton;
	}
}
