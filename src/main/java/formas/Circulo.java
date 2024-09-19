package formas;

import renderizadores.Renderizador;

public class Circulo extends Forma {

    public Circulo(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void desenhar() {
        renderizador.renderizarForma("Circulo");
    }
}