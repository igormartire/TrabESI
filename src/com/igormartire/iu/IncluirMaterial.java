package com.igormartire.iu;

import com.igormartire.dominio.DAO;
import com.igormartire.dominio.DAOMaterial;
import com.igormartire.dominio.Material;

public class IncluirMaterial {

    private DAO<Material> daoMaterial;

    IncluirMaterial(DAO<Material> daoMaterial) {
        this.daoMaterial = daoMaterial;
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
        return null;
    }

    public static void main(String[] args) {
      new IncluirMaterial(new DAOMaterial()).executar();
    }
}
