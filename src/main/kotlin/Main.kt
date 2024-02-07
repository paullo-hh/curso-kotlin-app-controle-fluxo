package paulo.hh

fun main() {

    var valorA = 10
    var valorB = 20

    var i = 23

    if ((i != null) || (valorA == valorB)) {

        processar()

    }

    if ((i == null) || (valorA != valorB)) {

        naoProcessar()

    }
    println("\nFinish...")
}

fun processar ( ) {
    println("True!")
}

fun naoProcessar ( ) {
    println("False!")
}