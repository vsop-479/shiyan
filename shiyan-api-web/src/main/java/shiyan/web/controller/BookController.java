package shiyan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shiyan.domain.Book;
import shiyan.service.book.BookService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2015/9/10.
 */
@Controller
@Scope("prototype")
public class BookController {
    @Autowired
    private BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public BookController(){
        System.out.println("BookController init");
    }

    @RequestMapping("/book/add")
    public String addBook(HttpServletRequest request, HttpServletResponse response, Book book){
        bookService.doService();
        return "book";
    }

    @RequestMapping("/book/get")
    public String getBook(HttpServletRequest request, HttpServletResponse response, Book book){
        return "book";
    }

    @RequestMapping("/book/getbookson")
    public @ResponseBody Book getBookson(){
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        return book;
    }
    @RequestMapping(value = "/book/getwhat", method = RequestMethod.GET)
    public String getWhat(HttpServletRequest request, HttpServletResponse response, Book book, RedirectAttributes attr){
        attr.addAttribute("author", book.getAuthor());
        attr.addAttribute("name", book.getName());
        return "redirect:/book/get";
    }
}
