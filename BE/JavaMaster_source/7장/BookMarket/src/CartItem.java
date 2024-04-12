package ch07;


public class CartItem {

	private String[] itemBook = new String[7];


	private String bookID;
	private int quantity;
	private int  totalPrice;
	
	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	
	public CartItem(String[] book) {
		
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;	
		updateTotalPrice();
	}
	public String[] getItemBook() {
		return itemBook;
	}

	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}

	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		return true;
	}
	*/
	
}
