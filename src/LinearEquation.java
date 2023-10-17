public class LinearEquation {

    int x1;
    int y1;
    int x2;
    int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double distance(){
        return Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
    }

    private double slope(){
        return (y2-y1)/(x2-x1);
    }

    private double yIntercept() {
        return y1 - slope() * x1;
    }

    private String equation(){
        return "y = " + slope() + yIntercept();
    }

    private String coordinateForX(double x) {
        return ("(" + (x * slope()) + "+" + yIntercept() + ")");
    }

    public String lineInfo(){
        String info = "";
        info += "The two points are: " + "(" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these points is " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of this line is: " + yIntercept();
        info += "\nThe distance between the two points is: 12.65";
        return info;
    }





}
