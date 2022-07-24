import java.util.ArrayList;
public class ListPhoneBook implements PhoneBook {
ArrayList<Long> number = new ArrayList<>();
ArrayLisr<String> name = new ArrayList<>();

  public int size(){
        return number.size();
   }
    public void insert(String name, long number){
        this.number.add(number);
        this.name.add(name);
   }
    public long find(String name){
        for(int i = 0; i < this.name.size(); i++){
            if(this.name.get(i).equals(name)){
                return number.get(i);
            }
        }
        return -1;
    }
}


                                                                                                                                                                                                                                                                                                                                                                       
