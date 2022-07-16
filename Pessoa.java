package atividade03tcpobjetos;

import java.io.Serializable;

/**
 *
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 */
public class Pessoa implements Serializable {
        
    private String nome;
    private int idade;
    
    public Pessoa() {
        
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
