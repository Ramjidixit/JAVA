//java variable example: overflow

class overflow{
	public static void main(String[] args){
		//overflow 
		int a=150;
		byte b=(byte)a;
		System.out.println(a);  // 150
		System.out.println(b); // -106
	}
}