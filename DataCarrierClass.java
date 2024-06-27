
//     private final int id;
//     private final String name;

    // public Alien(int id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }

    // public int getId() {
    //     return id;
    // }

    // public String getName() {
    //     return name;
    // }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("Alien{");
    //     sb.append("id=").append(id);
    //     sb.append(", name=").append(name);
    //     sb.append('}');
    //     return sb.toString();
    // }

    // @Override
    // public int hashCode() {
    //     int hash = 7;
    //     hash = 41 * hash + this.id;
    //     hash = 41 * hash + Objects.hashCode(this.name);
    //     return hash;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null) {
    //         return false;
    //     }
    //     if (getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     final Alien other = (Alien) obj;
    //     if (this.id != other.id) {
    //         return false;
    //     }
    //     return Objects.equals(this.name, other.name);
    // }
// }

//record class above code equals below one line of code
//all variables are private and final
// cannot extend any class
//can extend record class
//cannot create instance variable 
//but static varables can be created
//methods,static mehtod can be defined
record Alien(int id,String name){
    //canonical constructor
    // public Alien(int id,String name){
    //     if(id==0)
    //         throw new IllegalArgumentException("cannot be 0");
    //     this.id=id;
    //     this.name=name;
    // }
    //non-canonical
    public Alien{
        if(id==0)
            throw new IllegalArgumentException("cannot be 0");
    }
}

public class DataCarrierClass {
    public static void main(String[] args) {
        Alien a1=new Alien(1, "shirisha");
        Alien a2=new Alien(1, "shirisha");
        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
    }
}
