public class LibraryRecord {
	// Private instance variables
	private String titleOfBook;
	private String authorName;
	private double LOCcatalogNumber;
	private String publisherName;
	private int yearPublished;
	private boolean isCirculating;

	public LibraryRecord(String title, String author, double catalogNumber, String publisher, int year, boolean circulating) {
		titleOfBook = title;
		authorName = author;
		LOCcatalogNumber = catalogNumber;
		publisherName = publisher;
		yearPublished = year;
		isCirculating = circulating;
	}

	public LibraryRecord(String title, String author, double catalogNumber, String publisher, int year) {
		titleOfBook = title;
		authorName = author;
		LOCcatalogNumber = catalogNumber;
		publisherName = publisher;
		yearPublished = year;
		isCirculating = true;
	}
/**
 * Gets title of book.
 */
	public String getTitle() {
		return titleOfBook;
	}
/**
 * Gets name of author.
 */
	public String getAuthor() {
		return authorName;
	}
/**
 * Gets Library of Congress catalog number.
 */
	public double getNumber() {
		return LOCcatalogNumber;
	}
/**
 * Gets publisher's name.
 */
	public String getPublisher() {
		return publisherName;
	}
/**
 * Gets the year of publication.
 */
	public int getYear() {
		return yearPublished;
	}
/**
 * Gets whether or not is in circulation.
 */
	public boolean isCirculating() {
		return isCirculating;
	}
/**
 * Sets whether the book is circulating.
 */
	public void setIsCirculating(boolean circulating) {
		isCirculating = circulating;
	}
/**
 * Creates a String to identify this book.
 */
	public String toString() {
		String circulating;
		// Determines which String to use for value of isCirculating.
		if (isCirculating) {
			circulating = "Is circulating";
		} else {
			circulating = "Is not circulating";
		}
		return titleOfBook + " by " + authorName + " published by " + publisherName + " in " + yearPublished + ". " + circulating + " with catalog number " + LOCcatalogNumber + "."; 
	}
}