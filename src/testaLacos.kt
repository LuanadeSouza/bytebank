fun testaLacos() {
    var i = 0
    while (i < 5) {

        val titular = "Luana $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta:  $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }
    for (i in 5 downTo 1 step 2) {
        val titular = "Luana $i"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta:  $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}