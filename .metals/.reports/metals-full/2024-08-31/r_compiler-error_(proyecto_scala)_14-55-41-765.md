file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.0
Classpath:
<WORKSPACE>/.bloop/proyecto_scala/bloop-bsp-clients-classes/classes-Metals-Mu5vID2_RMW4iWohQ9h_Gw== [exists ], <HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.0/semanticdb-javac-0.10.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.0/scala3-library_3-3.3.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar [exists ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE>


action parameters:
offset: 1912
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala
import MCD.Mcd._
import Museo._
  import Museo.OrdenarObrasPorPrecio.ordenarObrasPorPrecio

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



    ///////////// filtro de obras con mas de 20 años y tomar la obra con mayor precio /////////////////////

    println("\nLa obra que tiene mayor precio y tiene mas de 20 años es:") 
    obras.filter(_.año < 2004 ).sortBy(_.precio).lastOption.foreach(println)


    ////////////////////// Patrimonio Actual de Museo //////////////////////

    var patrimonio: Int = obras.map(_.precio).sum

    println("\nEl patrimonio actual del museo es: " + patrimonio)

    

  /////////////////////// Ordenas Obras Por Precio ///////////////////////////////

  listaOredena: List[Obra] @@ OrdenarObrasPorPrecio.ordenarObrasPorPrecio(obras)




  } 
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2576)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:94)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.loop$3(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:282)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:398)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner