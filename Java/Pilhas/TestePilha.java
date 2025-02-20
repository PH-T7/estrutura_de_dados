package Pilhas;

public class TestePilha {
    public static void main(String[] args) {
        pilha minhaPilha = new pilha(10);
        System.out.println("Empilhando: ");
        for (int i = 10; i < 20; i++) {
            System.out.println(i + " ] ");
            minhaPilha.empilhar(i);
        }
        System.out.println("\nDesempilhando: ");
        while (!minhaPilha.pilhaVazia()) {
            System.out.println(minhaPilha.desempilhar() + " ] ");
        }

    }
}
