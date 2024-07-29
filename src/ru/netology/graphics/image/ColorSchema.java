package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {
    private static final char[] SYMBOLS = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
    private static final int MAX_COLOR = 255;

    @Override
    public char convert(int color) {
        return SYMBOLS[color / (MAX_COLOR / (SYMBOLS.length - 1))];
    }
}
