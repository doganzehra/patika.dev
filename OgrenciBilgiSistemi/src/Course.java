public class Course {
    String name, code, prefix;
    int note;
    int note2;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher teacher1) {
        if (this.prefix.equals(teacher1.branch)) {
            this.teacher = teacher1;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher1.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
