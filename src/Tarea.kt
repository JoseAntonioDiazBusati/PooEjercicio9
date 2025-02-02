import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea (val id: String, val descripcion: String, var estado: Estado) {

    var fechaRealizacion: String? = null

    fun marcarComoRealizada() {
        if (estado == Estado.PENDIENTE) {
            estado = Estado.REALIZADA
            fechaRealizacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
        }
    }

    override fun toString(): String {
        return "Identificador: $id, descripcion: $descripcion, estado: $estado"
    }
}