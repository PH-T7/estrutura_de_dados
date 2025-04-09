
package listaligada;

public class TesteListaLigada {
    
    public static void main(String [] args){
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.adicionar("A");
        minhaLista.adicionar("B");
        minhaLista.adicionar("C");
        
        for (int i = 0; i < minhaLista.qtd; i++){
            System.out.println(minhaLista.get(i));
        }
        
    }
    
}
