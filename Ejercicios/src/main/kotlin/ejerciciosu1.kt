import kotlin.Exception

/**
* Pide al usuario una temperatura en grados Celsius y
* la convierte a grados Fahrenheit e imprime por pantalla la temperatura convertida.
*/
fun u1ej1(){
    print("Introduce una temperatura en Celcius: ")
     try {
        var cel = readln().toFloat() * 9 / 5 + 32
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
fun u1ej2() {
    print("Introduce el precio total del producto: ")
    val IVA = 1.10
    try {
        var precioFinal = readln().toDouble()
        val sinIVA = precioFinal / IVA
        val IVApagado = precioFinal - sinIVA
        println("El precio sin iva es de ${sinIVA}€ y el IVA que se ha pagado es de ${IVApagado}€")
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
fun u1ej3() {
    try {
        print("Introduce su peso (en Kg): ")
        val peso = readln().toFloat()
        print("Introduce su estatura (en metros): ")
        val estatura = readln().toFloat()
        val masa = peso / (estatura * estatura)
        print("Tu índice de masa corporal es $masa")
    } catch (e: Exception){
        println("**ERROR** Número no válido")
    }
}