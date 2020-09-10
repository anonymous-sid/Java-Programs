public class Main {
 public static void main(String[] arg)
 {
    System.out.println(Thread.currentThread().getName());
    Counting c=new Counting();
    c.start();//new thread ->runnable->run
    for(int i=1;i<=900;i++)
    {
        System.out.println(Thread.currentThread().getName()+"  "+i);
    }
 }
}
