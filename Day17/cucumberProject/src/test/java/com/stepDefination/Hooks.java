package com.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void before() {
		System.out.println("this is global before");
	}
	@After
	public void after() {
		System.out.println("This is global After");
}}
