data class DataClassPessoa(val nome: String, val idade: Int, val profissao: String, val cpf: String) {
    fun copiarComNomeCompleto(nomeCompleto: String): DataClassPessoa {
        return this.copy(nome = nomeCompleto)
    }
}