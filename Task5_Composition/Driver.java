class Driver {
    public static void main(String[] args) {
        Folder demo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("sourceFiles");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        demo1.addSubFolder(sourceFiles);
        demo1.addSubFolder(includePath);
        demo1.addSubFolder(remoteFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter");
        File indexHtml = new File("index.html");
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(indexHtml);

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder migrations = new Folder("migrations");
        Folder library = new Folder("library");
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(models);
        app.addSubFolder(views);
        app.addSubFolder(migrations);
        app.addSubFolder(library);

        demo1.printFolderStructure(0);

        sourceFiles.removeSubFolder(app);
        demo1.printFolderStructure(0);

         sourceFiles.removeSubFolder(publicFolder);
        demo1.printFolderStructure(0);
        
    }
}