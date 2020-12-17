package headfirst.designpatterns.strategy

fun main() {
    val redhead: Duck = RedHeadDuck()
    redhead.display()
    redhead.swim()
    redhead.performQuack()
    redhead.performFly()
    println()

    val rubberDuckie: Duck = RubberDuck()
    rubberDuckie.display()
    redhead.swim()
    rubberDuckie.performQuack()
    rubberDuckie.performFly()
    print("-")
    rubberDuckie.flyBehavior = FlyRocketPowered()
    rubberDuckie.performFly()
    rubberDuckie.quackBehavior = QuackBehavior { print("Squeak Squeak Squeak") }
    rubberDuckie.performQuack()
}