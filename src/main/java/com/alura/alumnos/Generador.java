package com.alura.alumnos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class Generador {

    /**
     * Guarda la conversión en un archivo JSON.
     *
     * @param moneda Objeto Moneda con los datos de la conversión.
     * @throws IOException En caso de error al guardar el archivo.
     */
    public void guardarJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String archivo = moneda.base_code() + "_to_" + moneda.target_code() + ".json";

        try (FileWriter escritor = new FileWriter(archivo)) {
            escritor.write(gson.toJson(moneda));
        }
    }
}
