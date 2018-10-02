package br.edu.ifpb.padroes.abstractfactory;

import br.edu.ifpb.padroes.abstractfactory.factories.AppleFactory;
import br.edu.ifpb.padroes.abstractfactory.factories.MotorollaFactory;
import br.edu.ifpb.padroes.abstractfactory.factories.SamsungFactory;

public class Loader {
    public static void main(String[] args) {

        Celular celular = new Celular(new SamsungFactory());
        System.out.println(celular.toString());
    }
}
