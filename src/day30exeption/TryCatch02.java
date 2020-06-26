package day30exeption;

public class TryCatch02 {

	public static void main(String[] args) {
		 String s ="";
		 System.out.println(s.length());//0
		 try {
			 s+="t";
			 
		 }catch(Exception e) {
			 s+="c";
		 }finally {
			 s+="f";
		 }
		 
		 s+="a";
		 System.out.println(s);
		 
		 System.out.println(s);
		 
		 //String'e null atnadigi zaman length() calismaz ve NullPointerExeption verir.
		 String n= null;
		// String m;// local veriable dir ve mutlaka deger atamiliyiz. exeption verir.
		// System.out.println(n.length());
		// System.out.println(m.length()); Exeption veriri bunlar.

	}

}
