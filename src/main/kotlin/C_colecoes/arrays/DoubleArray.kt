package C_colecoes.arrays

fun main() {

    val salarios = doubleArrayOf(1550.0, 2300.0, 1200.0, 4700.5, 10238.86)

    for(indice in salarios.indices){
        salarios[indice] += salarios[indice] * 0.1
    }

    println(salarios.contentToString())

    val salarios2 = doubleArrayOf(1550.0, 2300.0, 1200.0, 4700.5, 10238.86)

    salarios2.forEachIndexed { i, salario ->
        salarios2[i] = salario * 1.1
    }

    println(salarios2.contentToString())



}