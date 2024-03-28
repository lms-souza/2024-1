fun main() {
    // Exemplo de uso da classe CharGenerator
    val charGenerator = CharGenerator('a', 'z')
    println(charGenerator.generateChar())

    // Exemplo de uso da classe Pessoa
    val pessoa = Pessoa("João", 30)
    pessoa.caminhar()
    pessoa.falar()

    // Exemplo de uso da sealed class Result
    val result: Result = Result.Success("Sucesso")
    when (result) {
        is Result.Success -> println("Sucesso: ${result.message}")
        is Result.Error -> println("Erro: ${result.message}, Código: ${result.code}")
        is Result.Loading -> println("Carregando: ${result.progress}%")
    }

    // Exemplo de uso da data class Pessoa
    val pessoa1 = DataClassPessoa("Maria", 25, "Programadora", "123.456.789-00")
    val pessoa2 = pessoa1.copiarComNomeCompleto("Maria da Silva")
    println(pessoa1)
    println(pessoa2)
}
