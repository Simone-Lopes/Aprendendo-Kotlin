enum class IMC (val resultado:String, val minimo:Double, val maximo:Double, val acao:String) {
    ABAIXO_IDEAL ("Abaixo do ideal", Double.MIN_VALUE, 18.5, "Ganhar peso"),
    IDEAL ("Peso ideL", 18.6, 24.9, "Manter peso"),
    ACIMA_IDEAL ("Acima dop ideal", 25.0, Double.MAX_VALUE, "Perder peso");

    companion object{
        fun getAvaliarIMC(imcAmostra:Double):IMC{
            values().forEach {
                if(it.minimo >= imcAmostra && it.maximo < imcAmostra){
                    return it
                }
            }
            return throw ImcInvalidoException()
        }
    }
}