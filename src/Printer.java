public class Printer {
    private int n;
    public Printer(int n) {
        this.n = n;
    }
    public void print(int n) {
        if(n%2==0 && n%11!=0 && n%13!=0)
        {
            System.out.println("Even");
        }
        else if(n%2==0 && n%11==0)
        {
            System.out.println("EvenPrimeEleven");
        }
        else if(n%2!=0 && n%11==0)
        {
            System.out.println("PrimeEleven");
        }
        else if(n%13==0 )
        {
            System.out.println("LuckyThirteen");
        }
        else if(n%13==0 && n%11==0 && n%2==0)
        {
            System.out.println("EvenPrimeLucky");
        }
        else
        {
            System.out.println("OddOneOut");
        }

    }
}
