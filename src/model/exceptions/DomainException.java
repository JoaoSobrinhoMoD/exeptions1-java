package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) { // Construtor para permitir instanciar minha exce��o
											// personalizada passando uma mensagem e deixando armazenada dentro da
											// exce��o.
		super(msg);
	}
}
