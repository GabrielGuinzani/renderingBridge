package renderizadores;


import formas.Forma;

public class Renderizador3D implements Renderizador {

    @Override
    public void renderizarForma(String forma) {
        System.out.println("Renderizando " + forma + " em 3D.");

    }
}