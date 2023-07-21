package RevisaoPOO;

import java.util.ArrayList;
import java.util.List;

public class Navio {
    private Navegacao navegacao;
    private String nome;
    private int anoFabricacao;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private Double largura;
    private Double comprimento;
    private Double capacidadeDeCarga;
    private List<Container> containers;


    public Navegacao getNavegacao() {
        return navegacao;
    }

    public void setNavegacao(Navegacao navegacao) {
        this.navegacao = navegacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(Double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 10;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;

        }

    }

    public void desacelerar() {
        velocidadeAtual = velocidadeAtual - 3;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void adcionarContainer(Container novoContainer) {
        Double cargaAtual = 0.0;


        if (containers == null) {
            containers = new ArrayList<>();


        }
        for (Container containerCriado : containers) {
            cargaAtual = cargaAtual + containerCriado.getPeso();
        }
        if (cargaAtual + novoContainer.getPeso() <  capacidadeDeCarga){
            containers.add(novoContainer);
        }
        else {System.out.print("capacidade de carga exedida");
        }

    }
    public void removerCarga(int numeroContainer){
        boolean containerIgual = false;
        Container removido = null;
        for(Container containerCriado : containers){
            if (containerCriado.getNumero() == numeroContainer){
                containerIgual = true;
                removido = containerCriado;
                break;
            }
            else{containerIgual = false;
            }
            if (containerIgual == true){
                containers.remove(removido);

            }else
            {System.out.print("Container nao encontrado");}


        }
    }

}