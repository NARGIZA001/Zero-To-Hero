package StaticPractice;

public class CatTest {

    public static void main(String[] args) {

        Cat dodo=new Cat();
        Cat prences=new Cat ();

        System.out.println(dodo.kitKab);
        System.out.println(prences.kitKab);
        System.out.println(Cat.meoMix);
        Cat.eatMix(2); // we call static with class name Cat.and then methon ....
        Cat.eatMix(3);
        Cat.eatMix(0);

        dodo.eatKit(6); // 2 left portion
        prences.eatKit(5); // 3 left  portion ,it is not static  that's why each object get their share ....
        // 8 was total so 8 portions for each object for DODO AND PRINCES
        prences.eatMix(2);




    }
}
