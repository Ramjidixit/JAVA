class final_keyword{
	void mNumber(){
		System.out.println("91178457085");
		
		
	}
	final void atmpin(){
		System.out.println("91085");
	}
}
class final_keyword1 extends final_keyword{
	void mNumber(){
		System.out.println("91178457085");
		
		
	}
	void atmpin(){
		System.out.println("91085");
	}
	
}
class final_keyword2{
	public static void main(String[] args){ 
		final_keyword1 t=new final_keyword1();
		t.mNumber();
		t.atmpin();
		
	}
}

//error: atmpin() in final_keyword1 cannot override atmpin() in final_keyword