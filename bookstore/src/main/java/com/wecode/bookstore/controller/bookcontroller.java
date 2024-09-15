package com.wecode.bookstore.controller;


import com.wecode.bookstore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("yash/")
public class bookcontroller {

    @GetMapping("yash/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book =BookDto.builder().title("chaman").build();
        List<BookDto> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);

    }
}
