import java.util.*;

class Person {

    private String name;
    private int id;


    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Username: " + name);
        System.out.println("Id: " + id);
    }
}

class SchoolTest{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String studentName = input.nextLine();
        System.out.println("Enter your id: ");
        int studentId = input.nextInt();
        input.nextLine();
        System.out.println("Enter your grade: ");
        String studentGrade = input.nextLine();

        Person person = new Person("Billy Bob", 12345);
        System.out.println("Person Details:");
        person.displayInfo();

        Student student = new Student(studentName, studentId, studentGrade);
        System.out.println("\nStudent Details:");
        student.displayInfo();

        Staff staff = new Staff("Kurt Gotana", 54321, "IT Department");
        System.out.println("\nStaff Details:");
        staff.displayInfo();

        Teacher teacher = new Teacher("Bob Ross", 98765, "Art");
        System.out.println("\nTeacher Details:");
        teacher.displayInfo();
    }
}