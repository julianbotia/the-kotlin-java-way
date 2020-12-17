package headfirst.designpatterns.strategy

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}
