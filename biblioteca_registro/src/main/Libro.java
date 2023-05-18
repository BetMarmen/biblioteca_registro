package main;

public class Libro {
	 private String name;
	 private String autor;
	 private String editorial;
	 private int year;
	public Libro(String name, String autor, String editorial, int year) {
		this.name = name;
		this.autor = autor;
		this.editorial = editorial;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	 
}
