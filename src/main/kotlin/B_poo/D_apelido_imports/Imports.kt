package B_poo.D_apelido_imports

import java.lang.String as StringJava

class Imports {

    val apelido: String = "string do pacote kotlin"

    /**
     * Resolvemos isso:
     *
     * val apelido2: java.lang.String = java.lang.String("string do java")
     *
     * com isso:
     */

    val apelido2: StringJava = StringJava("string do java usando apelido")

    /**
     * Como temos duas classes com o mesmo nome temos que usar o
     * FULLY QUALIFIED NAME para diferenciá-las, para resolver esse
     * problema podemos usar os alias(apelidos) diferenciando-as
     * entre si. Esse apelido é feito no import
     */

}