package dat159.fowler;

public class RegularMovie extends Movie {
	
	public RegularMovie(String title) {
        super(title);
    }
	
	@Override
	public double modifyAmount(double thisAmount, int daysRented) {
		thisAmount += 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
	}
	
	@Override
	public boolean isNewRelease() {
		return false;
	}
}
