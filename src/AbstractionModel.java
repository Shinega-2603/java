

abstract class AbstractionModel {
    String name;

    public AbstractionModel(String name) {
        this.name = name;
    }

    public void covidResult() {
        System.out.println("Your covid result is displayed");
    }

    abstract void CovidPositive();

    abstract void CovidNegative();
}

class CovidresultCalculation extends AbstractionModel {

    double temperature;

    public CovidresultCalculation(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public void CovidPositive() {

        if (temperature > 99) {
            System.out.println("Sorry,your result is positive");
        }
    }

    @Override
    void CovidNegative() {
        if (temperature <= 99) {
            System.out.println("your result is negative!!,your are safe now");
        }
    }

}

class Result {
    public static void main(String[] args) {
        AbstractionModel as = new CovidresultCalculation("CovidCenter", 98.5);
        as.covidResult();
        as.CovidPositive();
        as.CovidNegative();
    }
}
