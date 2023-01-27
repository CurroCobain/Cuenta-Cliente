fun main(args: Array<String>) {
    var cuenta1 = Cuenta("123456789A", 0)
    var cuenta2 = Cuenta("987654321B", 700)
    var cuenta3 = Cuenta("456789123C", 5000)
    var cuenta4= Cuenta("78945628D",500)
    var lista1= mutableListOf<Cuenta>(cuenta1,cuenta2,cuenta3)
    var lista2= mutableListOf<Cuenta>(cuenta1,cuenta2,cuenta3,cuenta4)
    var Pepe = Cliente("111111111A", mutableListOf(cuenta1, cuenta2))
    var Manolo=Cliente("333333333A", lista2)


    /*cuenta1.transferencia(cuenta2, 10)  /*Esta versión es sin menú más adelante haré una con menú*/
    cuenta1.ingreso(1000)
    cuenta2.pagos(750)
    println(cuenta1.toString())
    println(cuenta2.toString())

    Pepe.moroso()
    Pepe.mostrarCliente()
    Pepe.añadeCuenta(cuenta3)
    Pepe.añadeCuenta(cuenta4)
    Pepe.mostrarCliente()*/
    Manolo.mostrarCliente()
    Manolo.añadeCuenta(cuenta4)
    Manolo.mostrarCliente()


    /*
    var eleccion=5
    while (eleccion != 5)
        println(""" Bienvenido a nuestro banco, elija qué desea hacer:
            1) Añadir una cuenta.
            2) Hacer una transferencia.
            3) Hacer un ingreso en cuenta.
            4) Realizar un pago.
            5) Salir del menú.
        """.trimIndent())


        eleccion=readln().toInt()
        when (eleccion){
            1->{println("Dime el numero de la cuenta ")
                var nuevoNombre=readln().toString()
                println("Dime el saldo de la cuenta ")
                var nuevoNum= readln().toInt()
                //Cuenta(numcuenta:String, saldo: Int)
                Pepe.añadeCuenta(Cuenta(nuevoNombre,nuevoNum))


            }
        }

}

*/
}