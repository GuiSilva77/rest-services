package com.example.restservices.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PROJETO")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DATA_INICIO", nullable = false)
    private Date dataInicio;

    @Column(name = "DATA_TERMINO")
    private Date dataTermino;

    @Column(name = "VALOR")
    private double valor;

    @Column(name = "COD_FUNC_GER", nullable = false)
    private int codFuncGer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_FUNC_GER", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    private Funcionario gerente;

    public Projeto() {
    }

    public Projeto(int codigo, String nome, Date dataInicio, Date dataTermino, double valor, int codFuncGer, Funcionario gerente) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valor = valor;
        this.codFuncGer = codFuncGer;
        this.gerente = gerente;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodFuncGer() {
        return codFuncGer;
    }

    public void setCodFuncGer(int codFuncGer) {
        this.codFuncGer = codFuncGer;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
}