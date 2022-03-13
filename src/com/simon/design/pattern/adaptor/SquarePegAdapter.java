package com.simon.design.pattern.adaptor;

import com.simon.design.pattern.adaptor.round.RoundPeg;
import com.simon.design.pattern.adaptor.square.SquarePeg;

// square peg to round hole
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg
        result = Math.sqrt(Math.pow(peg.getWidth()/2, 2) * 2);
        return result;
    }
}
