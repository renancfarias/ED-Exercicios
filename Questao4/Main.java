/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author renan
 */
public class Main {


	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	String	str;
	int i;
	i = sc.nextInt();
	
	while(i>0){
	str = sc.next();
	Stack pilha = new Stack();
	String rnp = new String();
	int tam = str.length();
	char c;		
	for(int k=0;k<tam;k++){
	c = str.charAt(k);
        
        if(c=='('){
            ;
        }else{
            if(c=='+' || c=='-'|| c=='*' || c=='/' || c=='^'){
                pilha.push(c);
            }else{
                if(c==')'){
                    rnp += pilha.pop();
                }else{
                    rnp += c;
                }
            }
        }
	
	}
		System.out.println(rnp);
		i--;
	}
    }
        
        
}

