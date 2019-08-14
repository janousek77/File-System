package com.company;

import java.sql.Time;

public class inode {
    mode m;
    int uid, gid;
    Time aTime, cTime, mTime;
    int size;
    int blockCount;
    inode pointer;
}


class mode {
    int type;
    String accessMode = "rwxrwxrwx";

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }
}