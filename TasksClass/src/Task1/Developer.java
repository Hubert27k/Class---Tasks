package Task1;

public class Developer {
    private String name;
    private String lastName;
    private String language;
    private double earnings;

    public Developer(String getName, String getLastName, String getLanguage, double getEarnings){
        name = getName;
        lastName = getLastName;
        language = getLanguage;
        earnings = getEarnings;

    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;

    }
    public String getLanguage(){
        return language;
    }
    public double getEarnings(){
        return earnings;
    }
}

