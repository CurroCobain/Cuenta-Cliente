fun main(args: Array<String>) {
 var cuenta1=Cuenta("123456789A", 0)
 var cuenta2=Cuenta("987654321B", 700)
 var cuenta3=Cuenta("456789123C", 5000)
 var Pepe=Cliente("111111111A", mutableListOf(cuenta1,cuenta2))

   /* println(cuenta1.toString())
    println(cuenta2.toString())*/
    cuenta1.transferencia(cuenta2,10)  /*Esta versión es sin menú más adelante haré una con menú*/
    cuenta1.ingreso(1000)
    cuenta2.pagos(750)
    println(cuenta1.toString())
    println(cuenta2.toString())
    Pepe.moroso()
    Pepe.mostrarCliente()
    Pepe.añadeCuenta(cuenta3)
    Pepe.mostrarCliente()

}
