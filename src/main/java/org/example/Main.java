package org.example;

import formas.Circulo;
import formas.Quadrado;
import renderizadores.Renderizador2D;
import renderizadores.Renderizador3D;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Renderizador2D renderizador2D = new Renderizador2D();
        Renderizador3D renderizador3D = new Renderizador3D();

        Circulo circulo2D = new Circulo(renderizador2D);
        Circulo circulo3D = new Circulo(renderizador3D);

        Quadrado quadrado2D = new Quadrado(renderizador2D);
        Quadrado quadrado3D = new Quadrado(renderizador3D);

        circulo2D.desenhar();
        circulo3D.desenhar();
        quadrado2D.desenhar();
        quadrado3D.desenhar();
    }
}