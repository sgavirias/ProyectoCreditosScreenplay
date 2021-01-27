package co.com.proyectobase.screenplay.exceptions;

import co.com.proyectobase.screenplay.questions.DatosAcademicos;
import org.apache.regexp.RE;

public class DatosAcademicosNoValidos extends AssertionError {

    public static final String MENSAJE_DATOS_ACADEMICOS_INVALIDOS = "NO CARGÓ CORRECTAMENTE LA IDENTIFICACIÓN DEL USUARIO";

    public DatosAcademicosNoValidos(String message, Throwable cause){
        super(message, cause);
    }
}
