/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author RenanCarlos
 */
public class FunwithSequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, m;
        String s, q;
        
        n = Integer.parseInt(sc.nextLine());
        s = sc.nextLine();
        m = Integer.parseInt(sc.nextLine());
        q = sc.nextLine();
        
        int [] s1 = new int [n];
        int [] q1 = new int [m];
        
        /* converte os caracetres da primeira string seprados por um espaço
        para um inteiro e os coloca em um array*/
        for (int i = 0; i < n - 1; i++){
            String aux;
            aux = s.substring(0, s.indexOf(" "));
            s1[i] = Integer.parseInt(aux);
            s = s.substring(s.indexOf(" ") + 1);
        }
        s1[n-1] = Integer.parseInt(s); 
        
        /* converte os caracetres da segunda string seprados por um espaço
        para um inteiro e os coloca em um array*/
        for (int i = 0; i < m - 1; i++){
            String aux;
            aux = q.substring(0, q.indexOf(" "));
            q1[i] = Integer.parseInt(aux);
            q = q.substring(q.indexOf(" ") + 1);
        }
        q1[m-1] = Integer.parseInt(q);
        
        ArrayList<Integer> dif = new ArrayList<Integer>();
        
        /* verifica qual sao os elementos diferentes entre as
        sequencias (arrays) e coloca-os em um arraylist
        */
        for(int i=0; i<s1.length; i++){
            boolean comum = false;
            for(int j=0; j<q1.length; j++){
                if(s1[i]==q1[j])
                    comum = true;
                }
            if (!comum)
                dif.add(s1[i]);
        } 
        
    
        
        /*System.out.print("\nnumeros capturados:\n");
        
        for(int i = 0; i<n; i++){
            System.out.print(s1[i] + " ");
        }
        
        System.out.print("\n");
        
        for(int i = 0; i<m; i++){
            System.out.print(q1[i] + " ");
        }
        
        System.out.print("\nnumeros comuns:\n");
        */

        for(int i = 0; i<dif.size(); i++){
            System.out.print(dif.get(i) + " ");
        }
        
        
        
        
        
    }
    
}
