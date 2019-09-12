package dat159.fowler;

public class NewReleaseMovie extends Movie {
	
	public NewReleaseMovie(String title) {
        super(title);
    }
	
	@Override
	public double modifyAmount(double thisAmount, int daysRented) {
        thisAmount += daysRented * 3;
        return thisAmount;
	}
	
	@Override
	public boolean isNewRelease() {
		return true;
	}
}
