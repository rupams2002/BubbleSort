package com.Main;
import java.lang.management.ClassLoadingMXBean;

import com.Abstract.clsBubleSort;
import com.Interface.clsInterface;


public class clsMain extends clsBubleSort implements clsInterface {

//	public static class A{
//		private int i = 5;
//		
//		public int f(A a){
//		   return a.i; 	
//		}
//	}
	
	
	public static void main(String[] args) {
//		A a = new A();
//		a.i = 6;
//		System.out.println(a.f(a));
//		System.out.println("------------------------------------------------------");
//      This line is added (1)
				
	    int intArray[] = new int[]{5,90,35,45,150,3};
	    int intTemp[];
	    
	    clsMain main = new clsMain();

	    //************************************************************
        System.out.println("Before Bubble Sort");
	    main.display(intArray);
	    intTemp = main.bubleSort(intArray);
        System.out.println("After Bubble Sort");
	    main.display(intArray);
	    
	    main.myDisplay();
	    
	    //************************************************************
        System.out.println("");
	    intArray = new int[]{5,90,35,45,150,3};
	    
        System.out.println("Before Bubble Sort");
	    main.display2(intArray);
	    intTemp = main.bubleSort2(intArray);
        System.out.println("After Bubble Sort");
	    main.display2(intArray);	    
	    //************************************************************
	    
	}

	@Override
	public void display(int[] intArray) {
		super.display(intArray);
	}


	@Override
	public int[] bubleSort(int[] intArray) {
		return super.bubleSort(intArray);
	}

	@Override
	public void myDisplay(){
		System.out.println("This is my display");
	}
	
	@Override
	public int[] bubleSort2(int[] intArray) {
		return null;
	}

	@Override
	public void display2(int intTemp[]) {
        for(int i=0; i < intTemp.length; i++){
            System.out.print(intTemp[i] + " ");
        }
        System.out.println("");
	}

	
}
