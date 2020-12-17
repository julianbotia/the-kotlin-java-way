package headfirst.designpatterns.strategy

abstract class Duck(
        var flyBehavior: FlyBehavior? = null,
        var quackBehavior: QuackBehavior? = null
) {

    abstract fun display()

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }
}