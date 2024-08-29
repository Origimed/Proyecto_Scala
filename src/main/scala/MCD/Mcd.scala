package MCD


object Mcd {

    def mcd(a:Int, b:Int): Int = {

    if (b == 0){
      return a
    }
    else {
      return mcd(b, a % b)}
  }
  
}
