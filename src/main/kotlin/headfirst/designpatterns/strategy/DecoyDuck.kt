package headfirst.designpatterns.strategy

class DecoyDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
    }

    override fun display() {
        println("I'm a duck Decoy")
    }
}
