package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstracts.Display;

public abstract  class AbstractFactory {

    public abstract Bateria criarBateriaAbstract();
    public abstract Camera criarCameraAbstract();
    public abstract Display criarDisplayAbstract();
}
