package com.havi.controller;

import com.havi.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String getBookList(Model model){
        model.addAttribute("bookList", bookService.getBookList());
        return "book";
    }
}
