package com.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IMiServicio{

	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante y complicado";
	}
}
