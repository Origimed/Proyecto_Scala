package Museo
import Museo.Tipologia._
class Obra(val autor: String,val año: Int,val descripcion: String,val tipologia: Tipologia,val precio: Int) {

  override def toString: String = s"Obra: (autor: $autor, año: $año, descripcion: $descripcion, tipologia: $tipologia, precio: $precio)"
 

  
    
}
