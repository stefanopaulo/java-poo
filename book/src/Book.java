
public class Book implements Publication {
	private String title;
	private String author;
	private int totPages;
	private int currentPage;
	private boolean open;
	private Person reader;

	public Book(String title, String author, int totPages, Person reader) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setTotPages(totPages);
		this.setCurrentPage(0);
		this.setOpen(false);
		this.setReader(reader);
	}

	public void details() {
		System.out.println("--- Detalhes do Livro ---");
		System.out.println("Título: " + this.getTitle());
		System.out.println("Autor: " + this.getAuthor());
		System.out.println("Páginas: " + this.getTotPages());
		System.out.println("Quem está lendo: " + this.getReader().getName());
		System.out.println();
	}

	@Override
	public void open() {
		if (!this.isOpen()) {
			this.setOpen(true);
		}
	}
	
	@Override
	public void close() {
		if (this.isOpen()) {
			this.setOpen(false);
		}
	}
	
	@Override
	public void flipThrough(int page) {
		if (this.isOpen() && page >= 0 && page <= this.getTotPages()) {
			this.setCurrentPage(page);
		}
	}
	
	@Override
	public void advancePage() {
		if (this.isOpen() && this.getCurrentPage() < this.getTotPages()) {
			this.setCurrentPage(this.getCurrentPage() + 1);
		}
	}
	
	@Override
	public void backPage() {
		if (this.isOpen() && this.getCurrentPage() > 0) {
			this.setCurrentPage(this.getCurrentPage() - 1);
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotPages() {
		return totPages;
	}

	public void setTotPages(int totPages) {
		this.totPages = totPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Person getReader() {
		return reader;
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}
}
