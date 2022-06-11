package fiap.com.br.ds.model

import java.io.Serializable

data class Viagem(
    val nome: String,
    val dataViagem: String,
    val dataVolta: String
) : Serializable