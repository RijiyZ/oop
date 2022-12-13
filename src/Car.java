public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            brand = "default";
        }
        if (model == null) {
            model = "default";
        }
        if (productionCountry == null) {
            productionCountry = "default";
        }
        this.brand = brand;
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color == ""){
            color = "Белый";
        }
        if (color == null){
            color = "Белый";
        }
        this.color = color;
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "\nМарка: " + brand +
                "\nМодель: " + model +
                "\nОбъем двигателя в литрах: " + engineVolume +
                "\nЦвет кузова: " + color +
                "\nГод производства: " + productionYear +
                "\nСтрана сборки: " + productionCountry;
    }
}
