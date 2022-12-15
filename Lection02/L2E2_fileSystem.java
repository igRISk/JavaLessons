// Working with File System

//      Ошибки:
//          try { 'Код, в котором может появиться ошибка' }
//          catch (Exception e) { 'Обработка, если ошибка случилась' }
//          finally { 'Код, который выполнится в любом случае' } 

//      isHidden():     возвращает истину, если каталог или файл скрытые
//      length():       возвращает размер файла в байтах
//      lastModified(): возвращает время последнего изменения файла или каталога
//      list():         возвращает массив файлов и подкаталогов, которые находятся в каталоге
//      listFiles():    возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
//      mkdir():        создает новый каталог
//      renameTo(File dest):    переименовывает файл или каталог



import java.io.File;
public class L2E2_fileSystem {
    public static void main(String[] args) {

// Работа с папками:
        String pathProjectD = System.getProperty("user.dir");
        String pathDir = pathProjectD.concat("/Lection02/L2_files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname: dir.list()) {
            System.out.println(fname);
        }
// Работа с файлами:
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/Lection02/L2_files/file.txt");
            File file = new File(pathFile);
            System.out.println(file.getAbsolutePath());
            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally { 
            System.out.println("finally"); 
        }

    }
}