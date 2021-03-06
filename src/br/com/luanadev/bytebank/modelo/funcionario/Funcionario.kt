package br.com.luanadev.bytebank.modelo.funcionario

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double

}