package com.ulima.poo.clases.ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        SerHumano objHumano = new SerHumano();
        
        objHumano.setNombre("Naruto");
        objHumano.setEdad(15);
        objHumano.setColorOjos("Azul");

        objHumano.verCaracteristicas();

    }
}