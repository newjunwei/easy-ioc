package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.AutoWrited;

public class Lol {

	@AutoWrited
	private FaceService faceService;
	
	public void work() {
		faceService.buy("剑圣", 5);
	}

	public FaceService getFaceService() {
		return faceService;
	}
	
}