package com.igormartire.dominio;

public class Material {
  private String nome;
  private String descricao;
  private double precoUnitario;

  Material(String nome, String descricao, double precoUnitario) {
    this.nome = nome;
    this.descricao = descricao;
    this.precoUnitario = precoUnitario;
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

  public double getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }

  @Override
  public String toString() {
    return String.format("%s,%s,%.2f", this.nome, this.descricao, this.precoUnitario);
  }

}
