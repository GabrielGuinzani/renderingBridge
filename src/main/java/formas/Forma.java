package formas;
import renderizadores.Renderizador;

public abstract class Forma {
    protected Renderizador renderizador;

    public Forma(Renderizador renderizador) {
        this.renderizador = renderizador;
    }

    public abstract void desenhar();
}