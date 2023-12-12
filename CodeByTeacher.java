import java.util.Arrays;
import java.util.StringJoiner;

public class CodeByTeacher implements Comparable<CodeByTeacher> {

    private final int id;
    private String name;
    private double allowance;
    private static CodeByTeacher[] all;
    private static int count;

    public static CodeByTeacher remove(int id) {
        for (int i = 0; i < count; i++) {
            if (all[i].id == id) {
                var temp = all[i];
                all[i] = all[--count];
                all[count] = null;
                return temp;
            }
        }
        return null;
    }

    public static void sort() {
        Arrays.sort(all, 0, count);
    }

    public static String listAll() {
        var s = new StringJoiner("; ");
        for (int i = 0; i < count; i++) {
            s.add(all[i].toString());
        }
        return s.toString();
    }

    public static double averageAllowance() {
        if (count == 0) {
            return -1.0;
        }
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += all[i].allowance;
        }
        return sum / count;
    }

    public CodeByTeacher(int id, String name, double allowance) {
        if (id < 0 || name == null || allowance <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < count; i++) {
            if (all[i].id == id) {
                throw new IllegalArgumentException();
            }
        }
        this.id = id;
        this.name = name;
        this.allowance = allowance;
        if (all == null) {
            all = new CodeByTeacher[2];
        } else if (all.length == count) {
            all = Arrays.copyOf(all, all.length << 1);
        }
        all[count++] = this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return String.format("CodeByTeacher(%d,'%s',%f)", id, name, allowance);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && this.id == ((CodeByTeacher) obj).id;
    }

    @Override
    public int compareTo(CodeByTeacher o) {
        return id - o.id;
    }

}


//Poom is Change Student to CodeByTeacher
/*1) create a public class "Student" in package "school" having 3 private non-static fields:    
"id" (int,final), "name" (String), "allowance" (double). 
1.1) create setters for all non-static fields except "id",      
and getters for all non-static fields.
1.2) @Override the "equals" and "hashCode" methods using only the "id" of Student.
1.3) @Override the "toString" method to return a String in this format:      
"Student(id,'name',allowance)".
1.4) implement Comparable<Student> for Student by comparing only the "id" of Student.
1.5) add 2 private static fields: "all" (of Student array type) to store      
all Students created and "count" (of int type) to count      
the number of Students stored in the array.
1.6) create a constructor that receives 3 parameters: "id", "name", "allowance"      
to initialize the 3 fields if a Student object can be created.      
A Student object can be created if "name" is not null,      
"allowance" is more than zero, "id" is not negative,      
and the "id" is not already in the Student array ("all").     
If a Student can be created, put it in the array "all" and increment the "count".    
Note that if "all" is null, create an array of size 2 first.     
If "all" is full, double its size.    
If a Student cannot be created, throws an IllegalArgumentException.
1.7) create a public static method named "averagaAllowance" that receives no argument and     
returns the average allowance of "all" Student.  
This method returns a negative value     
if "all" is null or there is no Student in "all".
1.8) create a public static method named "remove" that receives an int (named "id").     
This method removes the Student with id equals to "id" from "all" and return that Student.    
This method returns null if "all" is null or there is no Student with that id in the array.    
When removing a Student from the array, move that last element in the array to replace     
the Student that is removed and decrement the "count".
1.9) create a public static void method named "sort" to sort the array.
1.10) create a public static method named "listAll" to return a String containing       
all Students in "all" separated by "; ".*/