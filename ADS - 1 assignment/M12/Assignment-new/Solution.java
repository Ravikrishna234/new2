import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for student.
 */
class student {
    /**
     * variable.
     */
    private String name;
    /**
     * variable.
     */
    private String dob;
    /**
     * variable.
     */
    private int subject1;
    /**
     * variable.
     */
    private int subject2;
    /**
     * variable.
     */
    private int subject3;
    /**
     * variable.
     */
    private int total;
    /**
     * variable.
     */
    private String category;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      d     { parameter_description }
     * @param      s1    The s 1
     * @param      s2    The s 2
     * @param      s3    The s 3
     * @param      t     { parameter_description }
     * @param      rc    The rectangle
     */
    student(String name,  String dob,  int sub1,
     int sub2,  int sub3,  int total, String rc) {
        this.name = name;
        this.dob = dob;
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.total = total;
        this.category = rc;
    }
    /**
     * get name.
     *
     *time complexity is O(1)
     * @return value
     */
    public String getname() {
        return this.name;
    }
    /**
     * get dob.
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * get s1.
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public int getsubject1() {
        return this.subject1;
    }
    /**
     * get s2.
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public int getsubject2() {
        return this.subject2;
    }
    /**
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public int getsubject3() {
        return this.subject3;
    }
    /**
     *time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    int gettotal() {
        return this.total;
    }
    /**
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    String getcategory() {
        return this.category;
    }
    /**
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    int getage() {
        int age = 0;
        final int year = 2018, days = 365, month = 30, ten = 10;
        String[] token = this.getdob().split("-");
        age += (year - Integer.parseInt(token[2])) * days;
        age += (ten - Integer.parseInt(token[1])) * month;
        age += Integer.parseInt(token[0]);

        return age;
    }
    /**
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final student that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        } else if (this.gettotal() < that.gettotal()) {
            return -1;
        } else {
            if (this.getsubject3() > that.getsubject3()) {
                return 1;
            } else if (this.getsubject3() < that.getsubject3()) {
                return -1;
            } else {
                if (this.getsubject2() > that.getsubject2()) {
                    return 1;
                } else if (this.getsubject2() < that.getsubject2()) {
                    return -1;
                } else {
                    if (this.getage() < that.getage()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        }

    }
    /**
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    String print() {
        return this.getname() + "," + this.gettotal() + ","
        + this.getcategory();
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        ///function.
    }
    /**
     * contains.
     *
     * @param      arr   The arr
     * @param      val   The value
     * time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    static boolean contains(final int[] arr, final int val) {
        for (int n : arr) {
            if (val == n) {
                return true;
            }
        }
        return false;
    }
    /**
     * sorts.
     *
     *  time complexity is O(N^2)
     */
    static student[] selectionsort(final student[] students, final int n) {
        for (int  i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].compareTo(students[min]) > -1) {
                    min = j;
                }
            }
            student temp = students[i];
            students[i] = students[min];
            students[min] = temp;
        }
        return students;
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int open = Integer.parseInt(scan.nextLine());
        int bc = Integer.parseInt(scan.nextLine());
        int sc = Integer.parseInt(scan.nextLine());
        int st = Integer.parseInt(scan.nextLine());
        student[] students = new student[n];
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(",");
            students[i] = new student(input[0], input[1],
                 Integer.parseInt(input[2]),
                Integer.parseInt(input[2 + 1]),
                Integer.parseInt(input[2 + 2]),
                Integer.parseInt(input[2 + 2 + 1]), input[2 + 2 + 2]);
        }
        students = selectionsort(students, n);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].print());
        }
        System.out.println();
        for (int j = 0; j < open; j++) {
            System.out.println(students[j].print());
        }
        int[] values = new int[bc + sc + st];
        int i = 0;
        for (int k = open; k < n; k++) {
            if (students[k].getcategory().equals("BC") && bc > 0) {
                values[i++] = k;
                bc--;
            } else if (students[k].getcategory().
                equals("SC") && sc > 0) {
                values[i++] = k;
                sc--;
            } else if (students[k].getcategory().
                equals("ST") && st > 0) {
                values[i++] = k;
                st--;
            }
        }
        if (bc > 0) {
            for (int k = open; k < n; k++) {
            if (students[k].getcategory().equals("Open") && bc > 0) {
                    if (!contains(values, k)) {
                        values[i++] = k;
                        bc--;
                    }
                }
            }
        }
        // if (sc > 0) {
        //     for (int k = open; k < n; k++) {
        //     if (students[k].getcategory().equals("Open") && sc > 0) {
        //             if (!contains(values, k)) {
        //                 values[i++] = k;
        //                 sc--;
        //             }
        //         }
        //     }
        // }
        // if (st > 0) {
        //     for (int k = open; k < n; k++) {
        //     if (students[k].getcategory().equals("Open") && st > 0) {
        //             if (!contains(values, k)) {
        //                 values[i++] = k;
        //                 st--;
        //             }
        //         }
        //     }
        // }
        Arrays.sort(values);
        for (int k = 0; k < values.length; k++) {
            System.out.println(students[values[k]].print());
        }
    }
}