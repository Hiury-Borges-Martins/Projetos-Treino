/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pessoal
 */
@Entity
public class Professor {

    @Id
    @GeneratedValue
    private long registro;
    @Column(length = 50, nullable = true)
    private String nome;
    @Column(length = 20, nullable = true)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(length = 17)
    private String telefone;
    @Column(length = 30)
    private String email;
    @Column(length = 7)
    private double salario;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Professor() {
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Professor{" + "registro=" + registro + ", nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + ", telefone=" + telefone + ", email=" + email + ", salario=" + salario + ", endereco=" + endereco + '}';
    }

}
