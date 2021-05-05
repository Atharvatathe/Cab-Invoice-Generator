public class InvoiceSummery {
    private final int NumberOfRides;
    private  final double totalFare;
    private final double average;

    public InvoiceSummery(int NumberOfRides, double totalFare) {
        this.NumberOfRides = NumberOfRides;
        this.totalFare = totalFare;
        this.average = this.totalFare/this.NumberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummery that = (InvoiceSummery) o;
        return NumberOfRides == that.NumberOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.average, average) == 0;
    }

    public double getTotalFare(){
        return this.totalFare;
    }


}
