import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test
	public void method1(){
		System.out.println("Method ");
	}
	
	@Test(priority=2)
	public void firstmethod (){
		System.out.println("first");
		
	}

	@Test(priority=1)
	public void secondmethod (){
		System.out.println("second");
		
	}
	
	@Test(priority=1)
	public void thirdmethod (){
		System.out.println("third");
		
	}
}
