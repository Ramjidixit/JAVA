//uncaught exceptions--exception is caught by the default handler provided by the Java run-time system

public class exc1{
	public static void main(String[] args){
		int d=0;
		int a=45/d;
		System.out.println("Result="+a);
	}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exc1.main(exc1.java:5)      */