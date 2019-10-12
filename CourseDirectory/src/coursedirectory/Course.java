package coursedirectory;
import java.util.ArrayList;
/**
 * 1.- The Course class contains the information of a course
 * @author w_ara
 */
public class Course implements Comparable
{   
    /**
     * 1.- Instance variables of the Course object.
     */
    private String FIUCourseName;
    private String FLACourseName;
    private int yearLevel;
    private int numCredits;
    private ArrayList<String> prerequisites;
    
    /**
     * 1.- Constructor for the Course object.
     * 2.- It moves the parameters passed to the
     * constructor into the instance variables
     * @param anFIUCourseName
     * @param aFLACourseName
     * @param aYearLevel
     * @param aNumCredits
     * @param myPreReqs 
     */
    public Course(String anFIUCourseName, String aFLACourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs)
    {
        FIUCourseName = anFIUCourseName;
        FLACourseName = aFLACourseName;
        yearLevel = aYearLevel;
        numCredits = aNumCredits;
        prerequisites = new ArrayList<String>(myPreReqs);
       
    }
    /**
     * 1.- The getFIUCourseName method returns a Course objects getFIUCourseName.
     * @return 
     */
    public String getFIUCourseName() {
        return FIUCourseName;
    }
    /**
     * 1.- The setFIUCourseName method stores a value in the setFIUCourseName field.
     * @param FIUCourseName 
     */
    public void setFIUCourseName(String FIUCourseName) {
        this.FIUCourseName = FIUCourseName;
    }
    /**
     * 1.- The getFLACourseName method returns a Course objects getFLACourseName.
     * @return 
     */
    public String getFLACourseName() {
        return FLACourseName;
    }
    /**
     * 1.- The setFLACourseName method stores a value in the setFLACourseName field.
     * @param FLACourseName 
     */
    public void setFLACourseName(String FLACourseName) {
        this.FLACourseName = FLACourseName;
    }
    /**
     * 1.- The getYearLevel method returns a Course objects getYearLevel.
     * @return 
     */
    public int getYearLevel() {
        return yearLevel;
    }
    /**
     * 1.- The setYearLevel method stores a value in the setYearLevel field.
     * @param yearLevel 
     */
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    /**
     * 1.- The getNumCredits() method returns a Course objects getNumCredits.
     * @return 
     */
    public int getNumCredits() {
        return numCredits;
    }
    /**
     * 1.- The setNumCredits method stores a value in the setNumCredits field.
     * @param numCredits 
     */
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }
    /**
     * 
     * @param prerequisites 
     */
    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = new ArrayList<String>(prerequisites);
    }
    /**
     * 1.- The toString method returns the string representation of the values
     * stored in lastName,description,military hour, military minutes.
     *     
     * @return 
     */
    @Override
    public String toString() {
        return "Course{" + "FIUCourseName=" + FIUCourseName + ", FLACourseName=" + FLACourseName + ", yearLevel=" + yearLevel + ", numCredits=" + numCredits + ", prerequisites=" + prerequisites + '}';
    }
    /**
     * 1.- Method override.
     * 2.- Passes and object and obtains a numerical value.
     * @param anObject
     * @return 
     */
    //What comparison method should be coded, required by the interface, to compare FIU Course Name ?
    @Override
    public int compareTo(Object anObject)
    {
        Course aCourse;
        if (anObject instanceof Course) 
        {
            aCourse = (Course)anObject;
            return this.FIUCourseName.compareToIgnoreCase(aCourse.FIUCourseName);
        }
        else
        {
            return 1;
                    
        }
    }
            
    
    
    
    
    
    
}
