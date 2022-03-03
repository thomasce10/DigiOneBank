package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - $elemento")
    }
    //usando uma variável dentro de um loop percorrendo todos os elementos do enum e printando name e description
    ClienteTipo.values().forEach{
        println("${it.name} - $it") }

    //mesmo propósito porém usando it
}