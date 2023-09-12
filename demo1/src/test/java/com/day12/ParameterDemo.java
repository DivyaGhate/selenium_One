package com.day12;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int v1, int v2) {
	  int finalsum = v1+v2;
	  System.out.println(v1+v2);
  }
}
