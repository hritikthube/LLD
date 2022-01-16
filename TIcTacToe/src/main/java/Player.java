public class Player {

    private static int id ;
    private String name;
    private int rating;
    public Player( String name) {
        id++;
        this.name = name;
    }
    public Player( String name,int rating) {
        id++;
        this.name = name;
        this.rating=rating;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
