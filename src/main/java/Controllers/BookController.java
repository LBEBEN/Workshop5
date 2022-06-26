package Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import AuxilaryClass.Book;


@RestController
@RequestMapping("/books")
public class BookController {


    @RequestMapping("/hello")
    public String hello() {

        return "Thimlomg in Java";

    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
            Book book = new Book(1L, "9788324631766", "Thinking in Java",
                    "Bruce Eckel", "Helion", "programming");
        return book;

    }

}
