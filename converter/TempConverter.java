package HW.converter;

public class TempConverter {

    public double convertToFahr(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public double convertToCelsius(double fahr){
        return (fahr - 32) * 5 / 9;
    }

}
