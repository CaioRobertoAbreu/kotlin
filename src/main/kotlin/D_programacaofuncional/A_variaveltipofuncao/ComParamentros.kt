package D_programacaofuncional.A_variaveltipofuncao


fun main() {

    val funcaoComParametro = ::soma
    println("Soma: ${funcaoComParametro(2, 3)}")

    val multiplicaco = { a: Int, b: Int -> a * b }
//    val multiplicaco: (Int, Int) -> Int = { a, b -> a * b } -> também compila
//    val multiplicaco: (Int, Int) -> Int = { _, b -> 2 * b } -> também compila, o underline significa que não iremos usar o paramentro
    println("Multiplicacao: ${multiplicaco(2,3)}")

    val divisao = fun(a: Int, b: Int): Int {
        if (b != 0){
            return a/b
        }
        return 0
    }
    println("Divisao: ${divisao(10,2)}")

    val calculaBonificacao: (salario: Double) -> Double  = Lambda@{salario ->
        if (salario >= 500.0 && salario < 1000.0){
            return@Lambda salario + 100
        }

        if(salario >= 1000 && salario < 2000){
            return@Lambda salario + 250.0
        }

        return@Lambda salario + 500
    }
    println("Calcula Bonificao: ${calculaBonificacao(800.0)}")
    println("Calcula Bonificao: ${calculaBonificacao(1800.0)}")
    println("Calcula Bonificao: ${calculaBonificacao(3800.0)}")

}


fun soma(v1: Int, v2: Int): Int {

    return v1 + v2
}