//import java.util.*;
//package com;

import java.util.*;
import java.sql.Date;

public class Ch1Pt3 {

	int iTest;

	public void Ch1Pt3() {
		iTest = 4;	
	}

	public static final void main(String[] names) {
		System.out.println("Default initialization value for char (\u0000):");
		System.out.println('\u0000');
		System.out.println(names[0]);

		//Date date = new Date();

		Ch1Pt3 t = new Ch1Pt3();
		System.out.println("iTest = " + t.iTest);

	}

}

