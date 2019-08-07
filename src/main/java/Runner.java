import com.kashanok.domain.JsonDisplay;
import entity.Author;
import entity.Book;
import entity.Genre;

public class Runner
{
	public static void main(String[] args)
	{
		Book book = new Book();
		book.setId(1l);
		book.setName("Book name");

		Author author = new Author();
		author.setFirstName("Author name");
		author.setLastName("Author last name");
		book.setAuthor(author);
		book.setGenre(Genre.STORY);

		System.out.println(JsonDisplay.showJson(book));
	}
}
