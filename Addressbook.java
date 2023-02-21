import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/* Create a class that represents contact information 
for a person. The class should store the person's name 
and their email address.

Create a second class that represents an address book 
(a collection of contact information for many people) 
that includes methods for adding new contact information 
and for searching the existing collection for a contacts 
email address when the name is specified.

The program should create instances of the classes 
and demonstrate the functionality. */


public class Addressbook {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) throws Exception {


        System.out.println("ADD");
        System.out.println("FIND");
        System.out.println("PRINT");
        System.out.println("QUIT");
        

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();

        Map<ArrayList<String>, ArrayList<String>> address = new HashMap<>();
        address.put(names, emails);
        

        askEmail(emails);
        askName(names);

        

        search(address, emails, null);
        

        

        Person person1 = new Person(names,emails);
        System.out.println(person1);


    }



static void menu (){
    
}





static void search (Map<ArrayList<String> , ArrayList<String>> address, ArrayList<String> names, String string){
    String b = "";
    System.out.println("What would you like to find? ");
        
    b = input.nextLine();

    for(Entry<ArrayList<String>, ArrayList<String>> entry  : address.entrySet()) {

        // if give value is equal to value from entry
        // print the corresponding key
        entry.getValue();
        System.out.println("The key for value " + entry + " is " + entry.getKey());
        break;
        
    }
        /* 
    String b = "";
    System.out.println("What would you like to find? ");
        
        b = input.nextLine();

    if (address.containsKey(b)){
        System.out.println(b+"="+address.getValue());
      }
  else{
    System.out.println("Not found in names");
  }
  if (address.containsValue(b)){
    System.out.println(b+"="+ address.getValue());
    
  }
    else{
    System.out.println("Not found in emails");
    }

*/
}

    




static ArrayList<String> askName (ArrayList<String> b){
    
    String a="";

    while (!(a.equals("END"))){
        
        System.out.println("Please enter a name: ");
        System.out.println("Type 'END' to exit");
        a = input.nextLine();

        if (!(a.equals("END"))) {
            b.add(a);

        }


}
return b;
}

static ArrayList<String> askEmail (ArrayList<String> b){
    
    String a="";

    while (!(a.equals("END"))){
        
        System.out.println("Please enter an email: ");
        System.out.println("Type 'END' to exit");
        a = input.nextLine();

        if (!(a.equals("END"))) {
            b.add(a);

        }


}
return b;
}

}
/* 
static ArrayList<String> ask (ArrayList<String> b, ArrayList<String> x){
    
    String a="";
    String c="";

    while (!(a.equals("END"))){

        System.out.println("Please enter a name: ");
        System.out.println("Please enter an email: ");
        a = input.nextLine();
        c = input.nextLine();
        System.out.println("Type 'END' to exit");
        if (!(a.equals("END"))) {

            b.add(a);
            x.add(c);
        }
}



}
}
*/

