package org.olahammed.specs;

import org.olahammed.interfaces.Engine;
import org.springframework.stereotype.Component;

//@Component("V6Engine")
public class V6 implements Engine{

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V6 engine";
	}

}
