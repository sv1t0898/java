package oop.homework.homework3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.size() > o2.size()) {return 1;}
        else if (o1.size() < o2.size()) {return -1;}
        else {return 0;}
    }
}
