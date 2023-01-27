class Cliente(dni:String, listacuentas: MutableList<Cuenta>) { /*creamos el objeto "Cliente"*/
    var dni=dni
        get():String{
            return field
        }
        set(valor){
            if (valor.length<10){
               println("DNI erróneo ")
            }else{
                field = valor
            }
        }
    var listacuentas=listacuentas                   /* configuramos los métodos get y set para los atributos*/
        get():MutableList<Cuenta>{
            return field
        }
        set(valor:MutableList<Cuenta>){
            if (valor.size>3){
                println("Error, el máximo numero de cuentas por persona es 3")
            }else if(valor.size<1){
                println("Error, debe haber al menos una cuenta por cliente")
            }else{
                field=valor
            }
        }
    fun añadeCuenta(nuevacuenta:Cuenta){         /* función para añadir cuentas nuevas*/
        if(listacuentas.size<3) {
            listacuentas.add(nuevacuenta)
            println("La cuenta ${nuevacuenta.numcuenta} se ha añadido correctamente al cliente ${this.dni}")
        }
    }
    fun moroso(){                                 /* función paracomprobar si un cliente tiene saldo negativo en alguna de sus cuentas*/
        for (c in this.listacuentas){
            if (c.saldo < 0){
                println("Su cuenta ${c.numcuenta}, está en números rojos")
            }else{
                println("Su cuenta ${c.numcuenta} tiene saldo positivo")
            }
        }
    }
    fun mostrarCliente(){                 /* función para mostrar toda la información del cliente*/
        println("Cliente con dni: ${this.dni}")
        for (c in this.listacuentas){
            println("Cuenta número ${c.numcuenta} con saldo ${c.saldo} euros")
        }
    }
}