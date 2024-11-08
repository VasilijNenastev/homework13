import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("Строки задача №1");
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" " + firstName+" " + middleName;
        System.out.print("Ф.И.О. сотрудника " + fullName);
        System.out.println();

        System.out.print("Строки задача №2");
        System.out.println();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "+fullName.toUpperCase());

        System.out.print("Строки задача №3");
        System.out.println();
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.print("Данные Ф.И.О. сотрудника - "+fullName1);







    }
}