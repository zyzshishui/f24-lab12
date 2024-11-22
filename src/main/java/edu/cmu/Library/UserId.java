package edu.cmu.Library;

public class UserId {
    private final String libraryId;
    private final String userName;

    public UserId(String libraryId, String userName) {
        this.libraryId = libraryId;
        this.userName = userName;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getUserName() {
        return userName;
    }

    public static UserId fromString(String userId) {
        String[] parts = userId.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid userId format");
        }
        return new UserId(parts[0], parts[1]);
    }
}
