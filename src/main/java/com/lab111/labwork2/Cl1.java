package com.lab111.labwork2;
/**
 * Class Cl1
 * implements interface If1
 * and contains field of If1 and If2 type.
 * It also is overridden method "meth1"
 *
 * @author Viacheslav Malashkin
 *
 */
public class Cl1 implements If1 {

	@Override
	public void meth1() {
		System.out.print("Cl1 meth1()\n");
	}
	If1 myIf1;
	If2 myIf2;
}
