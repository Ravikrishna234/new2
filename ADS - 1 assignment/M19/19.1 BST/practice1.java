import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(String id, String fname, String cgpa) {
		super();
		this.id = Integer.parseInt(id);
		this.fname = fname;
		this.cgpa = Double.parseDouble(cgpa);
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    public int compareTo(Student that) {
        if(this.getCgpa() > that.getCgpa()) {
            return 1;
        } else if(this.getCgpa() < that.getCgpa()) {
            return -1;
        } else {
            return 0;
        }
        }
    }
class std {
    Student[] student;
    int size;
    std() {
        student = new Student[20];
        size = 0;
    }
    public void addteam(Student s) {
        student[size++] = s;
    }
    public void selectionsort() {
        int loc;
        for(int i = 0; i < size - 1; i++) {
            loc = i;
            for(int j = i + 1; j < size; j++) {
                if((student[j].compareTo(student[loc])) >= 0) {
                    loc = j;
                }
            }
            exchange(student,i,loc);
        }
    }
    public void exchange(Student[] student,int i,int loc) {
    Student temp = student[loc];
    student[loc] = student[i];
    student[i] = temp;
            }
    public String toString() {
        String str = "";
        for(int i = 0;i < size - 1;i++) {
            str += student[i].getFname() + "\n";
        }
        return str += student[size - 1].getFname();
    }
}

//Complete the code
public class practice1
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		// List<Student> studentList = new ArrayList<Student>();
        std s = new std();
		while(testCases>0){
            String[] tokens = in.nextLine().split(" ");
			Student st = new Student(tokens[0],tokens[1],tokens[2]);
			// ArrayList.sort(st);
            s.addteam(st);
			testCases--;
		}
        s.selectionsort();
      	System.out.println(s);
	}
}