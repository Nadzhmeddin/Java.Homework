import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.ArrayList;

public class Homework2 {
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
        System.out.printf("%d ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
        }
    public static void main(String[] args) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(Homework2.class.getName());
    FileHandler fh = new FileHandler("Homework2-2(log).txt");

    logger.addHandler(fh);

    SimpleFormatter simple = new SimpleFormatter();
    fh.setFormatter(simple);
    logger.info("Массив отсортирован");

    int [] array = {1, 5, 3, 1, 3, 64, 0};
    printArrayInt(array);
    int[] newArr = SortArr(array);
    System.out.print("\nОтсортированный массив: ");
    printArrayInt(newArr);
    }

    public static int[] SortArr(int [] arr){
        for(int i = 0; i < arr.length-1; i++) {
            
            for (int j = 0; j < arr.length - 1-i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
   
     // 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
         // 1 Расширение файла: txt
         // 2 Расширение файла: pdf
         // 3 Расширение файла:
         // 4 Расширение файла: jpg

//      public static void main(String[] args) {

//          List<String> files = get_files();
//          for (String file : files)
//              System.out.println("Расширение файла: " + file_extension(file));
//      }

//      public static String file_extension(String file) {
//          int index = file.lastIndexOf(".");
//          if (index == -1)
//              return "";
//          return file.substring(index + 1);
//      }

//      public static List<String> get_files() {

//          File dir = new File(".");

//          File[] files;
//          try {
//              files = dir.listFiles();
//          } catch (Exception ex) {
//              ex.printStackTrace();
//              return null;
//          }
//          if (files == null)
//              return null;

//          List<String> list = new ArrayList<String>();
//          for (File file : files)
//              if (file.isFile())
//                  list.add(file.getName());

//          return list;
//      }
    

}


