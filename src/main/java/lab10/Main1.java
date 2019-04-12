package lab10;

enum OSTYPE {
    Android(10), iOS(20), Windows(30);

    OSTYPE(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private int id;
}

class OSDetail {

    public OSDetail(OSTYPE type) {
        this.type = type;
    }

    private OSTYPE type;

    public void vendor() {
        switch (type) {
            case iOS:
                System.out.println("IPHONE " + type.getId());
                break;
            case Android:
                System.out.println("HTC " + type.getId());
                break;
            case Windows:
                System.out.println("Nokia " + type.getId());
                break;

        }
    }
}


public class Main1 {
    public static void main(String[] args) {
        OSDetail detail = new OSDetail(OSTYPE.iOS);
        detail.vendor();
    }

}
