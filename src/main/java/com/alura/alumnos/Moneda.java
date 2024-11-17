package com.alura.alumnos;

/**
 * Representa la conversión de moneda entre dos tipos.
 *
 * @param base_code       Código de la moneda base.
 * @param target_code     Código de la moneda destino.
 * @param conversion_rate Tasa de conversión.
 */
public record Moneda(String base_code, String target_code, Double conversion_rate) {
}
