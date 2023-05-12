package com.likelion.javaproject2.week4.day5;

import java.io.IOException;
import java.util.List;

public interface LineReader {
    List<String> getLines(String filename) throws IOException;
}
