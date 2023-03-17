package org.example;

public class ListaEstatica {

    int[] vetor;
    int nroElementos;

    public ListaEstatica(int[] vetor, int nroElementos) {
        this.vetor = new int[10];
        this.nroElementos = 0;
    }

    public int[] getVetor() {
        return vetor;
    }

    public int getNroElementos() {
        return nroElementos;
    }

    public void setNroElementos(int nroElementos) {
        this.nroElementos = nroElementos;
    }

    public void adiciona(int elemento) {
        if(this.vetor.length == this.nroElementos) {
            System.out.println("Lista cheia!");
        }
        else {
            this.vetor[nroElementos] = elemento;
            this.nroElementos++;
        }
    }

    public void exibe() {
        for(int i = 0; i < nroElementos; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int busca(int elemento) {
        for(int i = 0; i < nroElementos; i++) {
            if(this.vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePorIndice(int indice) {
        for(int i = 0; i < nroElementos; i++) {
            
        }
        return false;
    }
}
