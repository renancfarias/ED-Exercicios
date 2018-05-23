import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
         
         Scanner sc = new Scanner (System.in);
         

    int t,a;
    int n,m;
    t = sc.nextInt();
    while(t>0)
    {
        n = sc.nextInt();
        m = sc.nextInt();
        a= n + (2 * (m-1) * (n-1)) + (m-2);
        System.out.println(a);
        t--;
    }
  
    }
    
}
