package org.olahammed.specs;

import org.olahammed.interfaces.Engine;
import org.springframework.stereotype.Component;

//@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V8 Engine";
	}

}
