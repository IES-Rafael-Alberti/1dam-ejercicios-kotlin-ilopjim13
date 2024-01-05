import java.util.*

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
    val desviacion = "FALTA ESTO NO TENGO NI IDEA DE COMO SE HACE AYUDA"
}



// PARTE 2 -> Diccionarios: 3, 5, 6, 7, 8, 10 y 11.

/**
 * Guarda en un diccionario los precios de las frutas, pregunta al usuario por una fruta, un número de kilos
 * y muestra por pantalla el precio de ese número de kilos de fruta.
 * Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.
 * */
fun u3p2ej3() {
    val frutas = mapOf("platano" to 1.35, "manzana" to 0.80, "pera" to 0.85, "naranja" to 0.70)
    print("Introduce el nombre de la fruta: ")
    val fruta = readln().lowercase().replace("á", "a")
    print("Intorduce el número de kilos: ")
    val kilos = readln().toInt()
    if (fruta in frutas) {
        println("El precio a pagar es ${String.format("%.2f", frutas[fruta]?.times(kilos))}€")
    } else {
        println("**ERROR** la fruta introducida no se encuentra.")
    }
}

/**
 * Almacena el diccionario con los créditos de las asignaturas de un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5}
 * y después muestra por pantalla los créditos de cada asignatura en el formato <asignatura> tiene <créditos> créditos,
 * donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos.
 * Al final muestra también el número total de créditos del curso.
 * */
fun u3p2ej5() {
    val asignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var total = 0
    for ((key, value) in asignaturas) {
        println("$key tiene $value")
        total += value
    }
    println("El total de créditos es de $total")
}

/**
 * Crea un diccionario vacío y lo va llenado con información sobre una persona que se le pida al usuario.
 * Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.
 * */
fun u3p2ej6() {
    val datosClientes = mutableMapOf<String, String>()
        do {
            println("INTRODUCE '*' PARA TERMINAR")
            print("Introduce los datos del cliente (ej: Nombre,Antonio): ")
            val dato = readln().replace(" ", "")
            if (dato != "*") {
                try {
                    val datos = dato.split(",")
                    if (datos[0] !in datosClientes) {
                        datosClientes[datos[0]] = datos[1]
                        for ((key, value) in datosClientes){
                            println("${key.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}: ${value.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
                        }
                    } else {
                        println("Este dato ya ha sido introducido")
                    }
                } catch (e: Exception) {
                    println("**ERROR**")
                }
            }
        } while (dato != "*")
}

/**
 * Crea un diccionario simulando una cesta de la compra. Pregunta el artículo y su precio y añade el par al diccionario,
 * hasta que el usuario decida terminar. Muestra por pantalla la lista de la compra y el coste total, con el siguiente formato
 * */
fun u3p2ej7() {
    val listaCompra = mutableMapOf<String, Float>()
    var costeTotal = 0.0
    do {
        println("INTRODUCE '*' PARA TERMINAR")
        print("Introduce el producto que desea añadir: ")
        val articulo = readln()
        if (articulo != "*") {
            try {
                if (articulo !in listaCompra) {
                    print("Introduce el precio del producto: ")
                    val precio = readln().toFloat()
                    listaCompra[articulo] = precio
                } else {
                    println("Este dato ya ha sido introducido")
                }
            } catch (e: Exception) {
                println("**ERROR**")
            }
        }
    } while (articulo != "*")
    println("\nLista de la compra")
    for ((key, value) in listaCompra) {
        println("$key      $value€")
        costeTotal += value
    }
    println("\nTotal      ${String.format("%.2f", costeTotal)}€")
}

/**
 * Crea un diccionario de traducción español-inglés. El usuario introduce las palabras en español e inglés
 * separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. Crea un diccionario con las palabras
 * y sus traducciones. Pide una frase en español y utiliza el diccionario para traducirla palabra a palabra.
 * Si una palabra no está en el diccionario la deja sin traducir.
 * */
fun u3p2ej8() {
    val diccionario = mutableMapOf<String, String>()
    try {
        print("Introduce las palabras en español y en inglés con este formato (palabra:traducción,palabra:traducción,...): ")
        val traducciones = readln()
        val listaTraducciones = traducciones.split(",")
        for (i in listaTraducciones) {
            val listaPalabras = i.split(":")
            diccionario[listaPalabras[0]] = listaPalabras[1]
        }
        print("Introduce una frase para traducir: ")
        val frase = readln()
        val fraseLista = frase.split(" ", ",").toMutableList()
        var cont = 0
        for (i in fraseLista) {
            for ((key, value) in diccionario) {
                if (fraseLista[cont] == key) {
                    fraseLista[cont] = value
                }
            }
            cont++
        }
        println("La frase traducida es: ${fraseLista.joinToString(" ")}")
    } catch (e: Exception) {
        println("Error")
    }
}

/**
 * Permite gestionar la base de datos de clientes de una empresa. Los clientes se guardan en un diccionario en el que
 * la clave de cada cliente es su NIF, y el valor es otro diccionario con los datos del cliente (nombre, dirección, teléfono, correo, preferente),
 * donde preferente tiene el valor True si se trata de un cliente preferente. Pregunta al usuario por una opción del siguiente menú:
 * (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes,
 * (6) Terminar.
 * */
fun u3p2ej10() {
    var opcion = 0
    val clientes = mutableMapOf<String,MutableMap<String,String>>()
    do {
        println("\nElige una opcion:\n(1) Añadir cliente\n(2) Eliminar cliente\n(3) Mostrar cliente\n(4) Listar todos los clientes\n(5) Listar clientes preferentes\n(6) Terminar")
        print(">> ")
        try {
            opcion = readln().toInt()
            when (opcion){
                1 -> agregarCliente(clientes)
                2 -> eliminarCliente(clientes)
                3 -> mostrarCliente(clientes)
                4 -> listarCliente(clientes)
                5 -> listaPreferentes(clientes)
                6 -> println("Finalizando programa...")
                else -> println("**ERROR** opción errónea.")
            }
        } catch (e: Exception) {
            println("**ERROR** opción errónea.")
        }
    } while (opcion != 6)
}

/**
 * Pregunta los datos del cliente, crea un diccionario con los datos y lo añade a la base de datos.
 * */
fun agregarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente a añadir: ")
    val nif = readln()
    val datosClientes = mutableMapOf<String, String>()
    print("Introduce el nombre del cliente: ")
    datosClientes["nombre"] = readln()
    print("Introduce la dirección del cliente: ")
    datosClientes["direccion"] = readln()
    print("Introduce el teléfono del cliente: ")
    datosClientes["telefono"] = readln()
    print("Introduce el correo del cliente: ")
    datosClientes["correo"] = readln()
    print("Introduce si el cliente es preferente (true/false): ")
    datosClientes["preferente"] = readln()
    clientes[nif] = datosClientes
    println("Cliente agregado con éxito.")
}

/**
 * Pregunta por el NIF del cliente y elimina sus datos de la base de datos.
 */
fun eliminarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente a eliminar: ")
    val nif = readln()
    if (nif in clientes) {
        clientes.remove(key = nif)
        println("Cliente eliminado.")
    } else {
        println("No se ha encontrado ningún cliente con ese NIF")
    }
}

/**
 * Pregunta por el NIF del cliente y muestra sus datos.
 */
fun mostrarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente a mostrar: ")
    val nif = readln()
    if (nif in clientes) {
        for ((key, value) in clientes) {
            if (key == nif) {
                for ((k, v) in value) {
                    println("$k: $v")
                }
            }
        }
    } else {
        println("No se ha encontrado ningún cliente con ese NIF")
    }

}

/**
 * Muestra la lista de todos los clientes de la base datos con su NIF y nombre.
 */
fun listarCliente (clientes:MutableMap<String, MutableMap<String, String>>) {
    for ((key, value) in clientes) {
        println("$key: ${value["nombre"]}")
    }
}

/**
 * Muestra la lista de clientes preferentes de la base de datos con su NIF y nombre.
 */
fun listaPreferentes (clientes:MutableMap<String, MutableMap<String, String>>) {
    for ((key, value) in clientes) {
        if (value["preferente"] == "true") {
            println("$key: ${value["nombre"]}")
        }
    }
}

/**
 * Genera un diccionario con la información del directorio, donde cada elemento corresponde a un cliente
 * y tiene por clave su nif y por valor otro diccionario con el resto de la información del cliente.
 * Los diccionarios con la información de cada cliente tienen como claves los nombres de los campos y como valores
 * la información de cada cliente correspondientes a los campos.
 * */
fun u3p2ej11() {
    val directorio = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    val lista = directorio.split("\n")
    val directorioMap = mutableMapOf<String, MutableMap<String, String>>()
    for (i in 1..<lista.count()){
        val listaCampos = lista[0].split(";")
        val valores = lista[i].split(";")
        directorioMap[valores[0]] = mutableMapOf(listaCampos[1] to valores [1], listaCampos[2] to valores [2], listaCampos[3] to valores [3], listaCampos[4] to valores [4])
    }
    println(directorioMap)
}

// PARTE 3 -> Conjuntos: 1, 2, 3, 4, 5 y 6.

/**
 * Recibe como parámetro una lista y retorna los domicilios de cada cliente al cual se le debe enviar
 * una factura de compra. Nota que cada cliente puede haber hecho más de una compra en el mes,
 * por lo que la función retorna una estructura que contiene cada domicilio una sola vez.
 * */
fun u3p3ej1() {
    val lista = mutableListOf(
        setOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        setOf("Jorge Russo", 7, 699, "Mirasol 218"),
        setOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        setOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        setOf("Jorge Russo", 15, 958, "Mirasol 218"))
    val domicilios = mutableSetOf<Any>()
    for (i in lista) {
        domicilios.add(i.elementAt(3))
    }
    println(domicilios)
}

/**
 * Solicita al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela,
 * finalizando cuando se introduzca “x”. Luego solicita que introduzca los nombres de los alumnos de secundaria,
 * finalizando al introducir “x”.
 * */
fun u3p3ej2() {
    val alumnosPrimaria = mutableSetOf<String>()
    val alumnosSecundaria = mutableSetOf<String>()
    do {
        println("Escribe x para terminar.")
        print("Introduce el nombre de pila del alumno de primaria: ")
        val nombresPrimaria = readln()
        if (nombresPrimaria != "x") {
            alumnosPrimaria.add(nombresPrimaria)
        }
    }while (nombresPrimaria != "x")
    do {
        println("Escribe x para terminar.")
        print("Introduce el nombre de pila del alumno de secundaria: ")
        val nombresSecundaria = readln()
        if (nombresSecundaria != "x") {
            alumnosSecundaria.add(nombresSecundaria)
        }
    }while (nombresSecundaria != "x")
    mostrarSinRepeticiones(alumnosPrimaria, alumnosSecundaria)
    mostrarRepetidos(alumnosPrimaria, alumnosSecundaria)
    mostrarNoRepetidosPrimaria(alumnosPrimaria, alumnosSecundaria)
}

/**
 * Muestra los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
 */
fun mostrarSinRepeticiones(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    println("Todos los nombres de primaria y secundaria sin repeticiones son: ${alumnosPrimaria union alumnosSecundaria}")
}

/**
 * Muestra qué nombres se repiten entre los alumnos de primaria y secundaria.
 */
fun mostrarRepetidos(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    println("Los nombres que se repiten son ${alumnosPrimaria intersect alumnosSecundaria}")
}

/**
 * Muestra qué nombres de primaria no se repiten en los de nivel secundaria
 * y si todos los nombres de primaria están incluidos en secundaria.
 */
fun mostrarNoRepetidosPrimaria(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    val mostrar = alumnosPrimaria subtract alumnosSecundaria
    println("Los nombres que no se repiten en primaria son $mostrar")
    if (mostrar == emptySet<String>()) {
        println("Todos los nombres de primaria están incluidos en secundaria.")
    } else
        println("No todos los nombres de primaria están incluidos en secundaria.")
}

/**
 *
 * */
fun u3p3ej3() {

}

/**
 *
 * */
fun u3p3ej4() {

}

/**
 *
 * */
fun u3p3ej5() {

}

/**
 *
 * */
fun u3p3ej6() {

}