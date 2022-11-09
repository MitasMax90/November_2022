package Module_4.PW_1.Simple;

public class Payer {
    String surname, name, adress, cardNumber;

    public Payer(String surname, String name, String adress, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Payer{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
