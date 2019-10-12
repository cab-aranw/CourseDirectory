package coursedirectory;
import java.util.Comparator;
/**
 * 1.- The ComparatorByYear interface is used to order objects 
 * @author w_ara
 */
public class ComparatorByYear implements Comparator<Course>
{
    public int compare(Course firstCourse, Course secondCourse)
    {
        if (firstCourse.getYearLevel()>secondCourse.getYearLevel()) 
        {
            return 1;
        }
        else if (firstCourse.getYearLevel() < secondCourse.getYearLevel()) 
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
