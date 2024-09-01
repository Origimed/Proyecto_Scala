package Museo

import Museo._

object Descuento {
  
    def obrasConDescuento (obras: List[Obra], dia: String)={
        if (dia.toLowerCase() == "viernes"){

            val obrasAntiguas: List[Obra] = obras.filter(_.año <= 2000)

            obrasAntiguas.foreach(_.aplicarDescuento(0.5))


            obrasAntiguas.foreach(println)
            

        }
        else {
            println("No hay descuentos")

        }


    }

}
