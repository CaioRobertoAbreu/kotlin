package C_colecoes.associate

fun main() {

    val pedidos = listOf<Pedido>(
        Pedido(1, 400.0),
        Pedido(2, 600.0),
        Pedido(3, 1000.0),
        Pedido(4, 2000.0)
    )

    println(pedidos)

    //Retorna uma map
    val pedidosMap: Map<Int, Pedido>  = pedidos.associate { pedido -> pedido.numero to pedido }
    pedidosMap.imprime()

    val pedidosMap2: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    pedidosMap2.imprime()

    val freteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor >= 1000.0 }
    freteGratis.imprime()

    println("Frete Gratis: ${freteGratis[Pedido(2, 600.0)]}")

    val novoFreteGratis = pedidos.groupBy { pedidos -> pedidos.valor >= 1000 }
    println("=========== NOVO FRETE GRATIS ================")
    println(novoFreteGratis)
    println(novoFreteGratis[true])
}

fun Map<*, Any>.imprime() {

    println("===== MAP ======")
    this.forEach {
        println("${it.key} - Frete Gratis: ${it.value}")
    }
}




