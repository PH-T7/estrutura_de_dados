package MEDIA_MOVEL;

/*FACENS - ESTRUTURA DE DADOS 1S2025*/
/*Prof. Rodrigo Diver*/
/*Exercício Média Móvel*/

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class DesenhaTela extends JPanel {
    
    private int[] listaPontos;
    private int[] mediaMovel;
    private int maiorValorPontos, maiorValorMedia,qtdPontos;
    private int offsetX;
    private int offsetY;
    
    public DesenhaTela(int[][] matrizPontos, int janela){
        int[] listaPontos = new int[matrizPontos[0].length];  
        int[] mediaMovel = new int[matrizPontos[1].length];
        
        System.arraycopy(matrizPontos[0], 0, listaPontos, 0, matrizPontos[0].length); //Preenche ListaPontos
        System.arraycopy(matrizPontos[1], 0, mediaMovel, 0, matrizPontos[1].length); //Preenche ListaPontos
        criarJanela(janela);
    }
    public DesenhaTela(int[] listaPontos, int[] mediaMovel, int janela){
        this.listaPontos=listaPontos;
        this.mediaMovel= mediaMovel;
        criarJanela(janela);
    }
    
    // Método para desenhar pontos brancos
    public void desenharPonto(int x, int y,Graphics g) {
        g.fillOval(x, y, 5, 5); // Desenha um ponto branco com diâmetro de 5 pixels       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Aqui você pode adicionar o código para desenhar na janela       
        int largura=qtdPontos*offsetX;
        int altura=maiorValorPontos*offsetY;
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, largura, altura); // desenha um retângulo preto
        
        int janela = listaPontos.length-mediaMovel.length;
        
        //Desenha pontos Valores
        g.setColor(Color.red);
        for (int i = 0; i < listaPontos.length; i++) {
            desenharPonto(i*offsetX, (listaPontos[i])*offsetY, g);
        }
        //Desenha pontos da média
        g.setColor(Color.blue);
        for (int i = 0; i < mediaMovel.length; i++) {
            desenharPonto(i*offsetX+janela, ( mediaMovel[i])*offsetY, g);
        }
        
    }

    private  void criarJanela(int janela) {
        
        maiorValorPontos= Arrays.stream(listaPontos).max().getAsInt();
        maiorValorMedia= Arrays.stream(mediaMovel).max().getAsInt();
        qtdPontos = listaPontos.length;
        
        offsetX = 800/qtdPontos;
        offsetY=800/maiorValorPontos;
        
        JFrame frame = new JFrame("Qtd Pontos:"+listaPontos.length + " - Janela:" + janela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(qtdPontos*offsetX, maiorValorPontos*offsetY);
        frame.add(this);
        frame.setVisible(true);       
        
    }

    
}