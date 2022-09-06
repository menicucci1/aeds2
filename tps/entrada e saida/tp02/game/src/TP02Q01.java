import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;



public class TP02Q01 {
    
    public static boolean isFim(String str) {
        return ((str.length() == 3) && (str.charAt(0) == 'F') && (str.charAt(1) == 'I')
                && (str.charAt(2) == 'M'));
    }

    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");
        Game games[] = new Game[30];
        int cont = 0;

        int idEntrada = MyIO.readInt();

        while(isFim(idEntrada) == false){
            Game newGame = new Game();
            newGame.readFile();
            games[cont] = newGame;
            cont++;
            entradaGame = MyIO.readLine(); 
        }

        for(int i = 0; i < cont; i++){
            games[i].print();
        }
    }
}

class Game {

    private int app_id, age, dlcs, avg_pt;
    private Date release_date;
    private String name, owners, developers, website;
    private boolean windows, linux, mac;
    private float price, upvotes;
    private String[] languages, genres;

    // constructors
    public Game() {
    }

    public Game(int app_id, int age, int dlcs, int avg_pt, Date release_date, String name, String owners,
            String developers, String website, boolean windows, boolean linux, boolean mac, float price, float upvotes,
            String[] languages, String[] genres) {
        this.app_id = app_id;
        this.age = age;
        this.dlcs = dlcs;
        this.avg_pt = avg_pt;
        this.release_date = release_date;
        this.name = name;
        this.owners = owners;
        this.developers = developers;
        this.website = website;
        this.windows = windows;
        this.linux = linux;
        this.mac = mac;
        this.price = price;
        this.upvotes = upvotes;
        this.languages = languages;
        this.genres = genres;
    }

    // getters
    public int getApp_id() {
        return app_id;
    }

    public int getAge() {
        return age;
    }

    public int getDlcs() {
        return dlcs;
    }

    public int getAvg_pt() {
        return avg_pt;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public String getName() {
        return name;
    }

    public String getOwners() {
        return owners;
    }

    public String getDevelopers() {
        return developers;
    }

    public float getPrice() {
        return price;
    }

    public float getUpvotes() {
        return upvotes;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getWebsite() {
        return website;
    }

    // setters
    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDlcs(int dlcs) {
        this.dlcs = dlcs;
    }

    public void setAvg_pt(int avg_pt) {
        this.avg_pt = avg_pt;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    public boolean isMac() {
        return mac;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setUpvotes(float upvotes) {
        this.upvotes = upvotes;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
    
    public Game clone(){
        Game cloned = new Game();
        cloned.app_id = this.app_id;
        cloned.name = this.name;
        cloned.release_date = this.release_date;
        cloned.owners = this.owners;
        cloned.age = this.age;
        cloned.price = this.price;
        cloned.dlcs = this.dlcs;
        cloned.languages = this.languages;
        cloned.website = this.website;
        cloned.windows = this.windows;
        cloned.mac = this.mac;
        cloned.linux = this.linux;
        cloned.upvotes = this.upvotes;
        cloned.avg_pt = this.avg_pt;
        cloned.developers = this.developers;
        cloned.genres = this.genres;
        
        return cloned;
    }

    // @Override
    // public String toString() {
    //     return "Game [age=" + age + ", app_id=" + app_id + ", avg_pt=" + avg_pt + ", developers=" + developers
    //             + ", dlcs=" + dlcs + ", genres=" + Arrays.toString(genres) + ", languages=" + Arrays.toString(languages)
    //             + ", linux=" + linux + ", mac=" + mac + ", name=" + name + ", owners=" + owners + ", price=" + price
    //             + ", release_date=" + release_date + ", upvotes=" + upvotes + ", website=" + website + ", windows="
    //             + windows + "]";
    // }

    public void print() {

        SimpleDateFormat df = new SimpleDateFormat("MMM/yyyy");
        System.out.print(this.getApp_id() + " " + this.getName() + " " + df.format(this.getRelease_date()) + " "
                + this.getOwners()
                + " " + this.getAge() + " " + this.getPrice() + " " + this.getDlcs() + " ");

        System.out.print("[");
        if (this.getLanguages() != null) {
            String[] pLanguages = this.getLanguages();

            for (int i = 0; i < pLanguages.length - 1; i++) {
                System.out.print(pLanguages[i] + ", ");
            }
            System.out.print(pLanguages[pLanguages.length - 1]);
        }
        System.out.print("] ");
        System.out.print(this.website + " " + this.isWindows() + " " + this.isMac() + " " + this.isLinux() + " "
                + this.getUpvotes() + " " + this.getAvg_pt() + " " + this.getDevelopers() + " ");

        System.out.print("[");
        if (this.getGenres() != null) {
            String[] pGenres = this.getGenres();

            for (int i = 0; i < pGenres.length - 1; i++) {
                System.out.print(pGenres[i] + ", ");
            }
            System.out.print(pGenres[pGenres.length - 1]);
        }
        System.out.print("]\n");

    }

    public void readFile() {
        String path = "C:\\Users\\User\\git\\aeds2\\tps\\entrada e saida\\tp02\\Game\\bin\\tmp\\games.csv";
        SimpleDateFormat df = new SimpleDateFormat("MMM/yyyy");
        	
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();
            while(linha != null){
                String[] vet = linha.split(",");
                int app_id = Integer.parseInt(vet[0]);
                String name = vet[1];
                String release_date = vet[2];
                String owners = vet[3];
                int age = Integer.parseInt(vet[4]);
                double price = Double.parseDouble(vet[5]);
                int dlcs = Integer.parseInt(vet[6]);
                // String[] languages = vet; 
                String website = vet[8];
                boolean windows = Boolean.parseBoolean(vet[9]);
                boolean mac = Boolean.parseBoolean(vet[10]);
                boolean linux = Boolean.parseBoolean(vet[11]);
                double upvotes = Double.parseDouble(vet[12]);
                int avg_pt = Integer.parseInt(vet[13]);
                String developers = vet[14];
                // String[] genres = vet;
                
                
                linha = br.readLine();
                System.out.println(br.readLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado");
        }
        catch (IOException e){
            System.out.println("Arquivo nao pode ser lido");
        }
            
    }
        
        
        
        
}

