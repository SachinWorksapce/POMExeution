package assignments;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class WorkingwithTestNG {
	
//	@Test(priority = 0,dependsOnMethods = "c")
//	public  void z() {
//		//System.out.println("Zmethod");
//		Reporter.log("z method", true);
//	}
	
@Test()
public void c() {
	
	System.out.println("C method");
}

@Test()
public void a() {
	System.out.println("a methd");
}

}
