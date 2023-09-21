package prelim.exam;

public class Term implements Comparable<Term>{
    private double coefficient;
    private char literal;
    private int degree;

    public Term() {
        coefficient = 1;
        literal = 'x';
        degree = 0;
    }

    public Term(double coefficient, char literal, int degree) {
        this.coefficient = coefficient;
        this.literal = literal;
        this.degree = degree;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public char getLiteral() {
        return literal;
    }

    public void setLiteral(char literal) {
        this.literal = literal;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public int compareTo(Term other) {
        if (this.getDegree() > other.getDegree()) {
            return 1;
        } else if (this.getDegree() < other.getDegree()) {
            return -1;
        } else
            return 0;
    }

    public boolean equals(Term other) {
        return super.equals(other);
    }

    public String toString() {
        return coefficient + "" + literal + "^" + degree;
    }
}
