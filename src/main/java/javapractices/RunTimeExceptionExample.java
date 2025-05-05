package javapractices;

public class RunTimeExceptionExample {

	public static void main(String[] args) {
		
		RunTimeExceptionExample runtimeException = new  RunTimeExceptionExample();

		//System.out.println("division =" + runtimeException.div(100, 100));
		//System.out.println("division =" + runtimeException.div(100, 0)); ArithmaticException
		runtimeException.StringLenth("Welcome to codemind");
		//runtimeException.StringLenth(null); NullpointerException
		
		//int num = runtimeException.convertStringToNumber("10");
		//System.out.println("Square of number ="+ num*num);
		//runtimeException.convertStringToNumber("12wer");numberformatException
		
		//System.out.println(runtimeException.getCharacter("Welcome",10));//StringIndexOutOFBoundException
		
		   System.out.println("String from index ="+ runtimeException.getStringFromIndex(5));//ArrayIndexOutOfboundException
	}
	
	public char getCharacter(String s ,int index) {
		
		return s.charAt(index);
	}
	public String getStringFromIndex(int index) {
		String arr[]= {"Snehal","Swarali","abc","pqr"};
		return arr[index];
		
	}

	public int div(int a,int b) {
		return a/b;
		
	}
	public void StringLenth(String s)
	{
		System.out.println("String length="+s.length());
	}
	public int convertStringToNumber(String numbericString)
	{
		return Integer.parseInt(numbericString);
	}
}
