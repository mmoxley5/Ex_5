import java.util.ArrayList;

public class Person {
   private ArrayList<String> name;
   private ArrayList<String> email;
   public Person(ArrayList<String> name, ArrayList<String> email) {
      this.name = name;
      this.email = email;
   }
   public ArrayList<String> getName() {
      return name;
   }
   public void setName(ArrayList<String> name) {
      this.name = name;
   }
   public ArrayList<String> getEmail() {
      return email;
   }
   public void setEmail(ArrayList<String> email) {
      this.email = email;
   }
   @Override
   public String toString() {
      return "Person [name=" + name + ", email=" + email + "]";
   }
}