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
 * Programa de demostración de la clase {@link Calculadora}.
 *
 * <p>Ejecuta una serie de operaciones aritméticas de ejemplo y muestra
 * los resultados por la salida estándar. Sirve como punto de entrada
 * para probar manualmente el comportamiento de {@link Calculadora}
 * durante las prácticas de Integración Continua.</p>
 *
 * <p><strong>Nota para el alumnado:</strong> los resultados que imprime
 * esta demo reflejan la implementación <em>real</em> de {@link Calculadora},
 * que contiene errores intencionados. Compara la salida con el contrato
 * descrito en el Javadoc de cada método para detectar las discrepancias.</p>
 *
 * @author  Miguel Jaque Barbero (mjaqueb01@educarex.es) - IES Castelar
 * @version 1.0
 * @since   1.0
 * @see     Calculadora
 */
public class DemoCalculadora {

    /**
     * Punto de entrada del programa de demostración.
     *
     * <p>Realiza las siguientes operaciones y muestra el resultado por
     * consola:</p>
     * <ul>
     *   <li>Suma de 2 y 3</li>
     *   <li>Resta de 2 y 3</li>
     *   <li>Comprobación de si 1223 es par</li>
     * </ul>
     *
     * @param args argumentos de línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("=== DEMO DE CALCULADORA ===");
        System.out.println("\t3 + 2 = " + calculadora.sumar(2, 3));
        System.out.println("\t3 - 2 = " + calculadora.restar(2, 3));
        System.out.println("\t1223 es par= " + calculadora.esPar(1223));
        System.out.println("\n");
    }
}