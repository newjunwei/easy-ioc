package com.junicorn.ioc.test;

import com.junicorn.ioc.Container;
import com.junicorn.ioc.SampleContainer;

public class IocTest {

	public static void main(String[] args) {
		
		Container container = new SampleContainer();
		container.registerBean(Lol.class);
		// 初始化注入
		container.initWrited();
		
		Lol lol = container.getBean(Lol.class);
		lol.work();
	}
	
}
