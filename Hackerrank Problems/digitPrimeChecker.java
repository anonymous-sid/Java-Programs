import java.util.*;
class abcd{
    public static void main(String[] args){
        int n, c=0, k=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while (n>0){
            c++;
            n/=10;
        }
        for(int i=1; i<=c; i++){
            if(c%i==0)
            k++;
            if(k>2 || c==2)
            break;
        }
        if(c==2 || k==2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
