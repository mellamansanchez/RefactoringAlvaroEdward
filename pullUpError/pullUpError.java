package pullUpError;

public class pullUpError {
	
	public static class A {
		protected static int x = 5;
		public static int test() {
			return x + 7;
		}
	}
	
	public static class B extends A {

	}
	
	public static class C extends B {
		public static int test() {
			return x + 10;
		}
	}
	
	public static class D extends B {
		public static int test() {
			return x + 10;
		}	
	}
	
	public static class E extends B {
		
		public static void printTest(int num) throws ExceptionTest {
			System.out.println("Result: "+num);
			if(num != 12) {
				throw new ExceptionTest("ERROR. The result should be 12");
			}
		}
	}
	
	public static void main (String [ ] args){
		//It should return 12 
		try {
			E.printTest(E.test());
		} catch (ExceptionTest ex) {
			System.out.println(ex.getMessage());
		}
	}
}
