
package listaligada;


    public class ListaLigada{
        
        No primeiroNo;
        No ultimoNo;
        int qtd;
        
        public void adicionar(String info){
            //Criar o novo Nô
            No aux = new No(info);
            
            //se a lista estiver vazia
            //Teremos apontar primeiroNo e ultimoNo
            //para o Nô aux(Novo nô) 
            
            if(qtd==0){
                primeiroNo = aux;
                ultimoNo = aux;
                qtd++;
            }
            else//lista nao esta vazia
             {
            ultimoNo.proximo=aux;
            ultimoNo=aux;
            qtd++;
            
            }
        }
        
        public String get(int indice){
            //Retorna o indice do no referenciado pelo indice
            return buscaNo(indice).info;
        }
        private No buscaNo(int indice){
           No temp;
           
           if(indice<0 || indice>= qtd)
           {
               //Retornar um erro
               return null;
           }
           temp=primeiroNo;
           for(int i=0;i<indice;i++){
               temp=temp.proximo;
           }
           return temp;
        }
        
    }
