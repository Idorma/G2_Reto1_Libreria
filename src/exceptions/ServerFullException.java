package exceptions;

/**
 * Excepcion en el caso de que el servidor este lleno.
 * @author Alain Cosgaya
 */
public class ServerFullException extends Exception{

	private static final long serialVersionUID = 1L;
        /**
         * Constructor de ServerFullException.
         * @param message Mensaje enviado desde la implementacion del DAO que se
         * le mostrara al usuario.
         */
	public ServerFullException(String message) {
		super(message);
	}
	
}
