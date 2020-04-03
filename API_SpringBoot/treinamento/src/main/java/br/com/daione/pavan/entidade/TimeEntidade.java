package br.com.daione.pavan.entidade;

import javax.persistence.*;
import java.util.List;

@Entity
public class TimeEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<JogadorEntidade> jogadores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<JogadorEntidade> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<JogadorEntidade> jogadores) {
        this.jogadores = jogadores;
    }
}
