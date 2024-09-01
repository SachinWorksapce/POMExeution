package assignments;

import org.testng.annotations.Test;

public class WrkingTestNgFile2 {
	
	@Test(invocationCount = 2)
	public void method2() {
		System.out.println("Method2 ");
	}
	
	@Test
	public void method1() {
		System.out.println("Method1 ");
	}

}
