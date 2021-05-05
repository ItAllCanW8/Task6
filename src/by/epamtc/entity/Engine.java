package by.epamtc.entity;

import java.util.Objects;

public class Engine {
    String modelTitle;
    int thrust;

    public Engine(){}

    public Engine(String modelTitle, int thrust){
        this.modelTitle = modelTitle;
        this.thrust = thrust;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelTitle='" + modelTitle + '\'' +
                ", horsePower=" + thrust +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (thrust != engine.thrust) return false;
        return Objects.equals(modelTitle, engine.modelTitle);
    }

    @Override
    public int hashCode() {
        int result = modelTitle != null ? modelTitle.hashCode() : 0;
        result = 31 * result + thrust;
        return result;
    }
}
