package br.com.pablo;

public class Greeting {
	//atributos
	private final long id;
	private final String content;
	//construtor
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	//Getters and Setters
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}	
}
