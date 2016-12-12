package com.igormartire.dominio;

public class DAOMaterial implements DAO<Material> {

  @Override
  public boolean incluir(Material material) {
    return false;
  }

}
