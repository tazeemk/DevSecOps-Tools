package com.nt.service;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ArthimeticTest.class,BankingTest.class})
@SelectPackages("com.nt.service")
public class AllTest {

}
