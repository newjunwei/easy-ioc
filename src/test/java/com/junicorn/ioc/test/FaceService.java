package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.Autowired;

public class FaceService {

	@Autowired
	private Lol lol;

	public void buy(String name, int money){
		System.out.println(name + "买了" + money + "毛钱特效，装逼成功!");
		System.out.println(name + lol.feedback());
	}
}
