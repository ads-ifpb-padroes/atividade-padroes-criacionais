package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.BateriaApple;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.CameraApple;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.DisplayApple;

public class AppleFactory extends AbstractFactory{

    private String familia = "Apple";

    @Override
    public Bateria criarBateriaAbstract() {
        return new BateriaApple(familia);
    }

    @Override
    public Camera criarCameraAbstract() {
        return new CameraApple(familia);
    }

    @Override
    public Display criarDisplayAbstract() {
        return new DisplayApple(familia);
    }
}
