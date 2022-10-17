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

    public void displayString()     //calls the previous methods and prints them
    {
        System.out.println("First Pair: " + "(" + x1 + "," + y1 + ")");
        System.out.println("Second Pair: " + "(" + x2 + "," + y2 + ")");
        System.out.println("Slope of line: " + (double)calcDeltaY()/calcDeltaX());
        System.out.println("Y-intercept: " + calcYInt());
        System.out.println("Slope intercept form: " + displaySIForm());
        System.out.printf("Distance between points: %.2f", calcDistance());
        System.out.println();
    }

    public void findNewX(int num){
        newX = num;
    }

    public void calcY(double deltaY, double deltaX)
    {
        double newY = (deltaY/deltaX) * newX + 1;
        System.out.println(newY);
    }
}
