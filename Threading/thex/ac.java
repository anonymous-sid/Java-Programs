public class ac implements Runnable{

 

    @Override
    public void run() {
        // TODO Auto-generated method stub
        hello();
    }

 

    public void hello()
    {
        for(char a='a';a<='z';a++)
        {
                    
            System.out.println(Thread.currentThread().getName()+"  "+a);
        }
    }
}
