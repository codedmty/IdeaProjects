package com.eddie;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
