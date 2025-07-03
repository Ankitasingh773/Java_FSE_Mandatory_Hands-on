package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    private LoggerService loggerService;

    public BookService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        bookRepository.saveBook(title);
        loggerService.log("Book added: " + title);
    }
}
