class ListaTareas () {

    val tareas = mutableListOf<Tarea>()

    fun agregarTarea(){}

    fun eliminarTarea(){}

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