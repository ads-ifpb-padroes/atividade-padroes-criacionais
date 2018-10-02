package br.edu.ifpb.padroes.abstractfactory;

import br.edu.ifpb.padroes.abstractfactory.factories.AbstractFactory;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Display;

public class Celular {
    private Bateria bateria;
    private Display display;
    private Camera camera;
    private AbstractFactory factory;

    public Celular(AbstractFactory factory){
        this.factory = factory;
        bateria = factory.criarBateriaAbstract();
        camera = factory.criarCameraAbstract();
        display = factory.criarDisplayAbstract();
    }

    @Override
    public String toString() {
        return "Celular{" +
                "bateria=" + bateria +
                ", display=" + display +
                ", camera=" + camera ;
    }
}
