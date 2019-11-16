package inteviewTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class programmarTeacher extends programmer {

    List<String>teacherLanguages=new ArrayList<String >();

    @Override

    public Collection<String> getAllLanguages (){

        return teacherLanguages;

    }

    @Override

    public void addLanguages (String language){
        teacherLanguages.add(language);
    }

    public boolean teach (programmer Programmer, String language ){

        for (String teacherL: teacherLanguages){
            if (teacherL == language){
                Programmer.addLanguages(language);
                return true;
            }
        }

        return false ;
    }


}
