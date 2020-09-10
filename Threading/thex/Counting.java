public class Counting implements Runnable {
 
    @Override
    public void run()//run
    {
        for(int i=1;i<=200;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
