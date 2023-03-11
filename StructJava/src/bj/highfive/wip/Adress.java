package bj.highfive.wip;

public class Adress {
    private String Country, City;

    public Adress(String Country, String City)
    {
        this.Country=Country;
        this.City= City;
    }

    public String getCountry()
    {
        return this.Country;
    }
    public String getCity()
    {
        return this.City;
    }

    public void ShowAdress(){
        System.out.println("Je suis de nationalité "+this.Country+" et j'habite dans la ville de "+this.City);
    }
    public void presentation()
    {
        System.out.println("Mon pays est "+this.Country);
    }
    
}
