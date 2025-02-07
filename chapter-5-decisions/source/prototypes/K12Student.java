public class K12Student {
    private String name;
    private int age;
    private int gradeLevel;

    // Constructors
    public K12Student(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

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
        if (this.gradeLevel < 6) {
            return "Elementary School";
        } else if (this.gradeLevel < 9) {
            return "Middle School";
        } else {
            return "High School";
        }
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age < 5) {
            this.age = 6;
        }
        if (this.age > 18) {
            this.age = 18;
        }
        this.gradeLevel = this.age - 6;

        // We'll eventually learn other ways to write this...
    }

}