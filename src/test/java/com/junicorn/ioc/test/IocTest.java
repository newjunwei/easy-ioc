package com.junicorn.ioc.test;

import com.junicorn.ioc.Container;
import com.junicorn.ioc.SampleContainer;

public class IocTest {

	private static Container container = new SampleContainer();
	
	public static void baseTest(){
		container.registerBean(Lol.class);
		// 初始化注入
		container.initWrited();
		
		Lol lol = container.getBean(Lol.class);
		lol.work();
	}
	
	public static void iocClassTest(){
		container.registerBean(Lol2.class);
		// 初始化注入
		container.initWrited();
		
		Lol2 lol = container.getBean(Lol2.class);
		lol.work();
	}
	
	public static void iocNameTest(){
		container.registerBean("face", new FaceService2());
		container.registerBean(Lol3.class);
		// 初始化注入
		container.initWrited();
		
		Lol3 lol = container.getBean(Lol3.class);
		lol.work();
	}
	
	public static void main(String[] args) {
//		baseTest();
//		iocClassTest();
		iocNameTest();
	}
	
}
