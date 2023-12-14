package com.bdp.test;

import com.bdp.beans.Truck;
import com.bdp.beans.TruckBuilder;

public class TruckProducer {

	public static void main(String[] args) {
		TruckBuilder  truckBuilder = new TruckBuilder(101).model("mini-x").manufacturer("TATA").price(4500000).capacity(45000);
		Truck truck = truckBuilder.build("minitruck");
		truck.drive();
		
		TruckBuilder  truckBuilder2 = new TruckBuilder(102).model("prime-T").manufacturer("MAN").price(9800000).capacity(150000);
		Truck truck2 = truckBuilder2.build("cementtruck");
		truck2.drive();	

	}

}
