package oop.homework.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamService implements Iterable<Stream>{

    List<Stream> streams;

    public StreamService(){
        streams = new ArrayList<Stream>();
    }
    public StreamService(ArrayList<Stream> streams){
        this.streams = streams;
    }

    public void addStream(Stream stream){
        streams.add(stream);
    }
    public void sortStreams(){
        Collections.sort(streams, new StreamComparator());

    }

    @Override
    public Iterator<Stream> iterator() {
        return streams.iterator();
    }
}
