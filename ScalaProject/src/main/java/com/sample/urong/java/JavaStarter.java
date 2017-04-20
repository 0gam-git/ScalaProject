package com.sample.urong.java;

import com.sample.urong.scala.ScalaStarter;

public class JavaStarter {

	public void test() {

		System.out.println("call test() .. ");
	}

	public static void main(String[] args) {
		JavaStarter java = new JavaStarter();
		
		java.test();
		
		System.out.println(ScalaStarter.multiply(2, 3));
	}

}
