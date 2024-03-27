import java.lang.Exception

sealed class Resultado {
    data class Sucesso(val dados: String) : Resultado()
    data class Error(val exception: String) : Resultado()
    data object Loading : Resultado()
}