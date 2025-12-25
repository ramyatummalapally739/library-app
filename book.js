class Book {
  constructor(title, copies) {
    this.title = title;
    this.copies = copies;
  }

  checkAvailability() {
    if (this.copies > 0) {
      return "Available";
    }
    return "Not Available";
  }
}

const book = new Book("Science", 1);
console.log(book.checkAvailability());
