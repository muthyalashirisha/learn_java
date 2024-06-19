
//array in java is an object
//size is fixed
//search needs o(n)
//same type of data
class Student{
    int rollno;
    String name;
    int marks;
}
public class Array {
    public static void main(Strings[] args) {
        int num[]={1,2};
        int num1[]=new int[4];
        int nums2[][]=new int[3][4];
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                nums2[i][j]=(int)(Math.random()*100);
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println(nums2[i][j]);
            }
        }
        for (int arr[]:nums2){
            for (int val:arr){
                System.out.println(val);
            }
        }

        int jaggedArray[][]=new int[3][];
        jaggedArray[0]=new int[2];
        jaggedArray[1]=new int[4];
        jaggedArray[2]=new int[3];
        for (int i=0;i<jaggedArray.length;i++){
            for (int j=0;j<jaggedArray[i].length;j++){
                jaggedArray[i][j]=(int)(Math.random()*100);
                System.out.println(jaggedArray[i][j]);
            }
        }
        for (int arr[]:jaggedArray){
            for (int val:arr){
                System.out.println(val);
            }
        }

        //3 dimensional
        int arr[][][]=new int[3][4][5];

        //array of objects
        Student s1 = new Student();
        s1.marks = 2;
        s1.name = "Shirisha";
        s1.rollno = 1;

        Student s2 = new Student();
        s2.marks = 2;
        s2.name = "Shirisha";
        s2.rollno = 1;

        Student s3 = new Student();
        s3.marks = 2;
        s3.name = "Shirisha";
        s3.rollno = 1;
        //it doesnot create 3 different objects its just array of students
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }


        //for each loop for array and array type of data (collections)
        //enhanced for loop
        for (Student student:students){
            System.out.println(student.name);
        }
    }
}
