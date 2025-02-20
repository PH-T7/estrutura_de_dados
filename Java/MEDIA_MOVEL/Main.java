
package MEDIA_MOVEL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*FACENS - ESTRUTURA DE DADOS 1S2025*/
/*Prof. Rodrigo Diver*/
/*Exercício Média Móvel*/

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Gerar valores aleatórios");
        System.out.println("2 - Digitar valores manualmente");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de valores a serem gerados: ");
            int qtdValores=scanner.nextInt();
            
            System.out.println("Digite o valor máximo que será gerado: ");
            int valorMax=scanner.nextInt();
            
            valores = randomic(qtdValores,valorMax);
        } else {
            
            System.out.println("Digite como no exemplo: 1,2,3,4,5,6....etc");
            
            String strValor = scanner.next();
            
            String[] numerosString = strValor.split(",");
            valores = new int[numerosString.length];

            for (int i = 0; i < valores.length; i++) {
                valores[i] = Integer.parseInt(numerosString[i].trim());
            }
            
        }
        
        
        boolean controle=false;
        int janela=1;
        while(true){
            if(controle){
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Sair");
                System.out.println("2 - Alterar Janela");                

                opcao = scanner.nextInt();          
            
                switch (opcao) {
                    case 1:
                        System.exit(0);
                        break;
                    case 2:
                        System.out.println("Digite o tamanho da janela para calcular a média: ");
                        janela=scanner.nextInt();
                }
            }
            int[] mediaMovel= MediaMovel.calculaMediaSimples(valores, janela); 
            
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < mediaMovel.length; i++) {
                stringBuilder.append(mediaMovel[i]);
                if (i < mediaMovel.length - 1) { // Adiciona vírgula se não for o último elemento
                    stringBuilder.append(",");
                }
            }
            
            System.out.println("Media Movel: " + stringBuilder.toString());
            //Printa os dados na tela
            DesenhaTela tela=new DesenhaTela(valores,mediaMovel,janela);
            
            controle=true;
        }
    }

    public static int[] randomic(int qtdValores, int valorMax) {
        Random random = new Random();
        int[] valores = new int[qtdValores]; // Tamanho do vetor definido como 10
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(valorMax); // Gera valores entre 0 e 99
        }
        return valores;
    }
    
}
