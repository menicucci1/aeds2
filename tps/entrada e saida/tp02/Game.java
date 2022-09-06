public class Game {
    private int app_id, age, dlcs, avg_pt;
    private String name, release_date, owners, developers;
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

    public int getAppId(){
        return this.app_id;
    }

    public void setAppId(int app_id){
        this.app_id = app_id;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAvgPt(){
        return this.avg_pt;
    }

    public void setAvgPt(int avg_pt){
        this.avg_pt = avg_pt;
    }

    public int getDlcs(){
        return this.dlcs;
    }

    public void setDlcs(int dlcs){
        this.dlcs = dlcs;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getReleaseDate(){
        return this.release_date;
    }

    public void setReleaseDate(String release_date){
        this.release_date = release_date;
    }

    public String getOwners(){
        return this.owners;
    }

    public void setOwners(String owners){
        this.owners = owners;
    }

    public String getDevelopers(){
        return this.developers;
    }

    public void setDevelopers(String developers){
        this.developers = developers;
    }

    public boolean getWindows(){
        return this.windows;
    }

    public void setWindows(boolean windows){
        this.windows = windows;
    }

    public boolean getLinux(){
        return this.linux;
    }

    public void setLinux(boolean linux){
        this.linux = linux;
    }
    public boolean getMac(){
        return this.mac;
    }

    public void setMac(boolean mac){
        this.mac = mac;
    }
    
    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getUpvotes(){
        return this.upvotes;
    }

    public void setUpvotes(float upvotes){
        this.upvotes = upvotes;
    }

    public String[] getLanguages(){
        return this.languages;
    }
    
    public void setLanguages(String[] languages){
        this.languages = languages;
    }

    public String[] getGenres(){
        return this.genres;
    }
    
    public void setGenres(String[] genres){
        this.genres = genres;
    }
    
    

}
