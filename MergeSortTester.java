/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
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
	System.out.println("test");
	int[] a = new int[1000000];
	int[] b = new int[10000000];
	int[] c = new int[100000000];
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
	long start = System.currentTimeMillis();
	MergeSort.sort(a);
	long end = System.currentTimeMillis();
	System.out.println(" 10 took" +( end- start) + "seconds!");
        start = System.currentTimeMillis();
	MergeSort.sort(b);
	end = System.currentTimeMillis();
	System.out.println(" 100 took" +( end- start) + "seconds!");
	start = System.currentTimeMillis();
	MergeSort.sort(c);
	end = System.currentTimeMillis();
	System.out.println(" 1000 took" +( end- start) + "seconds!");


    }//end main

}//end class
