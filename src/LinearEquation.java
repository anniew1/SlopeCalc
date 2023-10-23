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

    private double distance() {
        return round(Math.sqrt(Math.pow((x2-x1), 2.0) + (Math.pow((y2-y1), 2.0))));
    }

    private double slope() {
        if (y2-y1 == 0){
            return 0;
        }
        return round(((double)y2-y1)/(x2-x1));
    }

    private double yIntercept() {
        return round(y1 - slope() * x1);
    }

    private String equation() {
        String slope = (y2-y1) + "/" + (x2-x1);
        if (y2-y1 == 0){
            return "y = " + yIntercept();
        } else if (x2-x1 == 0){
            return "y = undefined";
        } else
            if (yIntercept() > 0){
                return "y = " + slope + "x + " + yIntercept();
            } else if (yIntercept() == 0){
                return "y = " + slope + "x";
            } else {
                return "y = " + slope + "x" + yIntercept();
            }
    }

    public String coordinateForX(double x) {
        if (x2 - x1 == 0 && x != x1){
            return "Point not on line";
        }
        return ("(" + x + ", " + (x * slope() + yIntercept()) + ")");
    }

    public String lineInfo() {
        String info = "";
        info += "The two points are: " + "(" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these points is " + equation();

        if (x2- x1 == 0){
            info += "\nThe slope of this line is: undefined";
            info += "\nThe y-intercept of this line is: undefined";
        } else {
            info += "\nThe slope of this line is: " + slope();
            info += "\nThe y-intercept of this line is: " + yIntercept();
        }

        info += "\nThe distance between the two points is: " + distance();
        return info;
    }

    private double round(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}
