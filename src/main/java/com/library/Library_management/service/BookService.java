package com.library.Library_management.service;
import com.library.Library_management.model.Book;
import com.library.Library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //Business logic for Book

    @Autowired
    private BookRepository bookRepository;

    public getBookById(Long id){
        return bookRepository.findById(id).get();

    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public addBook(Book book){
        bookRepository.save(book);
    }

    public deleteBook(Long id) {
        bookRepository.deleteById(id);
    }











}
