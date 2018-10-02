package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.BateriaMotorolla;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.CameraMotorolla;
import br.edu.ifpb.padroes.abstractfactory.produtos.concrets.DisplayMotorolla;

public class MotorollaFactory extends AbstractFactory {

    private String familia = "Motorolla";

    @Override
    public Bateria criarBateriaAbstract() {
        return new BateriaMotorolla(familia);
    }

    @Override
    public Camera criarCameraAbstract() {
        return new CameraMotorolla(familia);
    }

    @Override
    public Display criarDisplayAbstract() {
        return new DisplayMotorolla(familia);
    }
}
