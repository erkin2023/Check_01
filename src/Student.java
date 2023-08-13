class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    private String course;

    public Student(int id, String name, int age, String major, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getCourse() {
        return course;
    }
    
 


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
