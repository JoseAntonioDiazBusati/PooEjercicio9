class Tarea (val id: String, val descripcion: String, val estado: Estado) {

    enum class Estado{
        PENDIENTE, REALIZADA
    }

    override fun toString(): String {
        return "Identificador: $id, descripcion: $descripcion, estado: $estado"
    }
}