package com.igormartire.iu;

import com.igormartire.dominio.DAO;
import com.igormartire.dominio.Material;

public class IncluirMaterial {

    private DAO<Material> daoMaterial;

    IncluirMaterial(DAO<Material> daoMaterial) {
        this.daoMaterial = daoMaterial;
    }

    public void executar() {
        Material m = getMaterial();
        boolean incluido = this.daoMaterial.incluir(m);
        if (incluido) {
            System.out.println("Material incluído.");
        } else {
            System.out.println("Falha na inclusão do material.");
        }
    }

    private Material getMaterial() {
        return null;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
