package org.olahammed.car;

import org.olahammed.interfaces.Car;
import org.olahammed.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("corolla")
public class Corolla implements Car {
	
	@Autowired(required = false)
	@Qualifier("V8Engine")
	Engine engine;
//	Engine engine = new Engine();
	
	
//	public Corolla(Engine engine) {
//		engine.type = "V6";
//		this.engine = engine;
//	}
	
	
//	public void setEngine(Engine engine) {
//		engine.type = "V10";
//		this.engine = engine;
//	}

	@Override
	public void specs() {
		System.out.println("Sedan from Toyota with engine as " + engine.specs());

	}


}