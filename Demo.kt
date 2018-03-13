package overflow404
fun main(args: Array<String>) {
     var a1:FpsPlayer = HeavyTrooper()
        var a2:FpsPlayer = Assault()
        var a3:FpsPlayer = Medic()
        var a4:FpsPlayer = Engineer()

        a1.display()
        a2.display()
        a3.display()
        a4.display()

        a1.setActionBehavior(HeavyGun())
        a3.setHealBehavior(NoHeal())
        a1.display()
        a3.display()
}
