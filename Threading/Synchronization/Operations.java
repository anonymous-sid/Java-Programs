public class Operations {

 

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub

 

        Account sachin=new Account(10000);
        System.out.println(sachin);
        Thread t=new Thread(sachin);
        Thread t1=new Thread(sachin);
    t.start();
    t1.start();
    t.join();
    t1.join();
    System.out.println(sachin);
    
    }

 

}
