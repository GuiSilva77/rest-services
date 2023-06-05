package com.example.restservices.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "FUNCIONARIO_PROJETO")
public class FuncionarioProjeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "COD_FUNCIONARIO", nullable = false)
    private int codFuncionario;

    @Column(name = "COD_PROJETO", nullable = false)
    private int codProjeto;

    @Column(name = "DATA_ENTRADA", nullable = false)
    private Date dataEntrada;

    @Column(name = "DATA_SAIDA")
    private Date dataSaida;

    @Column(name = "NUM_HORAS_TRAB", nullable = false)
    private float numHorasTrab;

    public FuncionarioProjeto() {
    }

    public FuncionarioProjeto(int codigo, int codFuncionario, int codProjeto, Date dataEntrada, Date dataSaida, float numHorasTrab) {
        this.codigo = codigo;
        this.codFuncionario = codFuncionario;
        this.codProjeto = codProjeto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numHorasTrab = numHorasTrab;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public int getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(int codProjeto) {
        this.codProjeto = codProjeto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getNumHorasTrab() {
        return numHorasTrab;
    }

    public void setNumHorasTrab(float numHorasTrab) {
        this.numHorasTrab = numHorasTrab;
    }
}
