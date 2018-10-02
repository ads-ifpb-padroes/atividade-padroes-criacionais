package br.edu.ifpb.padroes.builder;

public class Pizza {
    private Massa massa;
    private int ingredientes;
    private boolean calabresa;
    private boolean queijo;
    private boolean oregano;
    private boolean carne;
    private boolean azeitona;
    private boolean cebola;

    public Pizza(Massa massa, int ingredientes, boolean calabresa,
                 boolean queijo, boolean oregano, boolean carne,
                 boolean azeitona, boolean cebola) {
        this.massa = massa;
        this.ingredientes = ingredientes;
        this.calabresa = calabresa;
        this.queijo = queijo;
        this.oregano = oregano;
        this.carne = carne;
        this.azeitona = azeitona;
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
                ", milho=" + azeitona +
                ", cebola=" + cebola +
                '}';
    }
}
