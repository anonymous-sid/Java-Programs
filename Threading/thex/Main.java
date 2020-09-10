public class Main {
 public static void main(String[] arg)
 {
    //System.out.println(Thread.currentThread().getName());
    Counting c=new Counting();
    Thread t=new Thread(c,"1st Thread");
    Thread t1=new Thread(c,"2nd Thread");
    t.start();//new thread ->runnable->run
    t1.start();
    Thread t2=new Thread(c,"3rd Thread");
    ac d=new ac();
    Thread t3=new Thread(d,"4th Class");
    t3.start();
    t2.start();
    for(int i=1001;i<=1100;i++)
    {
        System.out.println(Thread.currentThread().getName()+"  "+i);
    }
 }
}
