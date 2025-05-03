package javapractices;

public class WrapperClass {

	public static void main(String[] args) {
		
		new WrapperClass().integerDemo();
		
	}
	
	public void integerDemo() {
		//boxing primitive to wrapper
		//un-boxing wrapper to primitive
		
		int a=10;
		Integer b = Integer.valueOf(a);
		System.out.println(b instanceof Integer);
		
		
	int d =b.intValue();
		
		System.out.println(d);
		
		String s = "$8,230";
		System.out.println(s);
	
		s = s.replaceAll("[^0-9]","");
		System.out.println(s);
		
		Integer num = Integer.parseInt(s);
		System.out.println(s+num);
		
		
		System.out.println(num+10);
		
		System.out.println("3"+num + 10);
		
		System.out.println("s"+(num+10));
		
	}	
		public void charPro() {
			String s = "Welcome to codemind"
			+"Technology pune"+"maharastra india";
			
			//problem---Every letter should be start with capital letter
			
			//s.spilt;
			String ss="";
			
			for(int i =0 ;i<s.length();i++) {
				
				if(Character.isSpace(s.charAt(i))) {
					char ccc = Character.toUpperCase(s.charAt(i+1));
					ss = ss+" "+ccc;
					i=i+1;
					continue;
				}
				ss=ss+s.charAt(i);
			 ss = ss + s.charAt(i);
			}
			}
		}
		
		
		
		
		
	
