package com.lab111.labwork2;
/**
 * Template first class.
 * @author Viacheslav Malashkin
 *
 */
public final class TestMain {

  /**
   * Constructor.
   *
   */
  private TestMain() {
    super();
  }
  
  /**
   * Invokes at application startup.
   * @param args Parameters from command line
   */
  public static void main(final String[] args) {
    //System.out.println("This is template example for main class");
    Cl1 cl1 = new Cl1();
    cl1.meth1();

    Cl2 cl2 = new Cl2();
    cl2.meth1();
    cl2.meth2();

    Cl3 cl3 = new Cl3();
    cl3.meth1();
    cl3.meth2();
    cl3.meth3();
  }

}
