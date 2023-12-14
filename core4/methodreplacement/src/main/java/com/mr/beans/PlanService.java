package com.mr.beans;

import java.util.Arrays;
import java.util.List;

public class PlanService {
	public List<String> findPlans(int age,int policyPeriod,boolean outPatientCover,boolean copay,boolean prehospitalcoverage){
		if(age<60 && policyPeriod>1 && outPatientCover==true && copay==true && prehospitalcoverage==true) {
			return Arrays.asList(new String[] {"plan1","plan2","plan5"});
		}
		else {
			return Arrays.asList(new String[] {"plan2","plan7","plan9"});
		}
	}
}
