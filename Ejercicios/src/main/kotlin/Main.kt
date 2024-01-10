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
                println("\nEJERCICIOS UNIDAD 1\n")
                println("1.  Ejercicico 04")
                println("2.  Ejercicico 06")
                println("3.  Ejercicico 12")
                println("4.  Ejercicico 15")
                println("5.  Ejercicico 18")
                println("6.  Ejercicico 20")
                println("7.  Ejercicico 21")
                println("8.  Ejercicico 22")
                println("9.  Ejercicico 24")
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
                println("\nEJERCICIOS UNIDAD 2\n")
                println("1.  EjCondicion 02")
                println("2.  EjCondicion 03")
                println("3.  EjCondicion 06")
                println("4.  EjCondicion 08")
                println("5.  EjCondicion 10\n")
                println("6.  EjIterativas 02")
                println("7.  EjIterativas 04")
                println("8.  EjIterativas 06")
                println("9.  EjIterativas 07")
                println("10. EjIterativas 08")
                println("11. EjIterativas 13")
                println("12. EjIterativas 15")
                println("13. EjIterativas 18")
                println("14. EjIterativas 19")
                println("15. EjIterativas 25\n")
                println("16. EjExepcion 2")
                println("17. EjExepcion 3")
                println("18. EjExepcion 4")

                op = pedirOpcion(0, 18)
                when (op) {
                    1 -> u2p1ej2()
                    2 -> u2p1ej3()
                    3 -> u2p1ej6()
                    4 -> u2p1ej8()
                    5 -> u2p1ej10()
                    6 -> u2p2ej2()
                    7 -> u2p2ej4()
                    8 -> u2p2ej6()
                    9 -> u2p2ej7()
                    10 -> u2p2ej8()
                    11 -> u2p2ej13()
                    12 -> u2p2ej15()
                    13 -> u2p2ej18()
                    14 -> u2p2ej19()
                    15 -> u2p2ej25()
                    16 -> u2p3ej2()
                    17 -> u2p3ej3()
                    18 -> u2p3ej4()
                }
            }

            3 -> {
                println("\nEJERCICIOS UNIDAD 3\n")
                println("1. Ejlistas 04")
                println("2. Ejlistas 06")
                println("3. Ejlistas 08")
                println("4. Ejlistas 09")
                println("5. Ejlistas 10")
                println("6. Ejlistas 13")
                op = pedirOpcion(0, 19)
                when (op) {
                    1 -> u3p1ej4()
                    2 -> u3p1ej6()
                    3 -> u3p1ej8()
                    4 -> u3p1ej9()
                    5 -> u3p1ej10()
                    6 -> u3p1ej13()
                    7 -> u3p2ej3()
                    8 -> u3p2ej5()
                    9 -> u3p2ej6()
                    10 -> u3p2ej7()
                    11 -> u3p2ej8()
                    12 -> u3p2ej10()
                    13 -> u3p2ej11()
                    14 -> u3p3ej1()
                    15 -> u3p3ej2()

                    16 -> u2p3ej2()
                    17 -> u2p3ej3()

                    18 -> u3p3ej5()
                    19 -> u3p3ej6()
                }
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