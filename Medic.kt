package overflow404
class Medic : FpsPlayer() {
    init {
        actionBehavior = LigthGun()
        healBehavior = Heal()
    }

    override fun display() {
        print("This is a medic.\n")
        this.performAction()
        this.performHeal()
    }
}
