class ListaTareas () {

    val tareas = mutableListOf<Tarea>()

    fun agregarTarea(id: String,descripcion: String) {
        tareas.add(Tarea(id, descripcion, Estado.PENDIENTE))
        println("Tarea añadida con éxito (ID: $id).")
    }

    fun eliminarTarea(id: String) {
        val tarea = tareas.find { it.id == id }
        if (tarea != null) {
            tareas.remove(tarea)
            println("Tarea eliminada con éxito.")
        } else {
            println("No se encontró una tarea con el ID $id.")
        }}

    fun cambiarEstadoTarea(tarea: Tarea){
        if(tarea.estado == Estado.PENDIENTE){
            tarea.estado = Estado.REALIZADA
        }
    }

    fun mostrarTarea(){
        for(i in tareas){
            print(i)
        }
    }
}