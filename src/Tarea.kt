class Tarea (val id: String, val descripcion: String, var estado: Estado) {

    override fun toString(): String {
        return "Identificador: $id, descripcion: $descripcion, estado: $estado"
    }
}