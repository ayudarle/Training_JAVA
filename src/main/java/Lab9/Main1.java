package Lab9;

public class Main1 {
    public static void main(String[] args) {
//        Engineer e1 = new Engineer();
//        e1.working();
//        PM pm = new PM();
//        pm.working();

        Employee emp1 = new Engineer();
        Employee emp2 = new Engineer();
        Employee emp3 = new PM();

        Employee [] allStaffs = {emp1, emp2, emp3};

        for(Employee e: allStaffs)
            e.working();
    }

}
