import java.util.Scanner;

class StudentGroup {
    private String groupName;
    private int totalStudents;
    private int maleCount;
    private int femaleCount;

    // Конструктор класу
    public StudentGroup() {
        totalStudents = 0;
        maleCount = 0;
        femaleCount = 0;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Назва групи: ");
        groupName = scanner.nextLine();
        System.out.print("Кількість всього студентів: ");
        totalStudents = scanner.nextInt();
        System.out.print("Кількість чоловіків студентів:: ");
        maleCount = scanner.nextInt();
        System.out.print("Кількість жінок студенток: ");
        femaleCount = scanner.nextInt();
    }

    // Функція для виведення даних
    public void displayData() {
        System.out.println("\nНазва групи: " + groupName);
        System.out.println("Кількість студентів: " + totalStudents);
        System.out.println("Чоловіки: " + maleCount);
        System.out.println("Жінки: " + femaleCount);
    }

    public double calculateMalePercentage() {
        return ((double) maleCount / totalStudents) * 100;
    }

    public double calculateFemalePercentage() {
        return ((double) femaleCount / totalStudents) * 100;
    }
}
class ExtendedStudentGroup extends StudentGroup {
    private String additionalField1;
    private String additionalField2;


    public ExtendedStudentGroup() {
        additionalField1 = "";
        additionalField2 = "";
    }


    public void setAdditionalFields(String field1, String field2) {
        additionalField1 = field1;
        additionalField2 = field2;
    }


    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Додаткове поле 1: " + additionalField1);
        System.out.println("Додаткове поле 2: " + additionalField2);
    }
}

