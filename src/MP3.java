public class MP3 extends Item {
    private int duration;

    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("MP3 Information:");
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: $" + price);
        System.out.println("Duration: " + duration + " minutes");
    }
}
