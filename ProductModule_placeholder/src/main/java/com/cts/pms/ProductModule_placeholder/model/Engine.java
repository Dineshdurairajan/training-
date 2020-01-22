package com.cts.pms.ProductModule_placeholder.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("engineObj")
public class Engine {
	public Engine() {
		System.out.println("in engine constr");
	}
}
