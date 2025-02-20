package Pilhas;

public class pilha {

    private int[] Pilha;//Objeto responsável pelo armazenamento
    private int indice;

    public pilha(int tamanho) {
        Pilha = new int[tamanho];
        indice=0; 
    }

    public void empilhar(int valor){
        if(!pilhaCheia()){
            Pilha[indice]=valor;
            indice++;
        }

    }
    public int desempilhar(){
        if(!pilhaVazia()){
        return Pilha[indice-1];
        }
        return -1;
    } 
    public boolean pilhaVazia(){
        if(indice == 0) return true;
        else            return false;
    } 
    public boolean pilhaCheia(){
        if(indice == Pilha.length)  return true;
        else                        return false;
    }

}
