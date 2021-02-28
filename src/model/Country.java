
package model;

public class Country {
    
    String code;
    String name;
    String Continent;
    String Region;
    float surfaceArea;
    int indepYear;
    int population;
    float LifeExpectancy;
    float gpn;
    float gpnOld;
    String localName;
    String governmentForm;
    String headOfState;
    int capital;
    String code2;

    public Country() {
    }

    public Country(String code, String name, String Continent, String Region, float surfaceArea, int indepYear, int population, float LifeExpectancy, float gpn, float gpnOld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.Continent = Continent;
        this.Region = Region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.LifeExpectancy = LifeExpectancy;
        this.gpn = gpn;
        this.gpnOld = gpnOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(float LifeExpectancy) {
        this.LifeExpectancy = LifeExpectancy;
    }

    public float getGpn() {
        return gpn;
    }

    public void setGpn(float gpn) {
        this.gpn = gpn;
    }

    public float getGpnOld() {
        return gpnOld;
    }

    public void setGpnOld(float gpnOld) {
        this.gpnOld = gpnOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }



    
}
