package com.denniseckerskorn.engine;

public interface Updateable {
    void update(double deltaTime);
    void lastUpdate(double deltaTime);
    void postUpdate(double deltaTime);
}


