
public class MethodCalling {
	
	
	// Static component --> cannot give a call to non-static component directly
	
	//static --> static
	//non static --> non static, Static (allowed)
	// non- static components cannot be called without making an object
	// static --> OO

	public static void main(String[] args) {
		
		MethodCalling m =  new MethodCalling();
        m.go1();
        
        System.out.println("After calling go1 method");
        
        
        
        /*
         * Inside go1 Method
         * Inside go Method 
         * Inside go2 Method 
         * After calling go2 Method
         * After calling go Method
         * After calling go1 Method
         * 
         */
        
        
        
        
        
//		m.go1();
//		m.go2();
//		go3();
		
		
		
	}
	
    public static void go3(){

		System.out.println("Inside Go3 Method");
		
	}
	
	
	public void go() {
		
		System.out.println("Inside Go Method");
		go2();

		System.out.println("After calling go2 Method");
	}
	
   public void go1() {
		
		System.out.println("Inside Go1 Method");
		go();
		System.out.println("After calling go Method");
		
		
	}



   public void go2() {
	
	System.out.println("Inside Go2 Method");
	
	
}
	
	
	

}
