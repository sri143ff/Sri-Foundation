package assignment1;

import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {
    String direction;

    public CourseUtility(String direction) {
        this.direction = direction;
    }

    @Override
    public int compare(Course c1, Course c2) {
        if(direction.equals("ASC")){
            if(c1.fee > c2.fee)
                return 1;

            if(c1.fee < c2.fee)
                return -1;
        }
        else{
            if(c1.fee < c2.fee)
                return 1;

            if(c1.fee > c2.fee)
                return -1;
        }

        return 0;
    }
}
