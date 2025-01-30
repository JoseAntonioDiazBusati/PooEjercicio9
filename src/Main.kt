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
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}