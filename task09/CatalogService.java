package task09;

import java.util.HashMap;
import java.util.Map;

public class CatalogService {
    private Map<String, Boolean> books = new HashMap<>();

    public CatalogService() {
        books.put("ISBN-111", true);
        books.put("ISBN-222", true);
    }

    public boolean isAvailable(String isbn) {
        return books.getOrDefault(isbn, false);
    }

    public void setAvailability(String isbn, boolean available) {
        if (books.containsKey(isbn)) {
            books.put(isbn, available);
        }
    }
}