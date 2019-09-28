class Book{
	private int bookId;
	private String name;
	public setbookId(int bookId){
		this.bookId=bookId;
		System.out.println("bookId is set");
	}
	public getbookId(){
		return bookId;
	}
	public setname(String name){
		this.name=name;
	}
	public getname(){
		return name;
	}
}