package model;

public class PokeApiUrl {
    private String url;
    public PokeApiUrl(){
        url = "";
    }
    public PokeApiUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
