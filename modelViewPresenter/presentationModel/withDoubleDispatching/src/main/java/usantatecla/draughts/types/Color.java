package usantatecla.draughts.types;

import usantatecla.utils.models.ClosedInterval;

public enum Color {

    WHITE(5, 7),
    BLACK(0, 2),
    NULL();

    static final ClosedInterval ORDINALS =  new ClosedInterval(0, Color.values().length - 1);
    
    private ClosedInterval LIMITS;

    private Color() {
    }

    private Color(int min, int max) {
        this.LIMITS = new ClosedInterval(min, max);
    }

    public static Color getInitialColor(Coordinate coordinate) {
        for(Color color : Color.getColors()){
            if (color.LIMITS.isIncluded(coordinate.getRow())){
                return color;
            }
        }
        return Color.NULL;
    }

    public char getInitial() {
        if (this.isNull()) {
            return ' ';
        }
        return this.name().toLowerCase().charAt(0);
    }

    public Color opposite() {
        assert !this.isNull();

        return Color.values()[(this.ordinal() + 1) % 2];
    }

    public boolean isNull() {
        return this == Color.NULL;
    }

    public static Color[] getColors() {
        return new Color[]{Color.WHITE, Color.BLACK};
    }

    public static Color get(int ordinal) {
        assert Color.ORDINALS.isIncluded(ordinal);

        return Color.values()[ordinal];
    }

}