public class Main {
    public static void main(String[] args) {
//        branch1
        //HW 1 Exercise 1
        System.out.println("HW 1 Exercise 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        //HW 1 Exercise 2
        System.out.println();
        System.out.println("HW 1 Exercise 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + ".");

        //HW 1 Exercise 3
        System.out.println();
        System.out.println("HW 1 Exercise 3");
        firstName = "Семён ";
        middleName = "Семёнович";
        lastName = "Иванов ";
        fullName = lastName + firstName + middleName;
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё","е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName + ".");


    }
}