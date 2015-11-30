package com.junicorn.ioc.test;

import com.junicorn.ioc.Container;
import com.junicorn.ioc.SampleContainer;

public class TestMain {

	public static void main(String[] args) {
		
		Lol lol = new Lol();
		
		Container container = new SampleContainer();
		container.registerBean(lol);
		container.initWrited();
		
		Lol iocLol = container.getBean(Lol.class);
		iocLol.work();
	}
}
