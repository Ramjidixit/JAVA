final class final_keyword92{
	void mNumber(){
		System.out.println("91178457085");
		
		
	}
	void atmpin(){
		System.out.println("91085");
	}
}
class final_keyword1 extends final_keyword92{
	void mNumber(){
		System.out.println("91178457085");
		
		
	}
	void atmpin(){
		System.out.println("91085");
	}
	
}
class final_keyword99{
	public static void main(String[] args){ 
		final_keyword1 t=new final_keyword1();
		t.mNumber();
		t.atmpin();
		
	}
}

//error: cannot inherit from final final_keyword92