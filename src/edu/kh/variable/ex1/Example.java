package edu.kh.variable.ex1;

public class Example {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 - 2*iNum2);

		int num = (int) dNum;
		
		System.out.println(num);
		
		System.out.println( iNum1 / iNum2 ); // 2
		
		System.out.println( (int) dNum ); // 2
		
		System.out.println( iNum2 dNum ); // 10.0
		System.out.println( iNum1 ); // 10.0
		System.out.println( iNum1 iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( fNum ); // 3
		System.out.println( iNum1 fNum ); // 3
		System.out.println( iNum1 fNum );// 3.3333333
		System.out.println( iNum1 fNum ); // 3.3333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( ch ); // 65
		System.out.println( ch iNum1 ); // 75
		System.out.println( (ch iNum1) ); // 'K'
		
		//print <=출력용
		//scanner <= 입력용
		
	}
}