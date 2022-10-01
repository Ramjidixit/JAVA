//accessing of an object

public class obj{
	int id;
	String name;
	void record(int identity,String full_name){
		id=identity;
		name=full_name;
	}
	void display(){
		System.out.println("ID="+id+","+"Name="+name);   //ID=2021,Name=ramya
	}
	public static void main(String args[]){
		obj emp=new obj();
		emp.record(2022,"shreya");
		emp=new obj();
		emp.record(2021,"ramya");  
		emp.display();    
		
	}
	
}