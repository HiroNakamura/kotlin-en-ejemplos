package chapter1

/**
*@author Fer Carraro
*@date 30/agosto/2019
*/

fun main(args: Array<String>) {
    val stringSet = setOf("one", "two", "three")
    mockTestQ(stringSet)
    val listaInt = listOf(1,2,3,4)
    mockTestQ(listaInt)
    val listaAny = listOf("Uno",54, true, false,'\u0032',32.77,12.0f,127,StringBuilder())
    mockTestQ(listaAny)
    val miListAny = listOf(Object(), null, false,'\u8976',0.00,23.9f,12000L,"null",StringBuilder())
    mockTestQ(miListAny)
    //mockTestP()
    //mockTestO()
    //mockTestA()
    //mockTestB()
    //mockTestC()
    //mockTestD()
    //mockTestE()
    //mockTestF()
    //mockTestG()
    //mockTestH()
    //mockTestI()
    //mockTestJ()
    //mockTestK()
    //mockTestL()
    //mockTestM()
    //mockTestN()
}
