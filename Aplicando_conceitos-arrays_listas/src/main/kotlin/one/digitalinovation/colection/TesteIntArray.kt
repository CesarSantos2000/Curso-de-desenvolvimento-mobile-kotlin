package one.digitalinovation.colection

fun main() {
     val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 5
    values[4] = 2

    for(valor in values){
        println(valor)
    }

    println("***********************************************************************")

    values.forEach {  //Caso não seja declarado nenhuma variavel, utiliza-se it que é a varivael default
        println(it)
    }

    println("***************************************************************************")


    for(index in values.indices){
        println(values[index])
        println("indice: " + index)
    }
}