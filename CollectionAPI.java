
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//Iterable
//Collection--Interface
//List Interface, Queue Interface, Set Interface
// List-- ArrayList Class, LinkedList Class
// Queue-- DeQue Class
// Set-- HashSet Class LinkedHashset Class

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name) {
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }else{
            return -1;
        }
    }
    
}

public class CollectionAPI{
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(9);
        for (int n : nums){
            System.out.println(n);
        }

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(65);
        nums1.add(58);
        nums1.add(80);
        nums1.add(91);
        System.out.println(nums1.get(3));
        System.out.println(nums1.indexOf(1));

        Collections.sort(nums1);
        System.out.println(nums1);

        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(nums1,comp);
        System.out.println(nums1);
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(8);
        nums2.add(28);
        nums2.add(18);
        nums2.add(9);
        nums2.add(9);
        System.out.println(nums2);

        //ordered set
        Set<Integer> nums3 = new TreeSet<>();
        nums3.add(6);
        nums3.add(5);
        nums3.add(8);
        nums3.add(9);
        nums3.add(9);
        nums3.add(28);
        nums3.add(18);
        System.out.println(nums3);

        Iterator<Integer> iter=nums3.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //Map is itself an interfcae
        //HashMap class implementing Map
        Map<String,Integer> map= new HashMap<>();

        map.put("shirisha", 100);
        map.put("sandeep", 1900);
        map.put("sanjay", 180);
        map.put("srilatha", 900);
        map.put("srilatha", 980);
        System.out.println(map);
        System.out.println(map.get("shirisha"));
        System.out.println(map.keySet());
        for (String name:map.keySet()){
            System.out.println(name+":"+map.get(name));
        }

        //synchronized
        Map<String,Integer> map1= new Hashtable<>();
        map1.put("shirisha", 100);
        map1.put("sandeep", 1900);
        map1.put("sanjay", 180);
        map1.put("srilatha", 900);
        map1.put("srilatha", 980);
        System.out.println(map1);


        List<Student> students=new ArrayList<>();
        students.add(new Student(24,"shirisha"));
        students.add(new Student(22,"sandeep"));
        students.add(new Student(21,"sanjay"));
        students.add(new Student(44,"srilatha"));
        for(Student s:students){
            System.out.println(s.name+" "+s.age);
        }
        //comparator
        Comparator<Student> comp1=(Student o1, Student o2)-> {
                if(o1.age > o2.age){
                    return 1;
                }else{
                    return -1;
                }
        };
        Collections.sort(students,comp1);
        for(Student s:students){
            System.out.println(s.name+" "+s.age);
        }
        //using comparable interface implements
        Collections.sort(students);
    }
}