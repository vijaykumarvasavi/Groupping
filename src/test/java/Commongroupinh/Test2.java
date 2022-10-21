package Commongroupinh;

import org.testng.annotations.Test;

public class Test2 {
	
	
	
	 @Test(groups = {"smoke","functional"})
		public void test5( ) {
		System.out.println("open test5");
		}
	 
	 @Test(groups = {"smoke","sanity"})
		public void test6( ) {
		System.out.println("open test6");
		}

	 
	 @Test(groups = {"sanity"})
		public void test7( ) {
		System.out.println("open test7");
		}
}
