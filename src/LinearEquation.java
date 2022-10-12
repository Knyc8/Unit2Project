public class LinearEquation {
    //Instance Variables:
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double newX;

    //Constructors
    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this. y2 = y2;
    }

    public LinearEquation(double newX)
    {
        this.newX = newX;
    }

    //Methods
    public int calcDeltaX()
    {
        return x2 - x1;
    }

    public int calcDeltaY()
    {
        return y2-y1;
    }

    public double calcYInt()
    {
        return y1 - x1 * ((double)calcDeltaY() / calcDeltaX());
    }

    public String displaySIForm()
    {
        return "y = " + calcDeltaY() + "/" + calcDeltaX() + "x + " + (int)calcYInt();
    }

    public double calcDistance()
    {
        return Math.sqrt(Math.pow(calcDeltaX(), 2) + Math.pow(calcDeltaY(), 2));
    }

    public void displayString()
    {
        System.out.println("First Pair: " + "(" + x1 + "," + y1 + ",");
        sout
    }
}
