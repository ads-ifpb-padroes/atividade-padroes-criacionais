package br.edu.ifpb.padroes.abstractfactory.produtos.abstracts;

public abstract class Camera {

    private String familia;

    public Camera(String familia) {
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "familia='" + familia + '\'' +
                '}';
    }
}
