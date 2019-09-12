package dat159.fowler;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
    
    public String showFigures(String result, double thisAmount) {
		result += "\t" + this.getMovie().getTitle()+ "\t" +
		        String.valueOf(thisAmount) + "\n";
		return result;
	}

	int addBonus(int frequentRenterPoints, Customer customer) {
		// add bonus for a two day new release rental
		if ((getMovie().isNewRelease()) && getDaysRented() > 1)
			frequentRenterPoints = customer.addFrequentRenterPoints(frequentRenterPoints);
		return frequentRenterPoints;
	}

	double determineAmount(double thisAmount) {
		// determine amount for each line
		thisAmount = getMovie().modifyAmount(thisAmount, getDaysRented());
		
		return thisAmount;
	}
}
