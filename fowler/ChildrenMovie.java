package dat159.fowler;

public class ChildrenMovie extends Movie {
	
	public ChildrenMovie(String title) {
        super(title);
    }
	
	@Override
	public double modifyAmount(double thisAmount, int daysRented) {
        thisAmount += 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
	}
	
	@Override
	public boolean isNewRelease() {
		return false;
	}
}
