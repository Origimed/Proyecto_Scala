package Museo

object OrdenarObrasPorAnio {
    def ordenarObrasPorAnio(obras: List[Obra]): List[Obra] = {

    def insertarEnOrdenado(obra: Obra, listaOrdenada: List[Obra]): List[Obra] = listaOrdenada match {
      case Nil => List(obra)
      case head :: tail =>
        if (obra.año >= head.año) obra :: listaOrdenada
        else head :: insertarEnOrdenado(obra, tail)
    }

    def ordenar(lista: List[Obra], listaOrdenada: List[Obra]): List[Obra] = lista match {
      case Nil => listaOrdenada
      case head :: tail => ordenar(tail, insertarEnOrdenado(head, listaOrdenada))
    }

    ordenar(obras, Nil)
  }
}
