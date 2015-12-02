package com.junicorn.ioc.test;

import com.junicorn.ioc.annotation.AutoWrited;

public class Lol3 {

	@AutoWrited(name="face")
	private FaceService2 faceService;
	
	public void work() {
		faceService.buy("瞎子", 5);
	}

	public FaceService2 getFaceService() {
		return faceService;
	}

}