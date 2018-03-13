package overflow404
class Engineer : FpsPlayer() {
    init {
        actionBehavior = WrenchGun()
        healBehavior = Heal()
    }

    override fun display() {
        print("This is an engineer.\n")
        this.performAction()
        this.performHeal()
    }
}
