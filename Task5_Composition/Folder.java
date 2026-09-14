import java.util.ArrayList;

class Folder {
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public void printFolderStructure(int iterations) {
        System.out.println("+-- Folder: " + folderName);

        for (Folder subFolder : subFolders) {
            System.out.print("     ");
            for (int i = 0; i < iterations; i++) {
                System.out.print("     ");
            }
            subFolder.printFolderStructure(iterations + 1);
        }

        for (File file : files) {
            System.out.print("     ");
            for (int i = 0; i < iterations; i++) {
                System.out.print("     ");
            }
            System.out.println("+-- File: " + file.getFileName());
        }
    }

    // Folder Name getter and setter
    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }


    // Files and SubFolders getters
    public ArrayList<File> getFiles() {
        return files;
    }
    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }


    // Add files and subfolders
    public void addFile(File file) {
        files.add(file);
    }
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }


    // Remove files and subfolders
    public void removeFile(File file) {
        files.remove(file);
    }
    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
    }
}