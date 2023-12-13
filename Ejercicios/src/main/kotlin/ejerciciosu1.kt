import kotlin.Exception

/**
* Pide al usuario una temperatura en grados Celsius y
* la convierte a grados Fahrenheit e imprime por pantalla la temperatura convertida.
*/
fun u1ej4(){
    print("Introduce una temperatura en Celcius: ")
     try {
        val cel = readln().toFloat() * 9 / 5 + 32
        println("La temperatura en grados Fahrenheit es $cel")
    } catch (e: NumberFormatException) {
        println("**ERROR** Temperatura inválida.")
    }
}

/**
 * Pide el importe final de un artículo y calcula e imprime
 * por pantalla el IVA que se ha pagado y el importe sin IVA
 * (suponiendo que se ha aplicado un tipo de IVA del 10%).
 */
fun u1ej6() {
    print("Introduce el precio total del producto: ")
    val iva = 1.10
    try {
        val precioFinal = readln().toDouble()
        val sinIVA = precioFinal / iva
        val ivaPagado = precioFinal - sinIVA
        println("El precio sin iva es de ${String.format("%.2f", sinIVA)}€ y el IVA que se ha pagado es de ${String.format("%.2f", ivaPagado)}€")
    }catch (e: Exception){
        println("**ERROR** Número no válido")
    }
}
/**
 * Pide al usuario su peso (en kg) y estatura (en metros),
 * calcula el índice de masa corporal y lo almacena en una variable,
 * y muestra por pantalla la frase 'Tu índice de masa corporal es ...' donde
 * es el índice de masa corporal calculado redondeado con dos decimales.
 */
fun u1ej12() {
    try {
        print("Introduce su peso (en Kg): ")
        val peso = readln().toFloat()
        print("Introduce su estatura (en metros): ")
        val estatura = readln().toFloat()
        val masa = peso / (estatura * estatura)
        print("Tu índice de masa corporal es ${String.format("%.2f", masa)}")
    } catch (e: Exception){
        println("**ERROR** Número no válido")
    }
}

/**
 * Lee la cantidad de dinero depositada en la cuenta de ahorros,
 * introducida por el usuario. Calcula y muestra por pantalla la cantidad
 * de ahorros tras el primer, segundo y tercer año. Y redondea cada cantidad a dos decimales.
 */
fun u1ej15() {
    val interes = 0.04
    try {
        print("Introduce el dinero depositado: ")
        val primer = readln().toFloat() * (1 + interes)
        val segundo = primer * (1 + interes)
        val tercero = segundo * (1 + interes)
        println("La cantidad de ahorros tras el primer año es de: ${String.format("%.2f", primer)}€")
        println("La cantidad de ahorros tras el segundo año es de: ${String.format("%.2f", segundo)}€")
        println("La cantidad de ahorros tras el tercer año es de: ${String.format("%.2f", tercero)}€")
    } catch (e: Exception){
        print("**ERROR** Número no válido.")
    }
}

/**
 * Pregunta el nombre completo del usuario en la consola
 * y después muestra por pantalla el nombre completo del usuario tres veces,
 * una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra
 * solo con la primera letra del nombre y de los apellidos en mayúscula.
 * El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.
 */
fun u1ej18(){
    print("Introduce tu nombre completo: ")
    val nombre = readln()
    println(nombre.lowercase())
    println(nombre.uppercase())
    println(nombre.capitalize())
}

/**
 * Pregunta por un número de teléfono con formato (+34-913724710-56)
 * y muestra por pantalla el número de teléfono sin el prefijo y la extensión.
 */
fun u1ej20(){
    try {
        print("Introduce tu número de teléfono (por ejemplo +34-913724710-56): ")
        val telefono = readln().split("-")
        println("El número ingresado es: ${telefono[1]}")
    } catch (e: Exception) {
        println("**ERROR** El número introducido no sigue el formato correcto.")
    }

}

/**
 * Pide al usuario que introduzca una frase en la consola y muestra por pantalla la frase invertida.
 */
fun u1ej21() {
    print("Introduce una frase: ")
    val frase = readln()
    println("La frase invertida es: ${frase.reversed()}")
}

/**
 * Pide al usuario que introduzca una frase en la consola y una vocal,
 * y muestra por pantalla la misma frase pero con la vocal introducida en mayúscula.
 */
fun u1ej22() {
    print("Introduzca una frase: ")
    val frase = readln()
    print("Introduzca una vocal: ")
    val vocal = readln()
    println(frase.replace(vocal, vocal.uppercase()))
}

/**
 * Pregunta el precio de un producto en euros con dos decimales
 * y muestre por pantalla el número de euros y el número de céntimos del precio introducido.
 */
fun u1ej24() {
    try {
        print("Introduce el precio del producto en euros con dos decimales (5,50): ")
        val precio = readln().split(",")
        println("El número de euros es de ${precio[0]} y el número de céntimos es de ${precio[1]}")

    } catch (e: Exception) {
        println("**ERROR** El precio introducido no es válido.")
    }
}

/**
 * Pregunta al usuario la fecha de su nacimiento en formato dd/mm/aaaa
 * y muestra por pantalla, el día, el mes y el año.
 */
fun u1ej25() {
    try {
        print("Introduce la fecha en formato dd/mm/aaaa: ")
        val fecha = readln().split("/")
        val dia = fecha[0].toInt()
        val mes = fecha[1].toInt()
        val anio = fecha[2].toInt()
        println("Día $dia del mes $mes del año $anio")
    } catch (e: Exception) {
        println("**ERROR** El formato de la fecha es incorrecto.")
    }
}

/**
 * Pregunta por los productos de una cesta de la compra, separados por comas,
 * y muestra por pantalla cada uno de los productos en una línea distinta.
 */
fun u1ej26() {
    print("Introduce los productos de la cesta de la compra separado por comas sin espacios: ")
    val cesta = readln().split(",")

}


/**
 * Pregunta el nombre el un producto, su precio y un número de unidades
 * y muestra por pantalla una cadena con el nombre del producto seguido
 * de su precio unitario con 6 dígitos enteros y 2 decimales,
 * el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
 */
fun u1ej27() {
    print("Introduce el nombre del producto, su precio y el número de unidades separado por (,): ")
    val producto = readln().split(",")
    val nombre = producto[0]
    val precio = producto[1].toFloat()
    val cantidad = producto[2].toInt()
    val total = precio * cantidad
    println("El nombre del producto es: $nombre, su precio es de: $precio {:6.2f}€, se han vendido un total de $cantidad {:3d} unidades y el coste total es de: $total {:8.2f}€.")
}

