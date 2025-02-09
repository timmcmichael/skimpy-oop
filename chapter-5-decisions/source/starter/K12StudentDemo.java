public class K12StudentDemo {

    public static void main(String[] args) {
        K12Student student1 = new K12Student("Vanessa", 5);
        System.out.println(student1.getName() + " is in " + student1.getSchoolType());

        K12Student student2 = new K12Student("Carlos", 10);
        System.out.println(student2.getName() + " is in " + student2.getSchoolType());

        K12Student student3 = new K12Student("Ling", 15);
        System.out.println(student3.getName() + " is in " + student3.getSchoolType());

        K12Student student4 = new K12Student("Jeff", 122);
        System.out.println(student4.getName() + " is in " + student4.getSchoolType());

        student4.setAge(12);
        System.out.println(student4.getName() + " has been changed to " + student4.getSchoolType());
    }

}
