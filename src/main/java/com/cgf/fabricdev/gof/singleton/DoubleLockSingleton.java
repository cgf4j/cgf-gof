package com.cgf.fabricdev.gof.singleton;
/**
 * 说明:双重锁检测单例模式，但是由于JVM内部的优化机制会导致错误实际工作中不能用，仅供参考
 * @Author: chenguifeng
 * @Email: chengf4j@163.com
 * @QQ: 946952530@qq.com
 * @WebChat: 18310827687
 * @WebSite: www.fabricdev.com
 * @Date: 2018年11月22日 - 下午4:54:51
 */

import com.cgf.fabricdev.gof.common.util.CommonUtil;

public class DoubleLockSingleton {

	private static DoubleLockSingleton doubleLockSingleton;

	// 构造方法私有化
	private DoubleLockSingleton() {
		if (CommonUtil.isNotNull(doubleLockSingleton)) {
			throw new RuntimeException();
		}
	}

	// 静态方法，获取对象
	public static DoubleLockSingleton getInstance() {
		if (CommonUtil.isNull(doubleLockSingleton)) {
			synchronized (DoubleLockSingleton.class) {
				if (CommonUtil.isNull(doubleLockSingleton)) {
					doubleLockSingleton = new DoubleLockSingleton();
				}
			}
		}
		return doubleLockSingleton;
	}

}
