package overflow404
class HeavyTrooper : FpsPlayer() {
    init {
        actionBehavior = RocketGun()
        healBehavior = NoHeal()
    }

    override fun display() {
        print("This is an heavy trooper.\n")
        this.performAction()
        this.performHeal()
    }
}
