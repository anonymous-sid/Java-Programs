public class Counting extends Thread {
 
    @Override
    public void run()//run
    {
        for(int i=1;i<=900;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
 