package assignment1;

public class Course {
    int id;
    String coursename;
    int fee;

    public Course(int id,String coursename, int fee) {
        this.id = id;
        this.coursename = coursename;

        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", fee=" + fee +
                '}';
    }
}

