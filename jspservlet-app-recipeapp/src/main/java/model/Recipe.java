package model;

public class Recipe {
    private int id;
    private String name;
    private String url;
    private String description;

    public Recipe(int id, String name, String url, String description){
        super();
        this.id=id;
        this.name=name;
        this.url=url;
        this.description=description;
  
    }
    public Recipe(String name, String url, String description){
     
        this.name=name;
        this.url=url;
        this.description=description;
  
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public String getUrl(){
        return url;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
