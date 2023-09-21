package prelim.exam;

import java.util.*;
import java.lang.*;

public class Polynomial<Term> {
    LinkedList<Term> terms = new LinkedList<>();

    public Polynomial() {
        terms = null;
    } // end of constructor

    public LinkedList<Term> getTerms() {
        return terms;
    }

    public void setTerms(LinkedList<Term> terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addTerm(Term newTerm) {
        terms.add(newTerm);
    } // end of addTerm method

    public double evaluate(double variableValue) {
    } // end of evaluate method

    public Polynomial<Term> add(Polynomial<Term> otherPolynomial) {
        Polynomial<Term> sum = null;


        return sum;
    }

    public Polynomial<Term> subtract(Polynomial<Term> otherPolynomial) {
        Polynomial<Term> difference = null;

        return difference;
    }

    public Polynomial<Term> multiply(Polynomial<Term> otherPolynomial) {
        Polynomial<Term> product = null;

        return product;
    }
}
