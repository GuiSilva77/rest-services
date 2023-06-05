package com.example.restservices.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "DEPENDENTE")
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date dataNascimento;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PARENTESCO", nullable = false)
    private String parentesco;

    @Column(name = "COD_FUNCIONARIO", nullable = false)
    private int codFuncionario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_FUNCIONARIO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    private Funcionario funcionario;

    public Dependente() {
    }

    public Dependente(int codigo, String nome, Date dataNascimento, String email, String parentesco, int codFuncionario, Funcionario funcionario) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.parentesco = parentesco;
        this.codFuncionario = codFuncionario;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}