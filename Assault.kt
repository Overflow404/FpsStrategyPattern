package overflow404
class Assault : FpsPlayer() {
    init {
        actionBehavior = HeavyGun()
        healBehavior = NoHeal()
    }

    override fun display() {
        print("This is an assault.\n")
        this.performAction()
        this.performHeal()
    }
}

