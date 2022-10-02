class var_arg{
	void add(int ... a){         //var-args method
		int sum=0;
		for(int x:a){
			sum=sum+x;
			
		}
		System.out.println("Sum of given numbers ="+sum);
	}
}
class var_arg1{
	public static void main(String[] args){
		var_arg r=new var_arg();
		r.add();
		r.add(10);
		r.add(10,20);
		r.add(10,20,30);
	}
}

/*
Sum of given numbers =0
Sum of given numbers =10
Sum of given numbers =30
Sum of given numbers =60
*/