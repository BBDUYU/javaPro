package com.util;

public class Graphic2D {

	public static void main(String[] args) {
		
	}
	public static void LineDraw(){
		System.out.println("---------------"); 
		
	}

	public static void LineDraw(int n){
		for(int i=1;i<=n;i++) {
			System.out.print("-");
		}
		System.out.println(); 
		
	}
	public static void LineDraw(int n,char style){
		for(int i=1;i<=n;i++) {
			System.out.print(style);
		}
		System.out.println(); 
		
	}

}
