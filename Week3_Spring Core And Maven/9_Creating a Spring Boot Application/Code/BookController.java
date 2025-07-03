package com.library.controller;
import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookRepo.findById(id);
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookRepo.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    return bookRepo.save(book);
                })
                .orElseGet(() -> {
                    updatedBook.setId(id);
                    return bookRepo.save(updatedBook);
                });
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepo.deleteById(id);
    }

}
