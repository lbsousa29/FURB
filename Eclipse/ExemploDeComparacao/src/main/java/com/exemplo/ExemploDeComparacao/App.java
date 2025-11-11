package com.exemplo.ExemploDeComparacao;


public class App 
{
    public static void main( String[] args ){
       Aluno a = new Aluno(101515, "Segranfedo", 10);
       Aluno b = new Aluno(101515, "Segranfedo", 10);
       if (a.equals(b)) {
		System.out.println("São iguais");
	}else {
		System.out.println("São diferentes");
	}
       
    	
    	
    	
    }
}
