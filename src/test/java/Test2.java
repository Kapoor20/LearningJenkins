import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void method2(){
		System.out.println("Method ");
	}
	
	@Test(priority=3)
	public void firstmethod (){
		System.out.println("three");
		
	}

	@Test(priority=4)
	public void secondmethod (){
		System.out.println("four");
		
	}
	
	@Test(priority=5)
	public void thirdmethod (){
		System.out.println("five");
		
	}

}
