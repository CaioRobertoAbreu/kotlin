package B_poo.B_heranca_polimorfismo_interface

fun main() {

    val gerente = Gerente(nome = "Caio", cpf = "45484310040", salario = 9000.0, "mypassword")
    val diretor = Diretor(nome = "Guilherme", cpf = "78287678030", salario = 10000.0, senha = "secret", 1300.0)
    val cliente = Cliente(nome = "Joao", cpf = "19617808013", senha = "123")

    val sistemaInterno = SistemaInterno()

    sistemaInterno.login(gerente, "mypassword")
    sistemaInterno.login(diretor, "secret")
    sistemaInterno.login(cliente, "123")
}