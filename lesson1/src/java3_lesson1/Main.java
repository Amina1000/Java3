package java3_lesson1;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * java.level3.lesson1 example of homework
 *
 *
 * @auphtor Isaeva Amina
 * @version dated february 24,2020
 */
public class Main {

    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        try {
            swapArray(arr1, 2, 4);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        //2. Написать метод, который преобразует массив в ArrayList;
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        arrayToArrayList(dArray);
        System.out.println("Массив в ArrayList: " + Arrays.toString(dArray));
    }

     /**
     *
     * @param arr массив данных ссылочного типа
     * @param position1 елемент массива, который нужно заменить
     * @param position2 елемент массива, на который нужно заменить
     */
    public static void swapArray(Object[] arr, int position1, int position2) throws WrongPositionException{
        System.out.println("Массив данных: "+ Arrays.toString(arr));
        if (position1 < 0 || position1> arr.length ||
                position2 < 0 || position2 > arr.length || position1 == position2) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }

        Object sw = arr[position1];
        arr[position1]=arr[position2];
        arr[position2]=sw;
        System.out.println("Массив преобразованных данных: "+Arrays.toString(arr));
    }

     /**
     *
     * @param array массив
     * @param <T> тип данных
     * @return преобразованный массив
     */
    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}


