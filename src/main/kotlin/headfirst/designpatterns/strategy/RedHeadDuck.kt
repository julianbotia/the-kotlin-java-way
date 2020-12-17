package headfirst.designpatterns.strategy

class RedHeadDuck : Duck() {
    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a real Red Headed duck")
    }
}