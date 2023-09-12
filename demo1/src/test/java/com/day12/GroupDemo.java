package com.day12;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups="groupA")
  public void testMethod1ForGroupA() {
	  System.out.println("Running test method1 of groupA");
  }
  
  @Test(groups="groupA")
  public void tes2Method1ForGroupA() {
	  System.out.println("Running test method2 of groupA");
  }
  
  @Test(dependsOnGroups = "groupA")
  public void dependsOnGroupA() {
	  System.out.println("depends On GroupA executed!");
  }
  
}
