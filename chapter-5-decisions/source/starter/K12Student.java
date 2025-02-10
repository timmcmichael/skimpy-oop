/*
 * This class represents a simplified K-12 student record, with a name, age, grade level (1-12), and school type (elementary, middle school, or high school).
 * 
 */
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
        return "[unknown]";
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}