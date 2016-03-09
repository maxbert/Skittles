/*======================================
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm: 
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] ret =new int[ a.length + b.length];
	int ac= 0;
	    int bc=0;
	    for( int i = 0; i< a.length +b.length; i++){
		if (bc >= b.length;){
		    ret[i] == a[ac];
		    ac++;
		}
		else if ( ac >= a.length){
		    ret[i] == b[bc];
		    bc++;
		}
		if ( a[ac] >= b[bc]){
		    ret[i] = b[bc];
		    bc ++;
		}else{
		    ret[i] = a[ac];
		    ac++;
		}
	    }
    

	return ret;

    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length == 1){
	    return arr;
	}
	else{
	    int l = arr.length / 2;
	    int[] arr1 = new int[l];
	    int[]arr2 = new int[arr.length - l];
	    int c = 0;
	    while (c < arr1.length){
	    
		arr1[c] ==arr[c];
	    }
	    for (int i = c; i < arr2.length; i++){
		
	    return merge(sort(arr[0,l]),sort(arr[l
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};
	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );
	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );
	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );
	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
