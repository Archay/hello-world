package quadratic;

public class Quadratic {

    int a;
    int b;
    int c;
    public double delta;
    public double del;

    public Quadratic(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        delta = ((Math.pow(b, 2)) - (4 * a * c));
        del = Math.sqrt(delta);
    }

    public double getDelta() {
        return delta;
    }

    public void setVal(int g, int h, int i) {
        a = g;
        b = h;
        c = i;
        delta = ((Math.pow(b, 2)) - (4 * a * c));
        del = Math.sqrt(delta);
    }

    public String solve() {
        String ret;
        if (delta == 0) {
            ret = ("Double root" + (-b / (2 * a)));
        } else if (delta > 0) {
            ret = ("2 unique roots " + ((-b + del) / (2 * a)) + "and " + ((-b - del) / (2 * a)));
        } else {
            ret = ("No real roots exist");
        }
        return ret;
    }
}
