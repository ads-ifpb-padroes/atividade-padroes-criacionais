package br.edu.ifpb.padroes.builder;

public class Loader {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder()
                .comCalabresa()
                .comMassa(Massa.PAN)
                .comCarne()
                .comCebola()
                .build();

        System.out.println(pizza.toString());
    }
}
