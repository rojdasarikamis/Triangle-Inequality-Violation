package edu.bim313;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private String aCity;
    private String bCity;
    private String cCity;

    public Triangle(int  a, int b, int c, String aCity, String bCity, String cCity)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.aCity = aCity;
        this.bCity = bCity;
        this.cCity = cCity;

    }

    public boolean isCorrect()
    {
        if(a + b > c && a + c > b && b + c > a)
            return true;

        return false;
    }

    public String toString()
    {
        return aCity + " " + bCity + " " + cCity;
    }
}
