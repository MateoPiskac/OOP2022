package hr.fer.oop.labos.Drugi;

import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
    Set<String> extensionFilter= new HashSet<>();

    public JavaProjectFileVisitor(Set<String> extensionFilter){
        super();
        this.extensionFilter=extensionFilter;
    }
    public Map<String, Set<Path>> getProjectPathsPerExtension(){

    }

    private Double min = Collections.min(map.values());
    map.getkey(min);


}
