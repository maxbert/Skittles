/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
nlogn
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/

   
    public static void main( String[] args ) 
    {
	long atot =0;
	long btot =0;
	long ctot =0;
	int[] a = new int[1024];
	int[] b = new int[2048];
	int[] c = new int[4096];
	
	for (int i = 0; i < a.length; i++){
	    int x = (int)(Math.random()  * 100);
	    a[i] = x;
	}
	for (int i = 0; i < b.length; i++){
	    int x = (int)(Math.random()  * 100);
	    b[i] = x;
	}
	for (int i = 0; i < c.length; i++){
	    int x = (int)(Math.random()  * 100);
	    c[i] = x;
	}
	for (int k = 0; k < 1000000; k ++){
	long start = System.currentTimeMillis();
	MergeSort.sort(a);
	long end = System.currentTimeMillis();

	atot += (end - start);

        start = System.currentTimeMillis();
	MergeSort.sort(b);
	end = System.currentTimeMillis();

	 btot += (end-start);
	start = System.currentTimeMillis();
	MergeSort.sort(c);
	end = System.currentTimeMillis();
	ctot += (end-start);
	}
    
	System.out.println("1 took " +(long) (atot/100.0) + " miliseconds");
	System.out.println("2^17 took " + (long)(btot/100.0) + " miliseconds");
	System.out.println("2^18 took " +(long) (ctot/100.0) + " miliseconds");

    }//end main

}//end class
