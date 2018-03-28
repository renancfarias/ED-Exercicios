

import java.util.*;

class No {
	private String conteudo;
	private No prox;
	
	public No(){
		setProx(null);
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
    }

class ListaSE {
     
    
    private No cabeca;
    private int nElementos;

    public ListaSE(){
            cabeca = null;
            nElementos = 0;
    }
    
    public String elemento (int pos) {
	    
	    No aux = cabeca;
	    // Percorre a lista do 1o elemento ate pos 
	    for (int i =1; i < pos; i++){
	        // modifica "aux" para apontar para o proximo elemento da lista 
	        aux = aux.getProx();
	    }

	    return aux.getConteudo();
	}
    
    public boolean insereNaLista(String dado){
	    // Aloca memoria para novo no 
	    No novoNo = new No();
	    novoNo.setConteudo(dado);

	    // Procura o final da lista 
	    No aux = cabeca;
            if(nElementos == 0){
	    
	    // Insere novo elemento na cabeca da lista
	    novoNo.setConteudo(dado);
	    
	    novoNo.setProx(cabeca);
	    cabeca = novoNo;
	    nElementos++;
	    return true;
            }else{
            
	    while(aux.getProx() != null){
	        aux = aux.getProx();
	    }

	    novoNo.setProx(null);
	    aux.setProx(novoNo);

	    this.nElementos++;
	    return true;
            }
	}
}

public class Main {

    public static void main(String[] args) {
        
        int n, q;
        Scanner scan = new Scanner(System.in);
        
       
        n = scan.nextInt();
        q = scan.nextInt();
        ListaSE words = new ListaSE();
        ListaSE queries = new ListaSE();
        scan.nextLine();
        for(int i=0; i<n;i++){
            words.insereNaLista(scan.nextLine());
        }
        
        for(int i=0; i<q;i++){
            queries.insereNaLista(scan.nextLine());
        }
      
        for(int i = 1; i<=q; i++){
            int ig = 0;
            for(int j = 1; j<=n; j++){
                boolean igual = true;
                if(queries.elemento(i).length()>words.elemento(j).length()){
                    igual = false;
                }else{
                    for(int k = 0; k<queries.elemento(i).length();k++){
                        if(queries.elemento(i).charAt(k) != words.elemento(j).charAt(k))
                            igual = false;
                    }
                    
                }
                if(igual == true){
                    ig++;
                }
            }
            
            System.out.println(ig);
        }
        
        
        
        
    }
    
}
