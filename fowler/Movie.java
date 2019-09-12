package dat159.fowler;

public abstract class Movie {
    private String _title;
    
    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }
        
    public abstract double modifyAmount(double amount, int daysRented);
    
    public abstract boolean isNewRelease();
}


