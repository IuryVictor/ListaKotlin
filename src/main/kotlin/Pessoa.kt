open class Pessoa (val nome: String, val altura: Int) {
    var idade:Int = 0
    var anoNascimento: Int = 0

    constructor(nome: String, altura: Int, anoNascimento:Int) : this(nome, altura){
        this.anoNascimento = anoNascimento
        this.idade = calcularIdade(anoNascimento)
    }

    private fun calcularIdade(anoNascimento: Int): Int {
        return 2021 - anoNascimento
    }

    override fun toString(): String {
        return "$nome($anoNascimento, $altura, $idade anos)"
    }
    
}

fun main(){
    var p:Pessoa
    p = Pessoa("Iury", 180, 1998)
    println(p)
}