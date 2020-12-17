package headfirst.designpatterns.strategy

class RubberDuck : Duck() {

    init {
        flyBehavior = FlyNoWay()
        //quackBehavior = Squeak()
        quackBehavior = QuackBehavior { println("Squeak") }
    }


    override fun display() {
        println("I'm a rubber duckie")
    }
}
