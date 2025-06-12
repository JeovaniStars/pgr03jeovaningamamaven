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

    private String nome;

    private String descricao;

    private double cargaHoraria;

    // Construtor vazio (requerido pelo Hibernate)
    public Curso() {
    }

    // Construtor com parâmetros
    public Curso(String nome, String descricao, double cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método para exibir informações do curso
    @Override
    public String toString() {
        return "Curso{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", descricao='" + descricao + '\'' +
               ", cargaHoraria=" + cargaHoraria +
               '}';
    }
}
