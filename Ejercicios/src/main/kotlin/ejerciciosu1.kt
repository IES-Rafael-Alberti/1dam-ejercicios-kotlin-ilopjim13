fun u1ej1(){
    print("Introduce una temperatura en Celcius: ")
    var cel = try {
        readln().toFloat() * 9 / 5 + 32
    } catch (e: NumberFormatException) {
        println("**ERROR** Temperatura inválida.")
    }
    if (cel < 0.0 or cel >= 0.0) {
        println("La temperatura en grados Fahrenheit es $cel")
    }
}