package web.models;

public class Car {
    private String title;
    private String color;
    private int maxSpeedValue;

    public Car(String title, String color, int maxSpeedValue) {
        this.title = title;
        this.color = color;
        this.maxSpeedValue = maxSpeedValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeedValue() {
        return maxSpeedValue;
    }

    public void setMaxSpeedValue(int maxSpeedValue) {
        this.maxSpeedValue = maxSpeedValue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeedValue=" + maxSpeedValue +
                '}';
    }
}
