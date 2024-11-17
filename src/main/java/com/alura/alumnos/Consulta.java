package com.alura.alumnos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    private static final String API_KEY = "585cef5ef8e5696248dcb0d4";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public String obtenerConversion(String base, String destino) throws IOException, InterruptedException {
        String url = BASE_URL + base + "/" + destino;
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
        return respuesta.body();
    }
}
