package oop2;

public class Parental {
    private String modelName;
    private int wheelsCount;

    public Parental(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }

}
