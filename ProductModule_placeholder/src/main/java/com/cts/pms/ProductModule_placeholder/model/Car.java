package com.cts.pms.ProductModule_placeholder.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("carObj")
public class Car {
	
	@Autowired//(required=false)// byname or bytype or constr
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		System.out.println("car obj created");
	}
	
	
}
