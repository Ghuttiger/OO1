package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {

	private String texto;
	private int likes;
	private boolean destacado;
	
	public WallPost() {
	this.texto="Undefined post";
	this.likes=0;
	this.destacado=false;
	}

	public String getText() {
		return this.texto;
	};

	public void setText(String text) {
		this.texto=text;
	};

	int getLikes() {
		return this.likes;
	};

	public void like() {
		this.likes++;
	};
	
	public void dislike() {
		if (this.likes>0) {
			this.likes--;
		}
	};

	public boolean isFeatured() {
		return this.destacado;
	};

	public void toggleFeatured() {
		this.destacado=!this.destacado;
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}