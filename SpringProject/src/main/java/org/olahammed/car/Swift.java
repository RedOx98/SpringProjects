package org.olahammed.car;

import org.olahammed.interfaces.Car;
import org.springframework.stereotype.Component;

//@Component
public class Swift implements Car {

	@Override
	public void specs() {
		System.out.println("Hatchback from suzuki...");
	}

}
