/*
Realizar un programa para gestionar una Lista de tareas con POO.

El programa debe mostrar un menú en el que se pueda agregar (por defecto una nueva tarea tendrá el estado pendiente),
eliminar y cambiar el estado de una tarea. También será posible mostrar la lista de tareas (todas las tareas),
mostrar la lista de tareas pendientes y la lista de tareas ya realizadas.

Una tarea debe tener un identificador (podrá indicarlo o generarlo automáticamente), una descripción
y un estado que indique si está pendiente o ya fue realizada (en este caso, deberá mostrar la fecha,
 con formato DD-MM-AAAA HH:MM:SS, en la que se marcó cómo realizada)
*/


fun main() {
    val tareas = ListaTareas()
    while (true) {
        println("MENU DE GESTIÓN DE TAREAS ---")
        println("1. Agregar tarea")
        println("2. Eliminar tarea")
        println("3. Cambiar estado de una tarea")
        println("4. Mostrar todas las tareas")
        println("5. Mostrar tareas pendientes")
        println("6. Mostrar tareas realizadas")
        println("0. Salir")
        print("Selecciona una opción: ")
        val opcion = readln().toInt()
        if (opcion == 1){
            val tarea1 = tareas.agregarTarea()
        }
        if (opcion == 2){
            tareas.eliminarTarea()
        }
        if (opcion == 3){
            tareas.cambiarEstadoTarea()
        }
        if (opcion == 4){}
        if (opcion == 5){}
        if (opcion == 6){}
        if (opcion == 0){}
        else{
            println("Elige una opcion de las disponibles!!!")
        }

    }
}