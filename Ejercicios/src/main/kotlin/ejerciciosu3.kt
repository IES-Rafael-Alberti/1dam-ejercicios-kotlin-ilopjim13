// PARTE 1 -> Listas y tuplas: 4, 6, 8, 9, 10 y 13.

/**
 * Pregunta al usuario los números ganadores de la lotería primitiva,
 * los almacene en una lista y los muestra por pantalla ordenados de menor a mayor.
 * */
fun u3p1ej4() {
    val numeros = mutableListOf<Int>()
    try {
        for (i in 1..6){
            print("Introduce los números de la lotería: ")
            var num = readln().toInt()
            while(num <= 0 || num > 49){
                print("Introduce un numero entre 1 y 49: ")
                num = readln().toInt()
            }
            while (num in numeros){
                print("Número ya introducido, introduce uno nuevo: ")
                num = readln().toInt()
            }
            numeros.add(num)
        }
        numeros.sort()
        pedirReintegro(numeros)
        mostrarLoteria(numeros)
    } catch (e: Exception) {
        println("**ERROR**")
    }
}

/**
 * Pide el reintegro y lo añade a la lista
 * @param numeros: MutableList<Int> -> lista mutable con los numeros de la lotería
 * */
fun pedirReintegro(numeros: MutableList<Int>) {
    try {
        print("Reintegro -> ")
        var reintegro = readln().toInt()
        while (reintegro < 0 || reintegro > 9){
            print("EL reintegro debe estar entre el 0 y el 9\nReintegro -> ")
            reintegro = readln().toInt()
        }
        numeros.add(reintegro)
    } catch (e: Exception){
        println("**ERROR**")
    }

}

/**
 * Imprime por pantalla los numeros de la lotería
 * @param numeros: MutableList<Int> -> lista mutable con los numeros de la lotería
 * */
fun mostrarLoteria(numeros: MutableList<Int>) {
    val num1 = numeros.subList(0,6)
    val reintegro1 = numeros.last()
    println("\nTus numeros son: ${num1.joinToString(" ")}")
    println("Tu reintegro es: $reintegro1")
    println("\nLa lista con los numeros es $numeros")
}


/**
 * Almacena las asignaturas de un curso en una lista, pregunta al usuario
 * la nota que ha sacado en cada asignatura y elimina de la lista las asignaturas aprobadas.
 * Al final el programa muestra por pantalla las asignaturas que el usuario tiene que repetir.
 * */
fun u3p1ej6() {
    var asignaturas = mutableListOf<MutableList<Any>>(mutableListOf("Matemáticas",0),mutableListOf("Física",0),mutableListOf("Química",0),mutableListOf("Historia ",0),mutableListOf("Lengua",0))
    for (i in 0..<asignaturas.count()) {
        print("Introduce la nota de ${asignaturas[i][0]}: ")
        var nota = readln().toInt()
        while (nota < 0 || nota > 10) {
            print("La nota introducida debe ser entre 0 y 10.\nIntroduce la nota de ${asignaturas[i][0]}: ")
            nota = readln().toInt()
        }
        asignaturas[i][1] = nota
    }
    borrarAprobadas(asignaturas)
    mostrarSuspensas(asignaturas)
}

fun borrarAprobadas(asignaturas: MutableList<MutableList<Any>>){
    for (i in asignaturas.count() downTo 0){
        if (asignaturas[i][1] >= 5) {
            asignaturas.remove(asignaturas[i])
        }
    }
}

private operator fun Any.compareTo(i: Int): Int {
    return i
}

fun mostrarSuspensas(asignaturas: MutableList<MutableList<Any>>) {
    println("Las asignaturas que debes repetir son: ${asignaturas.joinToString(separator = " ")}")
}






