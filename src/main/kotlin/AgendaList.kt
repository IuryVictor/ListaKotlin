class AgendaList {
    val ListPessoa = ArrayList<Pessoa>()
    var count:Int = 0

    fun armazenarPessoa(p: Pessoa){
        if(count < 10){
            ListPessoa.add(p)
            count++
        }else{
            println("Agenda Cheia")
        }
    }

    fun removerPessoa(p: Pessoa){
        if(ListPessoa.contains(p)){
            ListPessoa.remove(p)
            count--
        }else{
            println("Pessoa nao encontrada")
        }
    }

    fun buscarPessoa(p: Pessoa): Pessoa? {
        if(ListPessoa.contains(p)){
            return ListPessoa.get(ListPessoa.indexOf(p))
        }else{
            println("Pessoa nao encontrada")
            return null
        }
    }

    fun printAgenda(){
        if(ListPessoa.isEmpty()){
            println("Agenda vazia")
        }else{
            for (i in 0..ListPessoa.size-1){
                println(ListPessoa.get(i))

            }
        }
    }

    fun printPessoa(index: Int){
        if(ListPessoa.contains(ListPessoa.get(index))){
            println(ListPessoa.get(index))
        }else{
            println("Pessoa nao encontrada")
        }
    }
}