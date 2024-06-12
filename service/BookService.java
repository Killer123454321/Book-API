package in.praveenit.service;

import java.util.List;

import in.praveenit.entity.Book;

public interface BookService {
	
	
	public String upsert(Book book);
	
	public List<Book> getAllBooks();
	
	public String deleteBook(Integer bookId);
	

}

