import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {6, 1, 3, 4, 8, 5, 9};

        getSubArrayBetween(array);
    }

    public static void getSubArrayBetween(int[] numbers) {
        String string = ""; // СЮДА БУДЕМ СКЛАДЫВАТЬ ВСЕ ЭЛЕМЕНТЫ С ЗАПЯТЫМИ
        int countElement = 0; // ЭТО СЧЕТЧИК ЭЛЕМЕНТОВ ПРОХОДЯЩИХ УСЛОВИЕ НЕЧЕТНОСТИ
        String[] newArray = new String[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                string = string + numbers[i] + ","; // ЭТИ ЭЛЕМЕНТЫ
                countElement++; //СЧИТАЕМ ЭЛЕМЕНТЫ
            }
        }
        countElement *= 2; //ТАК КАК ЗАПЯТЫХ СТОЛЬКО ЖЕ СКОЛЬКО ЭЛЕМЕНТОВ ЗНАЧИТ ДЛИНА СТРОКИ БУДЕТ КОЛВО ЭЛЕМЕНТОВ УМНОЖИТЬ НА 2
        countElement = countElement -1; //КАК РАЗ ЗДЕСЬ МЫ ГОВОРИМ ЧТО ДЛИНА БУДЕТ НЕ УЧИТЫВАЯ ПОСЛЕДНЕЙ ЗАПЯТОЙ ТО ЕСТЬ -1
        String newString = string.substring(0, countElement); //ЧЕРЕЗ ПОДСТРОКУ SUBSTRING ОБРЕЗАЕМ ПОСЛЕДНЮЮ ЗАПЯТУЮ
        System.out.println(newString);
    }
}