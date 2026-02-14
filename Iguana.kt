package ca.bcit.lab5



class Iguana(playable: Playable?): Pet, Playable by playable as Playable {

    override val name: String
        get() = "Jeffery"

    override val sound: String
        get() = "Ahhh Uhhhh"


    override fun interact() {
        println("$name's tail fell off, $sound")
    }

    override fun feed() {
        println("$name ate some Salad (He's on a diet)")
    }
}