//java variable example: adding lower type

class lower{
	public static void main(String[] args){
		byte a=30;
		byte b=40;
		//byte c=a+b;--incompatible types: possible lossy conversion from int to byte
		byte c=(byte)(a+b);
		System.out.println(c);  // 70
		
	}
}