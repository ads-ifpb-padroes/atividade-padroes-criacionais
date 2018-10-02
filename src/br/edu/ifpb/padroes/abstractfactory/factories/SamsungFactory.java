package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.BateriaSamsung;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.CameraSamsung;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.DisplaySamsung;

public class SamsungFactory extends AbstractFactory{

    private String familia = "Samsung";

    @Override
    public Bateria criarBateriaAbstract() {
        return new BateriaSamsung(familia);
    }

    @Override
    public Camera criarCameraAbstract() {
        return new CameraSamsung(familia);
    }

    @Override
    public Display criarDisplayAbstract() {
        return new DisplaySamsung(familia);
    }
}
