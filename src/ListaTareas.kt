class ListaTareas () {

    val tareas = mutableListOf<Tarea>()

    fun agregarTarea(){}

    fun eliminarTarea(){}

    fun cambiarEstadoTarea(){}

    fun mostrarTarea(){
        for(i in tareas){
            print(i)
        }
    }
}