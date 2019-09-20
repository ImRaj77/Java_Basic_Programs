package com.javabasics.basic;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidPattern p = new PyramidPattern();
		p.numPyramid(5);
	}
	
	// *
	// **
	// ***
	// ****
	// *****
	public void pyramid(int n) {
		for(int i=0; i<n; i++) {		
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//     *
	//    **
	//   ***
	//  ****
	// *****
	public void leftPyramid(int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			for(j=2*(n-i); j>=0; j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	public void triangle(int n) {
		int j=0;
		for(int i=0; i<n; i++) {
			for(j=(n-i); j>1; j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 1
	// 12
	// 123
	// 1234
	// 12345
	public void numPyramid(int n) {
		int i,j,num;
		for(i=0;i<n;i++) {
			num=1;
			for(j=0;j<=i; j++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
	
	public void numPyramid123(int n) {
		int i,j,num=1;
		for(i=0;i<n;i++) {
			num=1;
			for(j=0;j<=i; j++) {
				System.out.print(num+ " ");
				num = num+1;
			}
			System.out.println();
		}
	}

}
