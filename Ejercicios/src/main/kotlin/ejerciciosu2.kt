// PARTE 1 -> Sentencias condicionales: 2, 3, 6, 8 y 10.

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

/**
 * Muestra los ingredientees de la pizza dependiendo del tipo de pizza elegido.
 * @param pizza: Int número con el tipo de pizza que quiere.
 * @return String mensaje con los ingredientes.
 */
fun pizzas(pizza: Int):String {
    return when (pizza) {
        1 -> "Estos son los ingredientes vegetarianos:\n- Pimiento\n- Tofu"
        2 -> "Estos son los ingredientes no vegetarianos: \n- Peperoni\n- Jamón\n- Salmón"
        else -> "**ERROR**"
    }
}



// PARTE 2 -> Sentencias iterativas: 2, 4, 6, 7, 8, 13, 15, 18, 19 y 25.


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
            for (i in num downTo 0) {
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

/**
 * Pide al usuario un número entero y muestra por pantalla
 * un triángulo rectángulo de altura el número introducido.
 * */
fun u2p2ej6() {
    try {
        print("Introduce la altura del triángulo: ")
        val altura = readln().toInt()
        var piramide = ""
        if (altura <= 0) {
            println("El número introducido debe ser mayor a 0")
        } else {
            for (i in 1..altura) {
                piramide += "*"
                println(piramide)
            }
        }

    } catch (e: Exception) {
        println("**ERROR**")
    }
}

/**
 * Muestra por pantalla la tabla de multiplicar del 1 al 10.
 * */
fun u2p2ej7() {
    var num = 1
    var multi = 0
    var cont = 1
    for (i in 1..10) {
        num = 1
        multi++
        println("")
        println("TABLA DEL ${cont++}")
        for (j in 1..10) {
            var resultado = num * multi
            println("$num x $multi = $resultado")
            num++
        }
    }
}

/**
 * Pide al usuario un número entero para la altura y muestra por pantalla
 * un triángulo rectángulo formado por números inversos de solo los impares.
 * */
fun u2p2ej8() {
    try {
        print("Introduce un número entero para la altura de la piramide: ")
        val num = readln().toInt()
        var cont = 1
        var cont2 = 1
        var triangulo = ""
        if (num < 0) {
            println("El número introducido debe ser positivo.")
        }
        else {
            do {
                triangulo = "$cont2 $triangulo"
                println(triangulo)
                cont++
                cont2 += 2
            }while (cont <= num)
        }
    } catch (e: Exception) {
        println("**ERROR**")
    }
}

/**
 * Muestra el eco de lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.
 * */
fun u2p2ej13() {
    print("Introduce lo que quieras y el eco hará lo suyo ('salir' para terminar): ")
    var eco = readln()
    while (eco != "salir") {
        println(eco)
        println("")
        print("Sigue escribiendo o escribe 'salir' para terminar: ")
        eco = readln()
    }
}

/**
 * Lee números enteros del teclado, hasta que el usuario ingrese el 0.
 * Finalmente, muestra la sumatoria de todos los números positivos ingresados.
 * */
fun u2p2ej15() {
    try {
        print("Introduce un número entero (0 para salir): ")
        var num = readln().toInt()
        var suma = 0
        do {
            if (num > 0) {
                suma += num
            }
            print("Introduce otro número o 0 para terminar: ")
            num = readln().toInt()
        } while (num != 0)
        println("La suma total de los números introducidos es: $suma")
    } catch (e: Exception) {
        println("**ERROR**")
    }
}

/**
 * Solicita al usuario que ingrese números enteros positivos y, por cada uno,
 * imprime la suma de los dígitos que lo componen. La condición de corte es que se ingrese el número -1.
 * Al finalizar, muestra cuántos de los números ingresados por el usuario fueron números pares.
 * */
fun u2p2ej18() {
    try {
        var pares = 0
        do {
            print("Introduce un número positivo (-1 para salir): ")
            val num = readln().toInt()
            var suma = 0
            if (num < -1) {
                print("El número debe ser positivo o -1 para salir")
            } else if (num != -1){
                for (i in num.toString()) {
                    suma += i.toString().toInt()
                }
                println("$num = $suma")
                if (sonpares(num) && num != 0) {
                    pares++
                }
            }
        } while (num != -1)
        println("\nLa cantidad de pares introducidos es de $pares")
    } catch (e: Exception) {
        println("**ERROR**")
    }
}

/**
 * Devuelve true si el numero introducido es par y false si no lo es
 * @param num: Int número que ha introducido el usuario
 * @return Boolean si es par es true y si es impar es false.
 * */
fun sonpares(num:Int):Boolean = num % 2 == 0

/**
 * Muestra un menú con tres opciones:
 * 1- comenzar programa, 2- imprimir listado, 3-finalizar programa.
 * Pide una opción, si elige una opción incorrecta se informa del error.
 * Se muestra luego de ejecutada cada opción, permitiendo volver a elegir.
 * Las opciones 1 ó 2 imprime un texto. La opción 3,
 * se interrumpe la impresión del menú y el programa finaliza.
 * */
fun u2p2ej19() {
    println("1- Comenzar programa\n2- Imprimir listado\n3- Finalizar programa\n")
    try {
        do {
            print("\n>> Elige una opción: ")
            var option = readln().toInt()
            when (option) {
                1 -> println("Esta es la opción 1\n>> Está comenzando el programa...")
                2 -> println("Esta es la opción 2\n>> Se está imprimiendo el listado...")
                else -> println("**ERROR** opción errónea.")
            }
        } while (option != 3)
    } catch (e: Exception) {
        println("**ERROR**")
    }
    }

/**
 * Solicita al usuario que ingrese una frase y luego muestra
 * cuál fue la palabra más larga y cuántas palabras había.
 * */
fun u2p2ej25() {
    print("Introduce una frase: ")
    val frase = readln()
    if (frase == "" || frase == " "){
        println("**ERROR**")
    } else {
        val palabras = frase.split(" ")
        var palabraLarga = ""
        for (i in palabras) {
            if (palabraLarga.length < i.length) {
                palabraLarga = i
            }
        }
        println("La palabra más larga es $palabraLarga de un total de ${palabras.count()}")
    }

}

 // PARTE 3 -> Captura de excepciones: 2, 3 y 4.

/**
 * Pide al usuario un número entero positivo y muestra por pantalla
 * todos los números impares desde 1 hasta ese número separados por comas.
 * */
fun u2p3ej2() {
    try {
        print("Introduce un número entero positivo: ")
        val num = readln().toInt()
        if (num <= 0) {
            println("**ERROR** número no valido.")
        } else {
            for (i in 1..num step 2) {
                if (i < num - 1){
                    print("$i, ")
                } else {
                    println(i)
                }
            }
        }
    } catch (e: Exception) {
        println("**ERROR** el número no es valido.")
    }
}

/**
 * Pide al usuario un número entero positivo y muestra por pantalla
 * la cuenta atrás desde ese número hasta cero separados por comas.
 * Solicita el número hasta introducir uno correcto.
 * */
fun u2p3ej3() {
    try {
        print("Introduce un número entero positivo: ")
        var num = readln().toInt()
        while (num <= 0) {
            println("**ERROR** número no valido.")
            print("Introduce un número entero positivo: ")
            num = readln().toInt()
        }
        for (i in num downTo 0){
            if (i > 0){
                print("$i, ")
            }else {
                println(i)
            }
        }
    } catch (e: Exception) {
        println("**ERROR** el número introducido no es válido.")
    }
}

/**
 * Pide al usuario un número entero, si la entrada no es correcta,
 * muestra el mensaje "La entrada no es correcta" y lanzará la excepción capturada.
 * */
fun u2p3ej4(){
    print("Introduce un número entero: ")
    val num = readln()
    try {
        num.toInt()
        println("El número introducido es válido.")
    } catch (e: Exception){
        println("**ERROR** La entrada no es correcta.")
    }
}