package school.lemon.collection.lemonj1005;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if(obj instanceof Student){
            Student student = (Student) obj;
            if (student.getName() == null){
                return false;
            }
            if (student.hashCode() == this.hashCode()){
                return true;
            }

            if (student.getName().equals(this.getName())){
                return true;
            }
        }
        return false;
    }
}
