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

class SchoolTest extends Person{
    public SchoolTest(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {
        Person person = new Person("Billy Bob", 12345);
        person.displayInfo();

        Student student = new Student("Jane Smith", 67890, "Grade 10");
        student.displayInfo();

        Staff staff = new Staff("Kurt Gotana", 54321, "IT Department");
        staff.displayInfo();

        Teacher teacher = new Teacher("Bob Ross", 98765, "Art");
        teacher.displayInfo();
    }
}