package fundamentos

//construtor
class Pessoa (var nome: String, var idade: Int ) {
    override fun toString(): String {
        return "Nome da classe: 'Pessoa' Nome: ${nome}, Idade: ${idade}"
    }
}

fun main(){
    var luciane = Pessoa("Luciane", 19)
    println(luciane)
}