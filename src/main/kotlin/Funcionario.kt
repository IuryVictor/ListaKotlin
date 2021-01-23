class Funcionario (val salario: Int, nome: String, altura: Int): Pessoa(nome, altura) {

    override fun toString(): String {
        return super.toString() + ", $salario"
    }
}

fun main(){
    var f:Funcionario
    f = Funcionario(1200,"Iury", 180)
    println(f)
}