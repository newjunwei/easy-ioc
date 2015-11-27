package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.AutoWrited;

public class Lol {

	@AutoWrited(name="aaa")
	private FaceService faceService;
	
	public Lol() {
	}
	
	public void work(){
		faceService.buy("剑圣", 5);
	}

	public FaceService getFaceService() {
		return faceService;
	}
	
}
