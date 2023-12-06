/**
 * Plantilla para pruebas
* @author Carlos Delgado
* @version 1.0
* @note 22 de Noviembre de 2023 
 */
package taller4

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestTaller4 extends AnyFunSuite{
    type Matriz = Vector[Vector[Int]]
    //matrices 4x4
    val matriz1: Matriz = Vector(
        Vector(1, 5, 9, 13),
        Vector(2, 6, 10, 14),
        Vector(3, 7, 11, 15),
        Vector(4, 8, 12, 16)
    )
    val matriz2: Matriz = Vector(
        Vector(17, 21, 25, 29),
        Vector(18, 22, 26, 30),
        Vector(19, 23, 27, 31),
        Vector(20, 24, 28, 32)
    )
    //resultado de multiplicar la matriz 1 con la 2
    val matrizresultado1_2: Matriz = Vector(
        Vector(538, 650, 762, 874),
        Vector(612, 740, 868, 996),
        Vector(686, 830, 974, 1118),
        Vector(760, 920, 1080, 1240)
    )

    //matrices 4x4
    val matriz3: Matriz = Vector(
        Vector(2, 10, 18, 26),
        Vector(4, 12, 20, 28),
        Vector(6, 14, 22, 30),
        Vector(8, 16, 24, 32)
    )
    val matriz4: Matriz = Vector(
        Vector(1, 9, 5, 13),
        Vector(2, 10, 6, 14),
        Vector(3, 11, 7, 15),
        Vector(4, 12, 8, 16)

    )
    val matrizresultado3_4: Matriz = Vector(
        Vector(180, 628, 404, 852),
        Vector(200, 712, 456, 968),
        Vector(220, 796, 508, 1084),
        Vector(240, 880, 560, 1200)
    )

    //matriz 8 X 8
    val matriz5: Matriz = Vector(
        Vector(9, 8, 7, 6, 5, 4, 3, 2),
        Vector(6, 5, 4, 3, 2, 1, 0, 9),
        Vector(3, 2, 1, 0, 9, 8, 7, 6),
        Vector(0, 1, 2, 3, 4, 5, 6, 7),
        Vector(7, 6, 5, 4, 3, 2, 1, 0),
        Vector(4, 5, 6, 7, 8, 9, 0, 1),
        Vector(1, 0, 9, 8, 7, 6, 5, 4),
        Vector(8, 7, 6, 5, 4, 3, 2, 1)
    )
    val matriz6: Matriz = Vector(
        Vector(5, 2, 3, 4, 5, 6, 7, 8),
        Vector(4, 5, 6, 7, 8, 9, 5, 6),
        Vector(7, 8, 5, 6, 7, 8, 9, 5),
        Vector(6, 7, 8, 5, 6, 7, 8, 9),
        Vector(5, 6, 7, 8, 5, 6, 7, 8),
        Vector(4, 5, 6, 7, 8, 5, 6, 7),
        Vector(3, 4, 5, 6, 7, 8, 5, 6),
        Vector(2, 3, 4, 5, 6, 7, 8, 5)
    )
    //resultado de multiplicar la matriz 5 con la 6
    val matrizresultado5_6: Matriz = Vector(
        Vector(216, 224, 240, 260, 284, 312, 304, 305),
        Vector(128, 134, 148, 166, 188, 214, 219, 193),
        Vector(140, 164, 196, 232, 232, 236, 234, 241),
        Vector(108, 136, 156, 172, 184, 192, 191, 181),
        Vector(144, 144, 152, 164, 180, 200, 194, 197),
        Vector(202, 226, 242, 254, 262, 266, 281, 287),
        Vector(198, 234, 238, 246, 258, 274, 294, 273),
        Vector(180, 184, 196, 212, 232, 256, 249, 251)
    )



    // matrices 8x8
    val matriz9: Matriz = Vector(
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1)
    )
    val matriz10: Matriz = Vector(
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0),
        Vector(0, 1, 0, 1, 0, 1, 0, 1),
        Vector(1, 0, 1, 0, 1, 0, 1, 0)
    )
    // Resultado de multiplicar las matrices 9 y 10
    val matrizresultado9_10: Matriz = Vector(
        Vector(0, 4, 0, 4, 0, 4, 0, 4),
        Vector(4, 0, 4, 0, 4, 0, 4, 0),
        Vector(0, 4, 0, 4, 0, 4, 0, 4),
        Vector(4, 0, 4, 0, 4, 0, 4, 0),
        Vector(0, 4, 0, 4, 0, 4, 0, 4),
        Vector(4, 0, 4, 0, 4, 0, 4, 0),
        Vector(0, 4, 0, 4, 0, 4, 0, 4),
        Vector(4, 0, 4, 0, 4, 0, 4, 0)
    )


    //test de la funcion basica secuencial
    test("testmultmatriz1") {
        assert(matrizresultado1_2 == Taller4.mulMatriz(matriz1, matriz2))
        //lloremos juntos :(
        // cual forma de llorar es la mejor? :(
    }
    test("testmultmatriz2") {
        assert(matrizresultado3_4 == Taller4.mulMatriz(matriz3, matriz4))
    }
    test("testmulmatriz3") {
        assert(matrizresultado5_6 == Taller4.mulMatriz(matriz5, matriz6))
    }

    test("testmulmatriz4") {
        assert(matrizresultado9_10 == Taller4.mulMatriz(matriz9, matriz10))
    }
    //test de la funcion basica paralela
    test("testmulmatrizPar1") {
        assert(matrizresultado1_2 == Taller4.multMatrizParalelo(matriz1, matriz2))
    }
    test("testmulmatrizPar2") {
        assert(matrizresultado3_4 == Taller4.multMatrizParalelo(matriz3, matriz4))
    }
    test("testmulmatrizPar3") {
        assert(matrizresultado5_6 == Taller4.multMatrizParalelo(matriz5, matriz6))
    }

    test("testmulmatrizPar4") {
        assert(matrizresultado9_10 == Taller4.multMatrizParalelo(matriz9, matriz10))
    }
    //test de la funcion recursiva secuencial
    test("testmulmatrizRec1") {
        assert(matrizresultado1_2 == Taller4.multMatrizRec(matriz1, matriz2))
    }
    test("testmulmatrizRec2") {
        assert(matrizresultado3_4 == Taller4.multMatrizRec(matriz3, matriz4))
    }
    test("testmulmatrizRec3") {
        assert(matrizresultado5_6 == Taller4.multMatrizRec(matriz5, matriz6))
    }

    test("testmulmatrizRec4") {
        assert(matrizresultado9_10 == Taller4.multMatrizRec(matriz9, matriz10))
    }


    //test de la funcion recursiva paralela
    test("testmulmatrizRecPar1") {
        assert(matrizresultado1_2 == Taller4.multMatrizRecPar(matriz1, matriz2))
    }
    test("testmulmatrizRecPar2") {
        assert(matrizresultado3_4 == Taller4.multMatrizRecPar(matriz3, matriz4))
    }
    test("testmulmatrizRecPar3") {
        assert(matrizresultado5_6 == Taller4.multMatrizRecPar(matriz5, matriz6))
    }

    test("testmulmatrizRecPar4") {
        assert(matrizresultado9_10 == Taller4.multMatrizRecPar(matriz9, matriz10))
    }


    //test de la funcion strassen secuencial
    test("testmulmatrizStrassen1") {
        assert(matrizresultado1_2 == Taller4.multStrassen(matriz1, matriz2))
    }
    test("testmulmatrizStrassen2") {
        assert(matrizresultado3_4 == Taller4.multStrassen(matriz3, matriz4))
    }
    test("testmulmatrizStrassen3") {
        assert(matrizresultado5_6 == Taller4.multStrassen(matriz5, matriz6))
    }

    test("testmulmatrizStrassen4") {
        assert(matrizresultado9_10 == Taller4.multStrassen(matriz9, matriz10))
    }


    //test de la multiplicacion de matrices del metodo strassen paralelo
    test("testmulmatrizStrassenPar1") {
        assert(matrizresultado1_2 == Taller4.multStrassenPar(matriz1, matriz2))
    }
    test("testmulmatrizStrassenPar2") {
        assert(matrizresultado3_4 == Taller4.multStrassenPar(matriz3, matriz4))
    }
    test("testmulmatrizStrassenPar3") {
        assert(matrizresultado5_6 == Taller4.multStrassenPar(matriz5, matriz6))
    }

    test("testmulmatrizStrassenPar4") {
        assert(matrizresultado9_10 == Taller4.multStrassenPar(matriz9, matriz10))
    }

}
