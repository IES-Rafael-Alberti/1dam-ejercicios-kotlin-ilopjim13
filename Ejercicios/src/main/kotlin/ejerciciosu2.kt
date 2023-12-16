import com.sun.jdi.connect.Connector.Argument

// Sentencias condicionales: 2, 3, 6, 8 y 10.

/**
 * Almacena la cadena de caracteres contraseña en una variable,
 * pregunta al usuario por la contraseña e imprime por pantalla si la contraseña introducida
 * coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
*/
fun u2p1ej2() {
    val pass = "contraseña"

    print("Introduce la constraseña: ")
    val contra = readln().lowercase()
    if (pass == contra) {
        println("La contraseña introducida es correcta.")
    } else {
        println("La contraseña introducida es incorrecta.")
    }
}

/**
 * Pide al usuario dos números y muestra por pantalla su división.
 * Si el divisor es cero el programa debe mostrar un error.
 */
fun u2p1ej3() {
    try {
        print("Introduce el primer número: ")
        val num1 = readln().toInt()
        print("Introduce el segundo número: ")
        val num2 = readln().toInt()
        if (num2 == 0) {
            println("**ERROR** el número introducido no puede ser un 0")
        }else {
             val resultado = num1.toFloat() / num2
            println("El resultado de la división entre $num1 y $num2 es igual a $resultado")
        }
    } catch (e: Exception) {
        println("**ERROR** El número introducido no es válido.")
    }
}


/**
 * Pregunta al usuario su nombre y sexo, y muestra por pantalla el grupo que le corresponde.
 */
fun u2p1ej6() {
    print("Introduce tu nombe: ")
    val nombre = readln().lowercase()
    print("Introduce tu sexo (hombre/mujer): ")
    val sexo = readln().lowercase()

    if (sexo == "mujer" && nombre < "m" || sexo == "hombre" && nombre > "n") {
        println("Estas en el grupo A")
    } else {
        println("Estas en el grupo B")
    }
}

/**
 * En una determinada empresa, sus empleados son evaluados al final de cada año.
 * Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando,
 * traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados
 * pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas.
 * A continuación se muestra una tabla con los niveles correspondientes a cada puntuación.
 * La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
 */
fun u2p1ej8() {
    try {
        print("Introduce la puntuación del empleado: ")
        val puntos = readln().toFloat()
        if (puntos >= 0.0 && puntos < 0.1){
            println("El nivel de rendimiento es inaceptable por lo que la cantidad recibida será de 0 euros.")
        }
        else if (puntos >= 0.4 && puntos < 0.5){
            println("El nivel es aceptable por lo que la cantidad recibida será de ${puntos * 2400}€.")
        }
        else if (puntos >= 0.6) {
            println("El nivel es meritorio por lo que la cantidad recibida será de ${puntos * 2400}€")
        }
        else {
            println("La puntuación introducida no es válida.")
        }
    } catch (e: Exception) {
        println("**ERROR** la puntuación introducida no es válida.")
    }
}

/**
 * Pregunta al usuario si quiere una pizza vegetariana o no, y en función de su respuesta
 * muestra un menú con los ingredientes disponibles para que elija.
 * Y muestra por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva.
 * */
fun u2p1ej10() {
    print("Elige entre la pizza vegetariana (1) o la no vegetariana (2): ")
    val pizza = readln().toInt()
    println(pizzas(pizza))
    if (pizza == 1) {
        print("Eliga un ingrediente para su pizza: Pimiento (1) o Tofu (2): ")
        val ingrediente = readln().toInt()
        when (ingrediente) {
            1 -> println("Su pizza elegida es la vegetariana con pimiento como ingrediente.")
            2 -> println("Su pizza elegida es la vegetariana con tofu como ingrediente.")
            else -> println("**ERROR**")
        }
    }
    if (pizza == 2) {
        print("Eliga un ingrediente para su pizza: Peperoni (1), Jamón (2) o Salmón(3) : ")
        val ingredienteNoVegano = readln().toInt()
        when (ingredienteNoVegano) {
            1 -> println("Su pizza elegida es la no vegetariana con peperoni como ingrediente.")
            2 -> println("Su pizza elegida es la no vegetariana con jamón como ingrediente.")
            3 -> println("Su pizza elegida es la no vegetariana con salmón como ingrediente.")
            else -> println("**ERROR**")
        }
    }
}

fun pizzas(pizza: Int):String {
    when (pizza) {
        1 -> return "Estos son los ingredientes vegetarianos:\n- Pimiento\n- Tofu"
        2 -> return "Estos son los ingredientes no vegetarianos: \n- Peperoni\n- Jamón\n- Salmón"
        else -> return "**ERROR**"
    }
}



// Sentencias iterativas: 2, 4, 6, 7, 8, 13, 15, 18, 19 y 25.


/**
 * Pregunta al usuario su edad y muestra por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
 * */
fun u2p2ej2() {
    try {
        print("Introduce su edad: ")
        val edad = readln().toInt()
        for (i in 1..edad) {
            if (i < edad) {
                print("$i, ")
            } else {
                println(i)
            }
        }
    } catch (e: Exception) {
        println("**ERROR** la edad introducida no es válida.")
    }
}


/**
 * Pide al usuario un número entero positivo y muestra por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
 * */
fun u2p2ej4() {
    try {
        print("Introduce un número positivo: ")
        val num = readln().toInt()
        if (num < 0) {
            println("**ERROR** el número introducido debe ser positivo.")
        }
        else {
            for (i in num..0) {
                if (i > 0) {
                    print("$i, ")
                } else {
                    println(i)
                }
            }
        }
    } catch (e: Exception) {
        println("**ERROR** el número introducido no es válido.")
    }
}














