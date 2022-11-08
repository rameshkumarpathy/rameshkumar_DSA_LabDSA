package com.gl.javaFSD.dsa.balancedbrackets;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {
				
		test("([[{}]])");
		test("([[{}]]))");
		test("[]");
		test("[)");
		test("[[[]]]");
	}

	static void test(String brackets) {
		
		BalancedBracketsChecker checker = new BalancedBracketsChecker(
			brackets);
		
		boolean result = checker.check();
		if (result) {
			System.out.println("Bracket expression " + brackets + " is balanced");
		}else {
			System.out.println("Bracket expression " + brackets + " is NOT balanced");			
		}		
	}
}