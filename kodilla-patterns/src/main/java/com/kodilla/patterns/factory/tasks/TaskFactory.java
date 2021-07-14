package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task doTask(final String typeOfTask){
        switch (typeOfTask){
            case DRIVING:
                return new DrivingTask(DRIVING, "In krakow ", "something");
            case PAINTING:
                return new PaintingTask(PAINTING, "Red ", "window ");
            case SHOPPING:
                return new ShoppingTask(SHOPPING, "Car ", 3);
            default:
                return null;
        }
    }
}
