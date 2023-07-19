package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        long longShot = translatePositionToLong(shot);
        this.shots = this.shots | longShot;
        return (this.ships | longShot) == this.ships;
    }

    public Long translatePositionToLong(String shot) {
        char[] positions = shot.toCharArray();
        long position = 128L;
        position = position >> (positions[0] - 65);
        position = position << (8 - Integer.parseInt(String.valueOf(positions[1]))) * 8;
        return position;
    }

    public String state() {
        StringBuilder stringMap = new StringBuilder();
        String stringBinaryShip = Long.toBinaryString(this.ships);
        String shipMapBitCorrection = stringBinaryShip.length()<64 ?
                "0".repeat(64-stringBinaryShip.length()):"";
        char[] binaryShipMap = (shipMapBitCorrection+ stringBinaryShip).toCharArray();
        String stringBinaryShot = Long.toBinaryString(this.shots);
        String shotMapBitCorrection = stringBinaryShot.length()<64 ?
                "0".repeat(64-stringBinaryShot.length()):"";
        char[] binaryShotMap = (shotMapBitCorrection+stringBinaryShot).toCharArray();

        for (int i = 0; i < binaryShipMap.length; i++) {
            if (i % 8 == 0 && i > 0) {
                stringMap.append('\n');
            }
            if (binaryShotMap[i] == '1'&& binaryShipMap[i] == '1') {
                stringMap.append('☒');
            } else if ( binaryShotMap[i] == '0' && binaryShipMap[i] == '1') {
                stringMap.append('☐');
            } else if (binaryShotMap[i] == '1'&& binaryShipMap[i] == '0') {
                stringMap.append('×');
            } else {
                stringMap.append('.');
            }
        }
        return stringMap.toString();
    }
}
