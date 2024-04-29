package multi_Thread;

public class MultiThread extends Thread {

	public static void main(String[] args) {
        MultiThread trd = new MultiThread();
        trd.start();
       
        
       
        
 
        for(int i = 0; i < 6; i++) {
            System.out.println("I: " + i);
        }
    }
	
	
    
    public void run() {
    	 Thread t1 = new Thread(new Runnable() {
             public void run() {
                 runing();
             }
         });
         t1.start();
         Thread t2 = new Thread(new Runnable() {
        	 public void run()
        	 {
        		 runing1();
         }
         });
         t2.start();
    	Thread tr3 = new Thread(new Runnable()
    			{
    		      public void run()
    		      {
    		    	  runing2();
    			}
    			});
    	tr3.start();
        for(int j = 1; j < 6; j++) {
            System.out.println("j: " + j);
        }
    }
    static void runing() {
        for(int m = 1; m < 6; m++) {
            System.out.println("M: " + m);
        }
    }
    static void runing1() {
        for(int n = 1; n < 6; n++) {
            System.out.println("n: " + n);
        }
    }
    static void runing2() {
        for(int t = 1; t < 6; t++) {
            System.out.println("T: " + t);
        }
    }
	
}
