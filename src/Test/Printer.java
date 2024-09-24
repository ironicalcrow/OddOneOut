package Test;
public class Printer {
    private int n;
    public Printer(int n) {
        this.n = n;
    }
    public String printt(int n) {
        if(n%2==0 && n%11!=0 && n%13!=0)
        {
            return "Even";
        }
        else if(n%2==0 && n%11==0 && n%13!=0)
        {
            return "EvenPrimeEleven";
        }
        else if(n%2!=0 && n%11==0)
        {
            return "PrimeEleven";
        }
        else if(n%13==0 && n%11!=0 && n%2!=0 )
        {
            return "LuckyThirteen";
        }
        else if(n%13==0 && n%11==0 && n%2==0)
        {
            return "EvenPrimeLucky";
        }
        else
        {
            return "OddOneOut";
        }

    }
}
