package com.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioSimple")

public class MiServicio implements IMiServicio {
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante";
	}
	
	
}
