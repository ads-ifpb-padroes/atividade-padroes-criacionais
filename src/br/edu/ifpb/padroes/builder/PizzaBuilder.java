package br.edu.ifpb.padroes.builder;

public class PizzaBuilder {

    private Massa massa;
    private final int quantidade_maxima = 3;
    private static int ingredientes;
    private boolean calabresa;
    private boolean queijo;
    private boolean oregano;
    private boolean carne;
    private boolean azeitona;
    private boolean cebola;


    public PizzaBuilder comMassa(Massa massa) {
        this.massa = massa;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCalabresa() {
        this.calabresa = true;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comQueijo() {
        this.queijo = true;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comOregano() {
        this.oregano = true;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCarne() {
        this.carne = true;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comAzeitona() {
        this.azeitona = true;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCebola() {
        this.cebola = true;
        quantidadeIngredientes();
        return this;
    }

    public Pizza build(){
        return new Pizza(massa, ingredientes, calabresa,
                queijo, oregano, carne, azeitona, cebola);
    }

    private void quantidadeIngredientes(){
        ingredientes++;
        if(ingredientes>quantidade_maxima){
            try {
                throw  new IngredientesException("quantidade máxima de ingredientes atingida!");
            } catch (IngredientesException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
