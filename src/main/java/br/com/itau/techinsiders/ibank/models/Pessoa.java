package br.com.itau.techinsiders.ibank.models;
 
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
 
@Entity
public class Pessoa implements Serializable {
 
    /**
     *
     */
    private static final long serialVersionUID = 5859808752828620408L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //funcionando : generator = "increment"   strategy = GenerationType.AUTO
    // @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
 
    @Column(name = "pes_nome")
    private String nome;
 
    @Column(name = "pes_telefone", unique = true)
    private String telefone;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public Pessoa() {
 
    }
 
}