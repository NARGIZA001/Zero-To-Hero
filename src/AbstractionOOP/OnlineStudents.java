package AbstractionOOP;

public class OnlineStudents extends Student {

    @Override
    public void study() {
        System.out.println("Online student studies harder than campus students ");
    }

    @Override
    void attendClass() {
        System.out.println("They attend classes through webinar");

    }
}
