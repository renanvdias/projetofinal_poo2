package model;
public class AdaptadorLivroOnline implements LivroOnlineAdapter {
    private GoogleBooksService googleBooksService;

    public AdaptadorLivroOnline() {
        this.googleBooksService = new GoogleBooksService();
    }

    @Override
    public Livro buscarLivroOnlinePorISBN(String isbn) {
        try {
            String titulo = googleBooksService.searchTitulo(isbn);
            String autor = googleBooksService.searchAutor(isbn);

            Livro livro = new Livro(isbn, titulo, autor);

            return livro;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
