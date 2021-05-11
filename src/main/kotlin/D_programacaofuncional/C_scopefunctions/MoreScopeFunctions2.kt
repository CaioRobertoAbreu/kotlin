package D_programacaofuncional.C_scopefunctions

fun main() {

    soma(1, 5) {
        println(this)
    }
}

fun soma(a: Int, b: Int, resultado: Int.() -> Unit) {//A função resultado também aceita parâmetros
    val total = a+b
    total.resultado()
//    resultado(a+b) -> equivalente
}