package br.edu.ifpb.padroes.builder;

public class Pizza {
    private Massa massa;
    private int ingredientes;
    private boolean calabresa;
    private boolean queijo;
    private boolean oregano;
    private boolean carne;
    private boolean milho;
    private boolean cebola;

    

    public Pizza(Massa massa, int ingredientes, boolean calabresa,
                 boolean queijo, boolean oregano, boolean carne,
                 boolean milho, boolean cebola) {
        this.massa = massa;
        this.ingredientes = ingredientes;
        this.calabresa = calabresa;
        this.queijo = queijo;
        this.oregano = oregano;
        this.carne = carne;
        this.milho = milho;
        this.cebola = cebola;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public int getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(int ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isCalabresa() {
        return calabresa;
    }

    public void setCalabresa(boolean calabresa) {
        this.calabresa = calabresa;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isOregano() {
        return oregano;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    public boolean isCarne() {
        return carne;
    }

    public void setCarne(boolean carne) {
        this.carne = carne;
    }

    public boolean isMilho() {
        return milho;
    }

    public void setMilho(boolean milho) {
        this.milho = milho;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa=" + massa +
                ", ingredientes=" + ingredientes +
                ", calabresa=" + calabresa +
                ", queijo=" + queijo +
                ", oregano=" + oregano +
                ", carne=" + carne +
                ", milho=" + milho +
                ", cebola=" + cebola +
                '}';
    }
}
