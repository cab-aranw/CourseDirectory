/**
  Title:           CourseDirectory
  Semester:        COP3310 – Fall 2019
  @author          6208110
  Instructor:      C. Charters
  Due Date:        10/8/2019
  This program simulates a University course flowchart. It displays a menu with four
  options where the user can choose three different ways to sort the arraylist course.
  
 */
package coursedirectory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author william
 */
public class CourseDirectory 
{
    /**
     * 1.- Instance variables of the CourseDirectory object.
     */
    static Scanner keyboard = new Scanner (System.in);
    public ArrayList<Course> acourse;
    /**
     * 1.- The driver class CourseDirectory is instantiated.
     * 2.- Calls the method createFIUCourses.
     * 3.- Calls the method displayMenu.
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        CourseDirectory myDirectory = new CourseDirectory();
        myDirectory.createFIUCourses();
        myDirectory.displayMenu();
        
    }
    /**
     * 1- Instantiates an ArrayList of type Course.
     * 2.-Create a loop that will ask user if he/she wants to create another course - do while
     * 3.-Inside loop, ask for all the information for a course 
     * 4.-Create another loop inside the outer loop (nested loop) for prerequisites (while)
     * 5.-After the nested loop, create a Course object
     * 6.-Add Course object to arrayList of courses
     */
    public void createFIUCourses()
    {
        acourse = new ArrayList<Course>();
        String moreCoursesAns;
        String prerequisitesAns = " ";
        String continueAddingAns;
        String FIUCourseName;
        String FLACourseName;
        boolean flag=true;
        
        int yearLevel;
        int numCredits;
        ArrayList<String> prerequisites;
        do 
        {
            System.out.println("**** Enter the core courses for an IT major ****");
            System.out.println("What is the FIU course name ? :");
            FIUCourseName = keyboard.nextLine();
            System.out.println("What is the FLA course name : ?");
            FLACourseName = keyboard.nextLine();
            System.out.println("What is your year level ?");
            yearLevel = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("How many credits is this course ?:");
            numCredits = keyboard.nextInt();
            keyboard.nextLine();//Flash Scanner
            //System.out.println();
            System.out.println("Do you want to add  a prerequisite (Yes/No)?:");
            prerequisitesAns = validate();
            prerequisites = new ArrayList<>();
            while (prerequisitesAns.equalsIgnoreCase("YES")) 
            {
                System.out.println("What is the name of the prerequisite ? :");
                prerequisites.add(keyboard.nextLine());
                System.out.println("Do you want to add more prerequisites ?:");
                prerequisitesAns = validate();
            }
            Course course = new Course(FIUCourseName, FLACourseName, yearLevel, numCredits, prerequisites);
            acourse.add(course);
            System.out.println("Do you want to add another course (Yes/No)? :");
            continueAddingAns = validate();
            if (continueAddingAns.equalsIgnoreCase("no")) 
            {
                System.out.println("Thank you for using the CourseDirectory App ...");
                flag=true;
            }
            else
            {
                flag = false;
            }
            
        } while (!flag);
        
        
    }
    /**
     * 1.-Displays a menu with three options.
     * 2.-Captures the value entered by the user and stores it in a local variable.
     * 
     */
    public void displayMenu()
    {
        
        boolean endLoop = false;
        do 
        {
            try
            {
                int selection = menuOptions();
                switch (selection) {
                    case 1:
//                        Collections.sort(acourse);
//                        for (int i = 0; i < acourse.size(); i++) 
//                        {
//                            System.out.println(acourse.get(i).toString());
//                        }
                        sortByFIUCourseName();
                        endLoop =true;
                        break;
                    case 2 :
//                        Collections.sort(acourse,new ComparatorByFLACourseName());
//                        for (int i = 0; i < acourse.size(); i++) 
//                        {
//                            System.out.println(acourse.get(i).toString());
//                            
//                        }
                        sortByFLACourseName();
                        endLoop =true;
                        break;
                    case 3 :
//                        Collections.sort(acourse, new ComparatorByYear());
//                        for (int i = 0; i < acourse.size(); i++) 
//                        {
//                            System.out.println(acourse.get(i).toString());
//                        }
                        YearLevel();
                        endLoop = true;
                        break;
                    case 4 :
                        System.out.println("Good Bye...");
                        endLoop = true;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            catch(Exception e)
            {
                System.exit(0);
            }
        } while (!endLoop);
        
        
    }
    
//    public void sortByFiuCourse()
//    {
        // create yourfiu courses
//        CourseDirectory myCd = new CourseDirectory();
//        myCd.myArrayList = new ArrayList<Course>();
//        myCd.myArraylist.add (...);//add three courses
//        // Sort the Array first *** 
//        String expectedREsult = "...";
//        String result = 
        //
//    }   
//    
    /**
     * 1.-Create a loop that displays a menu of options.
     * 2.-Sort courses by FIU course name, using main sorting method.
     * 3.-Sort courses by FLA course name, using alternate sorting method.
     * 4.-Sort courses by year level, using another alternate sorting method.
     * 5.-Exit
     * 6.-Keep looping until the user enters option 4
     * @return 
     */
    public static int menuOptions()
    {
        int menuOption = 0;
        String numberString = "";
        boolean endLoop = false;
        do
        {
            System.out.println("Please make a selection :");
            System.out.println("\t 1. Sort courses by FIU course name, using main sorting method");
            System.out.println("\t 2. Sort courses by FLA course name, using alternate sorting method");
            System.out.println("\t 3. Sort courses by year level, using another alternate sorting method");
            System.out.println("\t 4. Exit");
            numberString = keyboard.next();
            System.out.println();
            try
            {
              menuOption = Integer.parseInt(numberString);
             
              if(menuOption >= 1 && menuOption <= 4)
              {
                endLoop = true;
              }
              else
              {
                throw new NumberFormatException();
              }
            }
            catch(Exception e)
            {
               System.out.println("Not a valid option");     
            }
        } while(endLoop == false);
       
        return menuOption;
        
    }
    /**
     * 1.- The user inputs the value of answer to be validate it.
     * 2.- compares if the value is in the correct range
     * 3.- if the value is not in range asks for a new value
     * @return answer's valid value
     */
    public String validate()
    {
        //System.out.println("Do you want to add more courses (Yes/No)?:");
        //String answer = keyboard.nextLine();
        String answer="";
        boolean flag= false;
        do 
        {
            answer = keyboard.nextLine();
            switch (answer.toLowerCase()) {
                case "yes":
                    flag = true;
                    break;
                case "no":
                    flag = true;
                    break;
                default:
                    System.out.println("Please type your answer again ...");;
            }
            
        } while (!flag);
        
        return answer;
        
    }
    public void sortByFIUCourseName()
    {
        Collections.sort(acourse);
        for (int i = 0; i < acourse.size(); i++) 
        {
            System.out.println(acourse.get(i).toString());
        }
        //System.out.println(acourse);
        
    }
    public void sortByFLACourseName()
    {
        Collections.sort(acourse, new ComparatorByFLACourseName());
        for (int i = 0; i < acourse.size(); i++) {
            System.out.println(acourse.get(i).toString());

        }

    }
    public void YearLevel()
    {
        Collections.sort(acourse, new ComparatorByYear());
        for (int i = 0; i < acourse.size(); i++) {
            System.out.println(acourse.get(i).toString());
        }

    }
    
}
