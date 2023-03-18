package singleton.exercises;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Create a singleton called Students. This singleton will store a list of students as String.
 * Implement the following functionality.
 * When adding a student to the list.
 * We should have a method to add a student to the list,
 * and this method returns a boolean
 *  (if the addition is successful, it returns true, else it returns false)
 *  In order to successfully add a student the students name must be prefixed with either senior or junior.
 *  Adding a duplicate name is not allowed.
 *  Add a method to retrieve all students with a prefix of senior
 *  Add a method to retrieve all students with a prefix of junior
 */
public class Students {
    public static void main(String[] args) {

    }
        //List<String> Students = Collections.singletonList("Students");

            private static Students instance;
            private static boolean isAdded = false;
            private static HashSet<String> studentList = new HashSet<String>();
            private static String prefix;

            private Students() {}

            public static boolean getStudentToList(String prefix){
                if( prefix.equals("junior") || prefix.equals("senior")){
                    isAdded = true;
                } else {
                    isAdded = false;
                }   return isAdded;
            }
            public boolean studentIsAddedToTheList(){
                return isAdded;
            }

            public static Students getInstance() {

                if (instance == null) {
                    synchronized (Students.class){
                        if(instance == null) {
                            instance = new Students();
                        }
                    }
                }
                return instance;
            }

            public static List<String> getSeniors(){
                if (prefix.equals("senior")) {
                    System.out.println(studentList);
                }
                return studentList.stream().toList();
            }
            public static List<String> getJuniors(){
                if (prefix.equals("junior")) {
                    System.out.println(studentList);
                }
                return studentList.stream().toList();
            }

        }
