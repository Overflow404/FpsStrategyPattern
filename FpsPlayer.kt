package overflow404
abstract class FpsPlayer {
    internal lateinit var actionBehavior: ActionBehavior
    internal lateinit var healBehavior: HealBehavior

    fun performAction() {
        actionBehavior.doAction()
    }

    fun performHeal() {
        healBehavior.doHeal()
    }

    fun setActionBehavior(actionBehavior:ActionBehavior) {
        this.actionBehavior = actionBehavior
    }

    fun setHealBehavior(healBehavior: HealBehavior) {
        this.healBehavior = healBehavior
    }

    abstract fun display()
}
