/*
 * Copyright (c) 2026 IES Castelar
 *
 * Este programa es software libre: puedes redistribuirlo y/o modificarlo
 * bajo los términos de la Licencia Pública General de GNU publicada por
 * la Free Software Foundation, ya sea la versión 3 de la Licencia, o
 * (a tu elección) cualquier versión posterior.
 *
 * Este programa se distribuye con la esperanza de que sea útil, pero
 * SIN NINGUNA GARANTÍA; incluso sin la garantía implícita de
 * COMERCIABILIDAD o IDONEIDAD PARA UN PROPÓSITO PARTICULAR. Consulta la
 * Licencia Pública General de GNU para más detalles.
 *
 * Deberías haber recibido una copia de la Licencia Pública General de
 * GNU junto con este programa. Si no es así, consulta
 * <https://www.gnu.org/licenses/>.
 */

package com.iescastelar;

/**
 * Clase de utilidades matemáticas básicas.
 *
 * <p>Proporciona operaciones aritméticas sencillas (suma y resta) y
 * comprobaciones de paridad. Se utiliza como proyecto base para las
 * prácticas de Integración Continua del módulo de Entornos de Desarrollo.</p>
 *
 * @author  Miguel Jaque Barbero (mjaqueb01@educarex.es) - IES Castelar
 * @version 1.0
 * @since   1.0
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a el primer sumando
     * @param b el segundo sumando
     * @return  la suma de {@code a} y {@code b}
     */
    public Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * <p>Calcula la diferencia {@code a - b}.</p>
     *
     * @param a el minuendo
     * @param b el sustraendo
     * @return  el resultado de restar {@code b} a {@code a}
     */
    public Integer restar(Integer a, Integer b) {
        return a + b; // ERROR INTENCIONADO: debería ser a - b
    }

    /**
     * Comprueba si un número entero es par.
     *
     * <p>Un número es par cuando el resto de su división entera entre 2
     * es igual a cero.</p>
     *
     * @param numero el número entero a comprobar
     * @return       {@code true} si {@code numero} es par;
     *               {@code false} en caso contrario
     */
    public Boolean esPar(Integer numero) {
        return numero % 2 != 0; // ERROR INTENCIONADO: debería ser == 0
    }

    /**
     * Concatena los números enteros desde {@code 0} hasta {@code n - 1}
     * en una única cadena de texto.
     *
     * <p>Ejemplo: para {@code n = 3}, el resultado es {@code "012"}.</p>
     *
     * <p><strong>Advertencia:</strong> este método realiza la concatenación
     * dentro de un bucle. La herramienta de análisis estático SpotBugs
     * reportará la advertencia
     * {@code SBSC_USE_STRINGBUFFER_CONCATENATION}, recomendando el uso de
     * {@link java.lang.StringBuilder} para mejorar el rendimiento. Se incluye
     * deliberadamente para que el alumnado observe cómo el pipeline de
     * Integración Continua detecta este tipo de problemas.</p>
     *
     * @param n el número de enteros a concatenar; debe ser mayor o igual que 0
     * @return  una cadena con los dígitos {@code 0} a {@code n - 1} concatenados
     * @see     java.lang.StringBuilder
     */
    public String concatenarNumeros(Integer n) {
        String resultado = "";
        for (Integer i = 0; i < n; i++) {
            resultado = resultado + i; // SpotBugs detectará SBSC
        }
        return resultado;
    }
}
