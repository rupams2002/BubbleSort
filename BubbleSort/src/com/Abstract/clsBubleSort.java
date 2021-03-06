package com.Abstract;

public abstract class clsBubleSort {
	
	public int[] bubleSort(int[] intArray){
        int intLength = intArray.length;
        int temp = 0;
       
        for(int i=0; i < intLength; i++){
                for(int j=1; j < (intLength-i); j++){
                        if(intArray[j-1] > intArray[j]){
                            //swap the elements!
                            temp = intArray[j-1];
                            intArray[j-1] = intArray[j];
                            intArray[j] = temp;
                        }
                }
        }
		
		return intArray;
	}
	
	public void display(int[] intTemp){
        for(int i=0; i < intTemp.length; i++){
            System.out.print(intTemp[i] + " ");
        }
        System.out.println("");
	}
	
	public abstract void myDisplay();
	
}
