package br.edu.ifpb.padroes.abstractfactory.produtos.abstracts;

public abstract class Display {
    private String familia;

    public Display(String familia) {
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
        return "Display{" +
                "familia='" + familia + '\'' +
                '}';
    }
}
