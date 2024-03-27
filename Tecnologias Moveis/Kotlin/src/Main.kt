fun main() {
    val result: Resultado = Resultado.Error("error")

    when (result) {
        is Resultado.Sucesso -> println("Sucesso!")
        is Resultado.Error -> println("Error!")
        is Resultado.Loading -> println("Loading!")
    }
}

