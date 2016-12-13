package com.igormartire.dominio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DAOMaterial implements DAO<Material> {

  private String arquivoMaterial;

  public DAOMaterial(String arquivoMaterial) {
    this.arquivoMaterial = arquivoMaterial;
  }

  @Override
  public boolean incluir(Material material) {
    try (Writer fileWriter = new FileWriter(this.arquivoMaterial, true)) {
      fileWriter.write(material.toString() + "\n");
    } catch (IOException ex) {
      return false;
    }
    return true;
  }

}
