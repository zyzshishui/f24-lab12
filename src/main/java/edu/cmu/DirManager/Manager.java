package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;

    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return DirectoryCreationStatus indicating the result of the operation.
     */
    public DirectoryCreationStatus newDirectory(String path) {
        if (dirOps.checkDirectoryExists(path)) {
            return DirectoryCreationStatus.ALREADY_EXISTS;
        } else if (!dirOps.checkPathValid(path)) {
            return DirectoryCreationStatus.INVALID_PATH;
        } else {
            dirOps.createDirectory(path);
            return DirectoryCreationStatus.SUCCESS;
        }
    }
}
