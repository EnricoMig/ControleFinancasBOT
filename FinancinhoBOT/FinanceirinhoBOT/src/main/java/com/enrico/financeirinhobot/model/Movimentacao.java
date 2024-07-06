/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enrico.financeirinhobot.model;

import java.time.LocalDate;

/**
 *
 * @author Enrico Migliorini
 */
public class Movimentacao {
    private String movimentacao;
    private String entidade;
    private Double valor;
    private LocalDate dia;
    private String escolha;
    private String status;
    private String banco;

    public Movimentacao() {
       super();
    }

    public String getBanco() {
        return banco;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public String getEntidade() {
        return entidade;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getDia() {
        return dia;
    }

    public String getEscolha() {
        return escolha;
    }

    public String getStatus() {
        return status;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
