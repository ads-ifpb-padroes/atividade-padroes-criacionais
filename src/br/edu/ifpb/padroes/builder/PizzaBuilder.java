package br.edu.ifpb.padroes.builder;

public class PizzaBuilder {

    private Massa massa;
    private final int quantidade_maxima = 3;
    private static int ingredientes;
    private boolean calabresa;
    private boolean queijo;
    private boolean oregano;
    private boolean carne;
    private boolean milho;
    private boolean cebola;


    public PizzaBuilder comMassa(Massa massa) {
        this.massa = massa;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCalabresa(boolean calabresa) {
        this.calabresa = calabresa;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comQueijo(boolean queijo) {
        this.queijo = queijo;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comOregano(boolean oregano) {
        this.oregano = oregano;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCarne(boolean carne) {
        this.carne = carne;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comMilho(boolean milho) {
        this.milho = milho;
        quantidadeIngredientes();
        return this;
    }

    public PizzaBuilder comCebola(boolean cebola) {
        this.cebola = cebola;
        quantidadeIngredientes();
        return this;
    }

    public Pizza build(){
        return new Pizza(massa, ingredientes, calabresa,
                queijo, oregano, carne, milho, cebola);
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
