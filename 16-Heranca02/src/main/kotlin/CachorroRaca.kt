class CachorroRaca: Cachorro() {

    override fun getGramas(): Double {
        return 0.5
    }

    override fun correAoVerMoto(): Boolean {
        return false
    }

    override fun getPrecoMedio(): Double {
        return 2000.0
    }


}
