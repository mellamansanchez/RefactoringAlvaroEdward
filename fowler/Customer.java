package dat159.fowler;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = each.determineAmount(thisAmount);

            frequentRenterPoints = addFrequentRenterPoints(frequentRenterPoints);
            frequentRenterPoints = each.addBonus(frequentRenterPoints, this);

            result = each.showFigures(result, thisAmount);
            totalAmount += thisAmount;
        }
        result += addFooterLines(totalAmount, frequentRenterPoints);
        return result;
    }

	private String addFooterLines(double totalAmount, int frequentRenterPoints) {
		String result;
        result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
		return result;
	}

	int addFrequentRenterPoints(int frequentRenterPoints) {
		return frequentRenterPoints++;
	}

	public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }
}
