package net.juude.rxdemos.data;

/**
 * Created by juude on 16/6/27.
 */
public class QuoteItem {
    public String quote;
    public String author;

    @Override
    public String toString() {
        return "quote: " + quote + "\nauthor" + author;
    }
}
