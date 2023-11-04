package model;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.books.Books;
import com.google.api.services.books.BooksRequestInitializer;
import com.google.api.services.books.model.Volume;
import com.google.api.services.books.model.Volumes;

public class GoogleBooksService {
    private static final String APPLICATION_NAME = "MyApp";
    private static final String API_KEY = "AIzaSyAVg1kuNNeXgGvPDdDyZ45pcOkfz4a2XZE";
    private static JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

    public String searchTitulo(String isbn) throws Exception {
        final Books books = new Books.Builder(GoogleNetHttpTransport.newTrustedTransport(), jsonFactory, null)
                .setApplicationName(APPLICATION_NAME)
                .setGoogleClientRequestInitializer(new BooksRequestInitializer(API_KEY))
                .build();

        Volumes volumes = books.volumes().list("isbn:" + isbn).execute();
        if (volumes.getTotalItems() == 0 || volumes.getItems() == null) {
            return "No matches found.";
        }

        Volume volume = volumes.getItems().get(0);
        Volume.VolumeInfo volumeInfo = volume.getVolumeInfo();
        volumeInfo.getAuthors();
        return volumeInfo.getTitle();
    }
    
    public String searchAutor(String isbn) throws Exception {
        final Books books = new Books.Builder(GoogleNetHttpTransport.newTrustedTransport(), jsonFactory, null)
                .setApplicationName(APPLICATION_NAME)
                .setGoogleClientRequestInitializer(new BooksRequestInitializer(API_KEY))
                .build();

        Volumes volumes = books.volumes().list("isbn:" + isbn).execute();
        if (volumes.getTotalItems() == 0 || volumes.getItems() == null) {
            return "No matches found.";
        }

        Volume volume = volumes.getItems().get(0);
        Volume.VolumeInfo volumeInfo = volume.getVolumeInfo();
        return "" + volumeInfo.getAuthors();
    }
    
}
