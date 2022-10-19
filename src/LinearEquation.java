public class LinearEquation {
    //Instance Variables:
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double newX;

    //Constructors
    public LinearEquation(int x1, int y1, int x2, int y2, double newX)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.newX = newX;
    }

    public LinearEquation(double newX)
    {
        this.newX = newX;
    }

    //Methods
    public int calcDeltaX()     //calculates change of x
    {
        return x2 - x1;
    }

    public int calcDeltaY()     //calculates change of y
    {
        return y2-y1;
    }

    public double calcYInt()        //calculates y-intercept
    {
        return y1 - x1 * ((double)calcDeltaY() / calcDeltaX());
    }

    public String displaySIForm()       //formats the previous methods into Slope Intercept form
    {
        return "y = " + calcDeltaY() + "/" + calcDeltaX() + "x + " + (int)calcYInt();
    }

    public double calcDistance()        //calculates the distance between the two points
    {
        return Math.sqrt(Math.pow(calcDeltaX(), 2) + Math.pow(calcDeltaY(), 2));
    }

    public String toString()     //calls the previous methods and returns a string
    {
        String slope = String.valueOf((double)calcDeltaY()/calcDeltaX());
        String yInt = String.valueOf(calcYInt());
        String distance = String.format("%.2f", calcDistance());
        return "First Pair: " + "(" + x1 + "," + y1 + ")\n" + "Second Pair: " + "(" + x2 + "," + y2 + ")\n" + "Slope of line: " + slope
        + "\nY-intercept: " + yInt + "\nSlope intercept form: " + displaySIForm() + "\nDistance between points: " + distance + "\n";
    }

    public void findNewX(int num){
        newX = num;
    }

    public void calcY(double deltaY, double deltaX, double yInt)
    {
        double newY = (deltaY/deltaX) * newX + yInt;
        System.out.println("Solved coordinate point is: " + newY);
    }
}
