package exceptions;

/**
 * 
 * 
 * @author Luiz Fernando da Silva
 * 
 * Classe das excecoes de logica
 *
 */
public class LogicaException extends SteamException {

	private static final long serialVersionUID = 1L;
	
	public LogicaException(){
		super("Logica invalida!");
	}
	
	public LogicaException(String mensagem){
		super(mensagem);
	}
}
