import java.time.LocalDate;

public class Game {
    private int app_id, age, dlcs, avg_pt;
    private LocalDate release_date;
    private String name, owners, developers;
    private boolean windows, linux, mac;
    private float price, upvotes;
    private String[] languages, genres; 

    public Game(){
        this.app_id = 0;
        this.age = 0;
        this.dlcs = 0;
        this.avg_pt = 0;
        this.name = "";
        this.release_date = ""; //Date()
        this.owners = "";
        this.developers = "";
        this.windows = false;
        this.linux = false;
        this.mac = false;
        this.price = 0.0;
        this.upvotes = 0.0;
        this.languages = "";
        this.genres = "";
    }

    public Game(int app_id, int age, int avg_pt, int dlcs, String name, String release_date, String owners, String website, String developers, float price, String[] languages, boolean windows, boolean mac, boolean linux, float upvotes, String[] genres){
        this.app_id = app_id;
        this.age = age;
        this.avg_pt = avg_pt;
        this.dlcs = dlcs;
        this.name = name;
        this.release_date = release_date;
        this.owners = owners;
        this.developers = developers;
        this.windows = windows;
        this.linux = linux;
        this.mac = mac;
        this.price = price;
        this.upvotes = upvotes;
        this.languages = languages;
        this.genres = genres;
    }

    
    
    

}
