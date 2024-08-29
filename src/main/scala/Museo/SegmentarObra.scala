package Museo
object SegmentarObra {
      def segmentarObras(obras: List[Obra], tipo: Tipologia): List[Obra] = {
        obras.filter(el => el.tipologia == tipo)

    }   
}
