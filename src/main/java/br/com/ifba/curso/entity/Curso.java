package br.com.ifba.curso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 

@Entity 
@Table(name = "cursos") // Nome da tabela no banco de dados 
public class Curso {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento no banco de dados 
    private Long id;

    private String codigoCurso;  

    private String nome;

    private String descricao;

    private boolean ativo;  

    // Construtor vazio (requerido pelo Hibernate)
    public Curso() {
    }

    // Construtor com parâmetros (incluindo ativo)
    public Curso(String codigoCurso, String nome, String descricao, boolean ativo) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Método para exibir informações do curso
    @Override
    public String toString() {
        return "Curso{" +
               "id=" + id +
               ", codigoCurso='" + codigoCurso + '\'' +
               ", nome='" + nome + '\'' +
               ", descricao='" + descricao + '\'' +
               ", ativo=" + ativo +
               '}';
    }
}
