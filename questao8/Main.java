import java.util.Scanner;

class No {
	private int conteudo;
	private No esq;
	private No dir;
	
	public No(){
		esq = null;
		dir = null;
	}
	
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
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

class ABP {
    public No raiz;
    public int contador;
    
    public ABP(){
        raiz = null;
        contador = 0;
    }
    
    public boolean insert (int dado) {
        
       
        
        No novoNo = new No();
        novoNo.setConteudo(dado);
        
        if(raiz == null){
            raiz = novoNo;
            System.out.println(contador);
            return true;
        }
        
        // Procura a posicao correta pra inserir o novo no
	    No aux = raiz;
	    	No p = null;
	    while (aux != null) {
                 contador++;
	    		p = aux;
			if (dado < aux.getConteudo())
				aux = aux.getEsq();
			else
				aux = aux.getDir();
		}
        
        // Encontrou um nó folha para inserir
		if (dado < p.getConteudo())
			p.setEsq(novoNo);
		else
			p.setDir(novoNo);
		System.out.println(contador);
                return true;
    }
            
            
}

public class Main {
    
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         int[] arr = new int [n];
         ABP arvore = new ABP();
         
         for(int i = 0; i<n; i++){
             arvore.insert(sc.nextInt());
         }
         
    }
}
