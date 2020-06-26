package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		// do while ile while loop larinin farki
		//condition yanlissa do while enaz bir defa calisir
		//while once kontrol eder yanlissa calismaz
		
		int num1 = 7;
		while(num1<7) {
			System.out.println("While: " + num1);
			num1++;
		}
		
		int num2=7;
		do {
			System.out.println("do wile: "+ num2);
		}while(num2<7);

	}

}
