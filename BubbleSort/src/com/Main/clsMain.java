package com.Main;
//import com.Cybernatic.clsBubleSort;

public class clsMain {

	public static void main(String[] args) {
	    int intArray[] = new int[]{5,90,35,45,150,3};
	    int intTemp[];
	    
//	    clsMain mn = new clsMain();
//	    intTemp = mn.bubleSort(intArray);

	    intTemp = bubleSort(intArray);
	    
        System.out.println("After Bubble Sort");
        for(int i=0; i < intTemp.length; i++){
                System.out.print(intTemp[i] + " ");
        }
	}

	
//	public static int[] bubleSort(int intArray[]){
//        int intLength = intArray.length;
//        int temp = 0;
//       
//        for(int i=0; i < intLength; i++){
//                for(int j=1; j < (intLength-i); j++){
//                        if(intArray[j-1] > intArray[j]){
//                            //swap the elements!
//                            temp = intArray[j-1];
//                            intArray[j-1] = intArray[j];
//                            intArray[j] = temp;
//                        }
//                }
//        }
//		
//		return intArray;
//	}
	
	public static int[] bubleSort(int intArray[]){
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

}
