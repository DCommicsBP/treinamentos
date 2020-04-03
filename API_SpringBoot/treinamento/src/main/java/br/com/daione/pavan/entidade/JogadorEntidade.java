package br.com.daione.pavan.entidade;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "jogadores")
public class JogadorEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "jogador", nullable = false, unique = true)
    private String nome;
    @Column(name="data_nascimento", nullable = false)
    private Date nascimento;
    @Column(unique = true, nullable =false)
    private String email;

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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
