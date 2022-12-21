package generators;

import passangers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PassangersGen {
    public static List<Person> generate(int howMany){
        Random random = new Random();
        List<Person> ListOfPeople = new ArrayList<>();
        for(int i=0;i<howMany;i++){
            if(random.nextDouble()<=0.1){
               ListOfPeople.add(new VIPPassanger(null,0));
            }
            else if(random.nextDouble()<=0.3){
                ListOfPeople.add(new BusinessPassanger(null,0));
            }
            else ListOfPeople.add(new Passanger(null,0));
        }
        return ListOfPeople;
    }


}
