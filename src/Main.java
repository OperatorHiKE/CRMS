public class Main {
    public static void main(String[] args)
    {
        Student stud = new Student();
        Admin admin = new Admin();
        Instructor instructor = new Instructor();
        stud.setStudent_name("Nurkhan");
        stud.setStudent_group("IT-2105");
        admin.setAdmin_name("Darkhan");
        instructor.setInstructor_name("Elvira");

        System.out.println(stud.getStudent_name());
        System.out.println(admin.getAdmin_name());
        System.out.println(instructor.getInstructor_name());
        System.out.println(stud.toString() + " " + admin.toString() + " " + instructor.toString());
    }
}
