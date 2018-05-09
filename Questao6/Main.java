package questao6;


import java.util.ArrayList;
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

class ArvBin{
    No raiz;
    static int indice_pre = 0;
    
    No fazArvore (int pre[], int in[],int comeco, int fim){
        if (comeco > fim) 
            return null;
        No novo = new No();
        novo.setConteudo(pre[indice_pre]);
        indice_pre++;
        
        if(comeco == fim)
            return novo;
        
        int indice_in = procura(in, comeco, fim, novo.getConteudo());
        
        novo.setEsq(fazArvore(pre, in, comeco, indice_in - 1));
        novo.setDir(fazArvore(pre, in, indice_in + 1, fim));
        
        return novo;
 
    }
    
    int procura(int a[], int inicio, int fim, int valor){
        int i;
        
        for(i = inicio; i <= fim; i++){
            if (a[i] == valor)
                return i;
        }
        return i;
    }
    
  void exibePosOrdem(No T, ArrayList a) {
		if (T == null)
			return ;

		if (T.getEsq() != null)
			exibePosOrdem(T.getEsq(), a);
	
	 	if (T.getDir() != null)
			exibePosOrdem(T.getDir(), a);

	 	a.add(T.getConteudo());
	}
        
}





public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] pre = new int [n];
        int [] pos = new int [n];
        int [] in = new int [n];
        
        for(int j = 0; j<n; j++)
            pre[j] = sc.nextInt();
            
        for(int j = 0; j<n; j++)
            pos[j] = sc.nextInt();
                
        for(int j = 0; j<n; j++)
            in[j] = sc.nextInt();
        
        ArvBin arv = new ArvBin();
        No raiz = arv.fazArvore(pre, in, 0, n - 1);
        ArrayList<Integer> novopos = new ArrayList<Integer>();
        arv.exibePosOrdem(raiz, novopos);
        
        int comp = 0;
        
        for(int i = 0; i<n;i++){
            if(pos[i] == novopos.get(i)){
                comp++;
            }
        }
        
        if(comp == n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}
    

