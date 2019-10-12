package coursedirectory;
import java.util.Comparator;
/**
 * 1.- The Comparator interface is used to order objects 
 * @author w_ara
 */
public class ComparatorByFLACourseName implements Comparator <Course>
{
    public int compare(Course firstCourse, Course secondCourse)
    {
        return  (firstCourse.getFLACourseName().compareToIgnoreCase(secondCourse.getFLACourseName()));
    }
}
