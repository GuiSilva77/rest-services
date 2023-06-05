package com.example.restservices.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date dataNascimento;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "SEXO", nullable = false)
    private char sexo;

    @Column(name = "SALARIO", nullable = false)
    private double salario;

    @Column(name = "CIDADE", nullable = false)
    private String cidade;

    @Column(name = "UF", nullable = false)
    private String uf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_DEPARTAMENTO", referencedColumnName = "CODIGO")
    private Departamento departamento;

    @Column(name = "DATA_HORA_CADASTRO", nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE()")
    private Date dataHoraCadastro;

    @Column(name = "ATIVO", nullable = false)
    private boolean ativo;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, Date dataNascimento, String cpf, String email, char sexo, double salario, String cidade, String uf, Departamento Departamento, Date dataHoraCadastro, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.salario = salario;
        this.cidade = cidade;
        this.uf = uf;
        this.departamento = Departamento;
        this.dataHoraCadastro = dataHoraCadastro;
        this.ativo = ativo;
    }

    @PrePersist
    protected void onCreate() {
        dataHoraCadastro = new Date();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Departamento getCodDepartamento() {
        return departamento;
    }

    public void setCodDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
