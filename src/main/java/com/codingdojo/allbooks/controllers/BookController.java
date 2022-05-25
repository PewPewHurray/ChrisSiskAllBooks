package com.codingdojo.allbooks.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.allbooks.models.Book;
import com.codingdojo.allbooks.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("")
	public String index(Model model) {
		ArrayList<Book> books = bookService.allbooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@GetMapping("/{id}")
	public String showBook(Model model, @PathVariable()Long id) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@PostMapping("/create")
	public String create() {
		return "redirect:/books";
	}
}
