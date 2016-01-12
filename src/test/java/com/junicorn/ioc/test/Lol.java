package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.Autowired;

public class Lol {

	@Autowired
	private FaceService faceService;
	
	public void work() {
		faceService.buy("剑圣", 5);
	}

	public FaceService getFaceService() {
		return faceService;
	}
	
}