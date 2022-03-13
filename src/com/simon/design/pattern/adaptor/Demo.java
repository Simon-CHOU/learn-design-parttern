package com.simon.design.pattern.adaptor;

import com.simon.design.pattern.adaptor.round.RoundHole;
import com.simon.design.pattern.adaptor.round.RoundPeg;
import com.simon.design.pattern.adaptor.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if(hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
//        hole.fits(smallSqPeg);// won't compile.

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if( hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if(!hole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 doesn't fit into round hole r5");
        }
    }
}
