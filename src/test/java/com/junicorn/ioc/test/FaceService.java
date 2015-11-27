package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.Service;

@Service
public class FaceService {

	public void buy(String name, int money){
		System.out.println(name + "买了" + money + "毛钱特效，装逼成功!");
	}
}
