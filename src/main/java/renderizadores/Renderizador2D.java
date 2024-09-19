package renderizadores;

import formas.Forma;

public class Renderizador2D implements Renderizador{
    @Override
    public void renderizarForma( String forma) {
        System.out.println("Renderizando forma: "+forma+" em 2D.");
    }

}
