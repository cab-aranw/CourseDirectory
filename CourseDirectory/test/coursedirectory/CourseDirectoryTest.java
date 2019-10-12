/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author w_ara
 */
public class CourseDirectoryTest 
{
    
    CourseDirectory myCd = new CourseDirectory();
    Course course1;
    Course course2;
    Course course3;
    ArrayList <Course> preRequisites ; 
    public CourseDirectoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CourseDirectory.
     */
    @Test
    public void testMain() 
    {
        System.out.println("main");
        String[] args = null;
//        CourseDirectory.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        
        
        myCd.acourse = new ArrayList<Course>();
        course1 = new Course("CHM4080", "AAA1520", 4, 3, new ArrayList<String>(Arrays.asList("Chemistry 1025", "Physics I")));
        course2 = new Course("AOT3015", "OTA0101", 3, 4, new ArrayList<String>(Arrays.asList("Biology prep")));
        course3 = new Course("UAP4318", "CCE3103", 1, 3, new ArrayList<String>(Arrays.asList(" ")));
        myCd.acourse.add(course1);
        myCd.acourse.add(course2);
        myCd.acourse.add(course3);
        for (int i = 0; i < myCd.acourse.size(); i++) 
        {
            System.out.println(myCd.acourse.get(i).toString());
        }
    }
    /**
     * Test of createFIUCourses method, of class CourseDirectory.
     */
//    @Test
//    public void testCreateFIUCourses() {
//        System.out.println("createFIUCourses");
//        CourseDirectory instance = new CourseDirectory();
//        instance.createFIUCourses();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of displayMenu method, of class CourseDirectory.
     */
//    @Test
//    public void testDisplayMenu() {
//        System.out.println("displayMenu");
//        CourseDirectory instance = new CourseDirectory();
//        instance.displayMenu();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of menuOptions method, of class CourseDirectory.
     */
//    @Test
//    public void testMenuOptions() {
//        System.out.println("menuOptions");
//        int expResult = 0;
//        int result = CourseDirectory.menuOptions();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of validate method, of class CourseDirectory.
     */
//    @Test
//    public void testValidate() {
//        System.out.println("validate");
//        CourseDirectory instance = new CourseDirectory();
//        String expResult = "";
//        String result = instance.validate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of sortByFIUCourseName method, of class CourseDirectory.
     */
    @Test
    public void testSortByFIUCourseName() 
    {
//        System.out.println("sortByFIUCourseName");
//        CourseDirectory instance = new CourseDirectory();
//        instance.sortByFIUCourseName();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        System.out.println("*** Sorting by FLA course name ***");
        System.out.println(myCd);
        myCd.sortByFIUCourseName();// Sorting the ArrayList
        System.out.println("*****************");
        Course expectedResult = course2;
        //System.out.println(myCd.acourse.get(0));
        Course result = myCd.acourse.get(0);
        assertEquals(expectedResult, result);
    
    }
    
}
