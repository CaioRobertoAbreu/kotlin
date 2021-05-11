package B_poo.B_heranca_polimorfismo_interface

fun main() {

    val sistemaInterno = SistemaInterno()

    val caio = Funcionario("Caio", "12345678910", 5000.0)

    println(caio.toString())
    println()

    val gerente = Gerente("Gabriela", "12345612345", 8000.0, "senhasecreta")

    println(gerente.toString())
    println()

    sistemaInterno.login(gerente, gerente.senha)

    val diretor = Diretor("Giovanni", "54615676069", 10000.0, "minhasenha", 1200.0)

    println()
    println(diretor.toString())
    println()
    sistemaInterno.login(diretor, diretor.senha)

    val calculadora = CalculadoraBonificacao()
    calculadora.registraFuncionario(caio)
    calculadora.registraFuncionario(diretor)
    calculadora.registraFuncionario(gerente)

    println()
    println("Total de bonificações: ${calculadora.total}")


}