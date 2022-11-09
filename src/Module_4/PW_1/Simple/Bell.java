package Module_4.PW_1.Simple;

public class Bell {
    Boolean call = true;

    void sound() {
        if (call) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        call = !call;
    }
}
