package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    private final int degrees;

    Direction(int degrees) {
        this.degrees = validateDegrees(degrees);
    }

    private static int validateDegrees(int degrees) {
        if (degrees < 0) {
            degrees = (degrees + 360);
        } else {
            degrees = (degrees - (degrees - (degrees % 360)));
        }
        return degrees;
    }

    public static Direction ofDegrees(int degrees) {
        degrees = validateDegrees(degrees);
        for (Direction directionValue : Direction.values()) {
            if (directionValue.degrees == degrees) {
                return directionValue;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = validateDegrees(degrees);
        int difference, ordinal = 0;
        int closestDegrees = Integer.MAX_VALUE;
        for (Direction directionValue : Direction.values()) {
            difference = Math.abs(degrees - directionValue.degrees);
            if (difference < closestDegrees) {
                closestDegrees = difference;
                ordinal = directionValue.ordinal();
            }
        }
        return Direction.values()[ordinal];
    }

    public Direction opposite() {
        switch (this) {
            case N:
                return S;
            case NE:
                return SW;
            case E:
                return W;
            case SE:
                return NW;
            case S:
                return N;
            case SW:
                return NE;
            case W:
                return E;
            case NW:
                return SE;
            default:
                return null;
        }
    }

    public int differenceDegreesTo(Direction direction) {
        if (Math.max(this.degrees, direction.degrees) - Math.min(this.degrees, direction.degrees) > 180) {
            return validateDegrees(this.degrees - direction.degrees);
        } else {
            return Math.max(this.degrees, direction.degrees) - Math.min(this.degrees, direction.degrees);
        }
    }
}
