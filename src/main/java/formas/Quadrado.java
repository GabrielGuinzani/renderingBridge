package formas;

import renderizadores.Renderizador;

public class Quadrado extends Forma {

    public Quadrado(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void desenhar() {
        renderizador.renderizarForma("Quadrado");
    }
}