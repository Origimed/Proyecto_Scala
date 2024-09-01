package Museo
import Museo.Tipologia._
class Obra(val autor: String,val año: Int,val descripcion: String,val tipologia: Tipologia,var precio: Double) {

  override def toString: String = s"Obra: (autor: $autor, año: $año, descripcion: $descripcion, tipologia: $tipologia, precio: $precio)"
 

  def aplicarDescuento(descuento: Double): Unit = {
    this.precio = this.precio * descuento
  }
    
}
