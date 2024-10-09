package model;

public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int idLivro, String titulo, String autor, boolean disponivel) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    // Getters e Setters
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
