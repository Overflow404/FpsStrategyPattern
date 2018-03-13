package overflow404
class NoHeal : HealBehavior {

    override fun doHeal() {
        print("This class can't heal.\n")
    }
}
