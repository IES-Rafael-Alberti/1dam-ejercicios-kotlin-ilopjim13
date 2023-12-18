fun main() {

    var op: Int
    do {
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)
        if (op != 0) {
            mostrarMenu(op)
        }
    } while (op != 0)

    // EJERCICIOS UNIDAD 1

    //u1ej1()

    //u1ej2()

    //u1ej3()

    //u1ej15()

    //u1ej18()

    //u1ej20()

    //u1ej21()

    //u1ej22()

    //u1ej24()

    //u1ej25()

    //u1ej26()

    //u1ej27()

    // EJERCICIOS UNIDAD 2

    // EJERCICIOS DE SENTENCIAS CONDICIONALES

    //u2p1ej2()

    u2p1ej3()

    //u2p1ej6()

    //u2p1ej8()

    //u2p1ej10()

    // EJERCICIOS DE SENTENCIAS ITERATIVAS Y SALTOS

    //u2p2ej2()

    //u2p2ej4()

    //u2p2ej6()

    //u2p2ej7()

    //u2p2ej8()

    //u2p2ej13()

    //u2p2ej15()

    //u2p2ej18()

    //u2p2ej19()

    //u2p2ej25()

    // EJERCICIOS DE CAPTURAS DE EXEPCIONES

    //u2p3ej2()

    //u2p3ej3()

    //u2p3ej4()

    //u3p1ej4()

    //u3p1ej6()

}

fun MenuPpal() {

}

fun mostrarMenuPpal() {
    println("1. Ejercicicos U1")
    println("2. Ejercicicos U2")
    println("3. Ejercicicos U3")
}

fun mostrarMenu(tipo: Int) {
    var op: Int = -1

    do {
        when (tipo) {
            1 -> {
                println("1. Ejercicico 04")
                println("2. Ejercicico 06")
                println("3. Ejercicico 12")
                println("4. Ejercicico 15")
                println("5. Ejercicico 18")
                println("6. Ejercicico 20")
                println("7. Ejercicico 21")
                println("8. Ejercicico 22")
                println("9. Ejercicico 24")
                println("10. Ejercicico 25")
                println("11. Ejercicico 26")
                println("12. Ejercicico 27")
                op = pedirOpcion(0, 12)
                when (op) {
                    1 -> u1ej4()
                    2 -> u1ej6()
                    3 -> u1ej12()
                    4 -> u1ej15()
                    5 -> u1ej18()
                    6 -> u1ej20()
                    7 -> u1ej21()
                    8 -> u1ej22()
                    9 -> u1ej24()
                    10 -> u1ej25()
                    11 -> u1ej26()
                    12 -> u1ej27()
                }
            }
            2 -> {
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("5. EjCondicion 10")
                println("6. EjIterativas 02")
                println("6. EjIterativas 04")
                println("6. EjIterativas 06")
                println("6. EjIterativas 07")
                println("6. EjIterativas 08")
                println("6. EjIterativas 13")
                println("6. EjIterativas 15")
                println("6. EjIterativas 18")
                println("6. EjIterativas 19")
                println("6. EjIterativas 25")

                op = pedirOpcion(0, 5)
            }

            3 -> {
                println("1. Ejlistas 02")

            }
        }
    }while(op != 0)
}

/**
 * Pedir una opción del menú
 * @param min: Int - opción mínima
 * @param max: Int - opción máxima
 * */
fun pedirOpcion(min: Int, max: Int): Int {
    var opcion: Int
    var error: Boolean
    do {
        error = false
        print("Selecciones opción (0 = Salir) >> ")
        opcion = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)
    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("Opción no válida")
        else -> {
            println("Error desconocido")
        }
    }
}