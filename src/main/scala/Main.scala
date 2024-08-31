import MCD.Mcd._
import Museo._

  object Main extends App {

    val obra1 = new Obra("Alejandro Lopez", 1993, "paisaje", Tipologia.Pintura, 1500)
    val obra2 = new Obra("María González", 2000, "retrato", Tipologia.Escultura, 2500)
    val obra3 = new Obra("Juan Pérez", 2021, "abstracción", Tipologia.Pintura, 1800)
    val obra4 = new Obra("Laura Martínez", 2019, "bodegón", Tipologia.Escritura, 1200)
    val obra5 = new Obra("Carlos Fernández", 2022, "paisaje urbano", Tipologia.Audio, 2200)
    val obra6 = new Obra("Sofía Díaz", 2020, "escultura clásica", Tipologia.Escultura, 3000)
    val obra7 = new Obra("Pedro Gómez", 2001, "naturaleza muerta", Tipologia.Pintura, 1600)
    val obra8 = new Obra("Isabel Romero", 2002, "figura humana", Tipologia.Escultura, 2700)
    val obra9 = new Obra("Luis Hernández", 2022, "surrealismo", Tipologia.Otro, 2100)
    val obra10 = new Obra("Ana López", 2023, "abstracto", Tipologia.Escultura, 2800)    

    val obras: List[Obra] = List(obra1, obra2, obra3, obra4, obra5, obra6, obra7, obra8, obra9, obra10);


    for (Tipologia <- Tipologia.values) {
      val obrasPorTipologia = obras.filter(_.tipologia == Tipologia)
      println(s"\nObras de la tipología $Tipologia:")
      obrasPorTipologia.foreach(println)
      }



      //filtro de obras con mas de 20 años y tomar la obra con mayor precio
    println("\nLa obra que tiene mayor precio y tiene mas de 20 años es:") 
    obras.filter(_.año < 2004 ).sortBy(_.precio).lastOption.foreach(println)


    ////////////////////// Patrimonio Actual de Museo //////////////////////

    var patrimonio: Int = obras.map(_.precio).sum

    println("\nEl patrimonio actual del museo es: " + patrimonio)

    


  } 