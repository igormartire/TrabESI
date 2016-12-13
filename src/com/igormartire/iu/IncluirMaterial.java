package com.igormartire.iu;

import com.igormartire.dominio.DAO;
import com.igormartire.dominio.DAOMaterial;
import com.igormartire.dominio.Material;

import java.util.Scanner;

public class IncluirMaterial {

  private DAO<Material> daoMaterial;
  private Scanner scanner;

  IncluirMaterial(DAO<Material> daoMaterial, Scanner scanner) {
    this.daoMaterial = daoMaterial;
    this.scanner = scanner;
  }

  public void executar() {
    Material m = recebeMaterial();
    boolean incluido = this.daoMaterial.incluir(m);
    if (incluido) {
      System.out.println("Material incluído.");
    } else {
      System.out.println("Falha na inclusão do material.");
    }
  }

  private Material recebeMaterial() {
    System.out.println("Formulário para inclusão de material");
    System.out.println("------------------------------------");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Descrição: ");
    String descricao = scanner.nextLine();
    double precoUnitario = 0;
    boolean entradaValida = false;
    while (!entradaValida) {
      System.out.print("Preço unitário: ");
      String precoUnitarioStr = scanner.nextLine();
      try {
        precoUnitario = Double.parseDouble(precoUnitarioStr);
        if (precoUnitario < 0) {
          System.out.println("Valor inválido. Entre com um valor não-negativo.");
        } else {
          entradaValida = true;
        }
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido. Entre com um número real.");
      }
    }
    return new Material(nome, descricao, precoUnitario);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    new IncluirMaterial(new DAOMaterial(), scanner).executar();
    scanner.close();
  }
}
