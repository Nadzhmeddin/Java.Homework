import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework3 {

    public static void main(String[] args) {
        // evenNums(5, 10);
        // minNums(5, 10);
        // maxNums(5,10);
        // averageValue(5,10);
        sunSystem(10);
    }

    // 1.Пусть дан произвольный список целых чисел.
    // 1) Нужно удалить из него чётные числа
    // 2) Найти минимальное значение
    // 3) Найти максимальное значение
    // 4) Найти среднее значение

    static void evenNums(int size, int maxValue) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();

        for(int i = 0; i < size; i++)
            list.add(rand.nextInt(maxValue));
            System.out.print(list);
        System.out.println();

        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if(x % 2 == 0) evenList.add(x);
        } 
        System.out.println(evenList);
      }
    
    static void minNums(int size, int maxValue) {

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();

        for(int i = 0; i < size; i++)
            list.add(rand.nextInt(maxValue));
            System.out.print(list);
        System.out.println();
        
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(min >= list.get(i)) {
                min = list.get(i);
            }
        } System.out.println(min);
    }

    static void maxNums(int size, int maxValue) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();

        for(int i = 0; i < size; i++)
            list.add(rand.nextInt(maxValue));
            System.out.print(list);
        System.out.println();

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(max <= list.get(i)) {
                max = list.get(i);
            }
        }System.out.println(max);
    }

    static void averageValue(int size, int maxValue) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();

        for(int i = 0; i < size; i++)
            list.add(rand.nextInt(maxValue));
            System.out.print(list);
        System.out.println();

        double sum = 0;
        for (double num : list) {
            sum += num;
        }

        double averageNum = sum / size;
        System.out.println(averageNum);
    }  

    // Задание 2. Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
    static void sunSystem(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uran", "Neptune");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }System.out.println();

        
        Object[] arrPlanets = randPlanets.toArray();
        for (Object planet : arrPlanets) {
            if(randPlanets.indexOf(planet) != randPlanets.lastIndexOf(planet)) {
                randPlanets.remove(randPlanets.lastIndexOf(planet));
            }
        }
        System.out.print(randPlanets);
    }
}

