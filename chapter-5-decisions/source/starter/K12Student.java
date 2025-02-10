public class K12Student {
    private String name;
    private int age;
    private int gradeLevel;

    // Constructors

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getSchoolType() {
        return "unknown";
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}