package bj.highfive.wip;

public class Person
 {
    String fname;
    String lname;
    int    age;
    Adress adress;

    public Person(String fname,
    String lname,
    int    age, 
    Adress adress)
    {
        this.fname=fname;
        this.lname= lname;
        this.age=age;
        this.adress=adress;
    }


    final public void present()
    {
        System.out.println("Je suis "+this.fname+" "+this.lname+" et j'ai "+this.age+" ans.");
        this.adress.ShowAdress();

    }

    public static void main (String[] Args)
    {
            Adress obj1 = new Adress("Beninoise","Cotonou");
            

            Person obj2= new Person("AHO", "Emile", 10, obj1);

            obj2.present();
            obj1.presentation();
            

    }
    
}
