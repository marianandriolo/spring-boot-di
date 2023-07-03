package com.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.di.app.models.domain.ItemFactura;
import com.di.app.models.domain.Producto;
import com.di.app.models.service.IMiServicio;
import com.di.app.models.service.MiServicio;
import com.di.app.models.service.MiServicioComplejo;

@Configuration
public class appConfig {
	
	@Bean("miServicioSimple")
	public IMiServicio registrarMiServicio() {
		return new MiServicio();
	}
	@Primary
	@Bean("miServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara sony",100.0);
		Producto producto2 = new Producto("portatil hp",660.0);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> itemsOficina(){
		Producto producto1 = new Producto("monitor lg lsd",3400.0);
		Producto producto2 = new Producto("notebook asus",630.0);
		Producto producto3 = new Producto("impresora hp",340.0);
		Producto producto4 = new Producto("escritorio",130.0);
		
		ItemFactura linea1 = new ItemFactura(producto1, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
