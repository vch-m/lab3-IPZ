package com.lab111.labwork2;
/**
 * Class Cl2
 * implements interface If2
 * and contains field of Cl3 type.
 * It also is overridden methods "meth1" and "meth2"
 *
 * @author Viacheslav Malashkin
 *
 */
public class Cl2 implements If2 {

	@Override
	public void meth1() {
		System.out.print("Cl2 meth1()\n");
	}

	@Override
	public void meth2() {
		System.out.print("Cl2 meth2()\n");
	}

	Cl3 myCl3;
}
