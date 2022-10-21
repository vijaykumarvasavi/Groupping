package Commongroupinh;

import org.testng.annotations.Test;


@Test(groups = {"all"})

public class Test1 {
	
	
	
	
    @Test(groups = {"smoke"})
	public void test1( ) {
	System.out.println("open test1");
	}
    
    @Test(groups = {"smoke","functional"})
   	public void test2( ) {
   	System.out.println("open test2");
   	}
    
    @Test(groups = {"functional","sanity"})
   	public void test3( ) {
   	System.out.println("open test3");
   	}
    
    @Test(groups = {"smoke","sanity"})
   	public void test4( ) {
   	System.out.println("open test4");
   	}

}
