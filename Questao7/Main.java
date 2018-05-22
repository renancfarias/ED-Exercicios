
import java.util.Scanner;

class No {
	private char conteudo;
	private No esq;
	private No dir;
	
	public No(){
		esq = null;
		dir = null;
	}
	
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(char conteudo) {
		this.conteudo = conteudo;
	}
	
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	public No getDir() {
		return dir;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	}
}

class Arvore {
   private int i;
   private String t;
   private No raiz;
    
   public Arvore (String t){
       i = 0;
       this.t = t;
       
       raiz = new No();
       raiz.setConteudo(t.charAt(i));
       
       if(raiz.getConteudo() == 'n'){
           raiz.setEsq(addFilho(raiz, t.charAt(++i)));
           raiz.setDir(addFilho(raiz, t.charAt(++i)));
       }
   }
   
   private No addFilho(No pai, char c) {
        No aux = new No();

        if(c == 'n') {
                aux.setDir(addFilho(aux, t.charAt(++i)));
                aux.setEsq(addFilho(aux, t.charAt(++i)));

        }
        return aux;
    }
   
   public int getDepth() {
        return getDepth(raiz) - 1;
    }
		
    private int getDepth(No no) {
        if (no == null) {
                return 0;
        }

        int depthR = getDepth(no.getDir());
        int depthL = getDepth(no.getEsq());

        if (depthL > depthR) {
                return ++depthL;
        }else{
                return ++depthR;
        }
    }

}
        


public class Main {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        String [] arvores =  new String [20];
        
        for (int i = 0; i<n; i++){
            arvores [i] = sc.nextLine();
            
        }
        
        for (int i = 0; i<n; i++){
            Arvore arv = new Arvore (arvores[i]);
            System.out.println(arv.getDepth());
        }
     
        
          
    }
}
