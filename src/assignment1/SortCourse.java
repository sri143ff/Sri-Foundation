package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCourse {
    public static void main(String[] args) {
        Course c1 = new Course(101, "Java", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 8000);
        Course c5 = new Course(105, "Angular", 12000);
        List<Course> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        System.out.println("Total Number of Courses: " + list.size()); // 4
        System.out.println("All Courses");

        for (Course c : list) {
            System.out.println(c);
        }
        System.out.println("All Courses in ASC order by Fee");
        sortCourses(list, "ASC");
        System.out.println("All Courses in DESC order by Fee");
        sortCourses(list, "DESC");
        System.out.println("All Courses in ASC order by Name");
        sortCourseByName(list, "ASC");
        System.out.println("All Course in DSC order by Name");
        sortCourseByName(list, "DESC");
    }

    private static void sortCourses(List<Course> list, String direction) {
        Collections.sort(list, new CourseUtility(direction));
        for (Course c : list) {
            System.out.println(c);
        }
    }

    private static void sortCourseByName(List<Course> list, String direction) {
        Collections.sort(list, new CourseUtility1(direction));
        for (Course c : list) {
            System.out.println(c);
        }
    }
}


