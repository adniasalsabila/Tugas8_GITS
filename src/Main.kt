open class Sepatu{
    open fun merk(){

    }
    open fun slogan(){

    }
}

class Nike: Sepatu(){
    override fun merk() {
        print("Nike - ")
    }
    override fun slogan() {
        println("Just do it")
    }
}

class Adidas: Sepatu(){
    override fun merk() {
        print("Adidas - ")
    }
    override fun slogan() {
        println("Here to Create")
    }
}

class Vans: Sepatu(){
    override fun merk() {
        print("Vans - ")
    }
    override fun slogan() {
        println("Off the Wall")
    }
}

fun main(args: Array<String>){
    val nike = Nike()
    val adidas = Adidas()
    val vans = Vans()

    nike.merk()
    nike.slogan()

    adidas.merk()
    adidas.slogan()

    vans.merk()
    vans.slogan()
}