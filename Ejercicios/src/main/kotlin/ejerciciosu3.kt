
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
    val asignaturas = mutableListOf<MutableList<Any>>(mutableListOf("Matemáticas",0),mutableListOf("Física",0),mutableListOf("Química",0),mutableListOf("Historia ",0),mutableListOf("Lengua",0))
    try {
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
    } catch (e:Exception) {
        println("ERROR")
    }
}
/**
 * Elimina de la lista las asignaturas que se ha aprobado.
 * @param
 * */
fun borrarAprobadas(asignaturas: MutableList<MutableList<Any>>){
    try {
        for (i in asignaturas.size-1 downTo 0){
            if (asignaturas[i][1] in 5..10) {
                asignaturas.remove(asignaturas[i])
            }
        }
    } catch (e:Exception) {
        println("ERROR")
    }
}

private operator fun Any.compareTo(i: Int): Int {
    return i
}
/**
 * Muestra por pantalla las asignaturas que se deben repetir.
 * @param
 * */
fun mostrarSuspensas(asignaturas: MutableList<MutableList<Any>>) {
    print("Las asignaturas que debes repetir son: ")
    for (i in 0..<asignaturas.size) {
        if (i < asignaturas.size-1){
            print("${asignaturas[i][0]}, ")
        } else if (i == asignaturas.size -1){
            println(asignaturas[i][0])
        }
    }
}

/**
 * Pide al usuario una palabra y muestra por pantalla si es un palíndromo.
 * */
fun u3p1ej8() {
    print("Introduce una palabra: ")
    val palabra = readln()
    val palabraReversa = palabra.reversed()
    if (palabra == palabraReversa) {
        println("Esta palabra es un palíndromo.")
    } else{
        println("Esta palabra NO es un palíndromo.")
    }
}

/**
 * Pide al usuario una palabra y muestra por pantalla el número de veces que contiene cada vocal.
 * */
fun u3p1ej9() {
    print("Introduce una palabra: ")
    val palabra = readln().lowercase().replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u")
    val vocales = listOf(mutableListOf('a', 0),mutableListOf('e', 0),mutableListOf('i', 0),mutableListOf('o', 0),mutableListOf('u', 0))
    for (i in vocales) {
        i[1] = palabra.count{it == i[0] }
    }
    for (i in vocales.indices){
        println("${vocales[i][0]} = ${vocales[i][1]}")

    }
}

/**
 * Almacena en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestra por pantalla el menor y el mayor de los precios.
 * */
fun u3p1ej10() {
    var precios = listOf(50, 75, 46, 22, 80, 65, 8)
    precios = precios.sorted()
    println("El precio menor es de ${precios.first()}€ y el mayor es de ${precios.last()}€")
}

/**
 * Pregunta por una muestra de números, separados por comas, los guarda en una lista y muestra por pantalla su media y desviación típica.
 * */
fun u3p1ej13() {
    print("Introduce números separador por comas: ")
    val num = readln()
    val lista = num.split(",")
    val media = media(lista)
    val desviacion = desviacion(lista)
    println("La media es de: ${String.format("%.2f", media)}")
    println("La desviación típica es de: ${String.format("%.2f", desviacion)}")

}

fun media(lista: List<String>):Double {
    var suma = 0.0
    val division = lista.size
    for (i in lista) {
        suma += i.toInt()
    }
    val media = suma/division
    return media
}

fun desviacion(lista: List<String>) {
    val listaInt = mutableListOf<Int>()
    for (i in lista) {
        listaInt.add(i.toInt())
    }
    val desviacion = "noce"
}