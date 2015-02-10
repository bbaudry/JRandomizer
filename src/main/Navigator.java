package main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Navigator {
    private String url;
    private String name;
    private int version;

    public Navigator(String u, String n, int v) {
        url = u;
        name = n;
        version = v;
    }

    public Set<Object> getAttributes() {
        final Set<Object> properties = new HashSet<Object>();
        properties.add(url);
        properties.add(name);
        properties.add(version);
        return properties;
    }
}
