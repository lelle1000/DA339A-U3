package model;

public class Motorcycles extends Items {
    
    private MCTypes type;
    private Colors color1;
    private Colors color2;
    private int engineSizeInCC;

    public Motorcycles(String productName, int engineSizeInCC, MCTypes type, Colors color1, Colors color2) {
        super(productName, 0);
        setType(type);
        setColors(color1, color2);
        setEngineSizeInCC(engineSizeInCC);
        setPrice(calculatePrice());
    }

    public MCTypes getType() {
        return type;
    }

    public void setType(MCTypes type) {
        this.type = (type == null) ? MCTypes.normal : type;
    }

    public Colors getColor1() {
        return color1;
    }

    public Colors getColor2() {
        return color2;
    }

    public void setColors (Colors color1, Colors color2) {
        this.color1 = (color1 == null) ? Colors.uncolored : color1;
        this.color2 = (color2 == null) ? Colors.uncolored : color2;
    }

    public int getEngineSizeInCC() {
        return engineSizeInCC;
    }

    public void setEngineSizeInCC(int engineSizeInCC) {
        this.engineSizeInCC = (engineSizeInCC < 0) ? 0 : engineSizeInCC;
    }

    @Override
    public double calculatePrice() {
        int color1PriceDifference = colorCost(color1);
        int color2PriceDifference = colorCost(color2);
        int typeCost = 0;
        int enginePricePerCC = 30;

        if(getType() != null) {
            switch (getType() ) {
            case Naked:
                typeCost = 75000;
                break;
            case Cruiser:
                typeCost = 120000;
                break;
            case Sporting:
                typeCost = 80000;
                break;
            case Touring:
                typeCost = 150000;
                break;
            default:
                typeCost = 50000;
            }
        }

        return (double) color1PriceDifference + color2PriceDifference + typeCost + (enginePricePerCC * getEngineSizeInCC());
    };

    private int colorCost(Colors color) {
        if (color == null) {
            return 0;
        }

        switch (color) {
            case black:
                return 3000;
            case white:
                return 2500;
            case green:
                return 2000;
            case pink:
                return 1500;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        String name = getProductName();
        int cc = getEngineSizeInCC();
        MCTypes type = getType();
        Colors color1 = getColor1();
        Colors color2 = getColor2();
        double price = calculatePrice();

        return name + ", storlek: " + cc + "cc, " + "typ:" + type + ", " + color1 + ", " + color2 + ", " + "Pris: " + price; 
    }


}