package inteviewTask;

import java.util.Collection;
import java.util.List;


public class programmer {

    List<String> Languages;

    public Collection<String> getAllLanguages (){

        return Languages;

    }

    public void addLanguages (String language){

        Languages.add(language);
    }


}
