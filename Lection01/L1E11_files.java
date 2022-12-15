/**
* Working with files 
*/


import java.io.*;
public class L1E11_files {
    public static void main(String[] args) throws Exception {

// Создание и запись/дозапись ------------------------------------------------------------------------------------
        
        String filepath = "D:\\GeekBrainsLessons\\JavaProjects\\Lection01\\Files\\file.txt";
        try (FileWriter fw = new FileWriter(filepath, false)) {     // false - создаем новый файл
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        String filepathA = "D:\\GeekBrainsLessons\\JavaProjects\\Lection01\\Files\\fileA.txt";
        try (FileWriter fw = new FileWriter(filepathA, true)) {     // true - дописываем  в существующий
            fw.write("MY line");
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());   
        }

// Чтение, посимвольно -------------------------------------------------------------------------------------------

        String filepathR = "D:\\GeekBrainsLessons\\JavaProjects\\Lection01\\Files\\fileR.txt";
        FileReader fr = new FileReader(filepathR);
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            System.out.print(ch);
        }
        System.out.println("\n");
        fr.close();

// Чтение, построчно ---------------------------------------------------------------------------------------------

        BufferedReader br = new BufferedReader(new FileReader(filepathR));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
