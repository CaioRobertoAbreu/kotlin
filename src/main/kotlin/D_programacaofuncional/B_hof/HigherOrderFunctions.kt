package D_programacaofuncional.B_hof

fun main() {

    "A".let { ::recebeString }
}

//Higher order function
fun recebeFuncao(funcao: () -> Unit){

}

fun recebeString(valor: String){

}