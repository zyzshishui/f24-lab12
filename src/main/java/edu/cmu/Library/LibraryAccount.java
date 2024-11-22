package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;

    /**
     * Retrieves an array of checked-out books associated with the specified user ID.
     *
     * @param userId the UserId object whose books are to be retrieved
     * @return an array of Book objects the user has checked out
     */
    public Book[] getBooks(UserId userId) {
        return libraryService.getBooks(userId.getLibraryId(), userId.getUserName());
    }
}
