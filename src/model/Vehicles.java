public class Vehicles extends Items {
    
    private MCTypes type;
    private Colors color1;
    private Colors color2;
    private int engineSizeInCC;

    public Vehicles(MCTypes type, String productName, double price, Colors color1, Colors color2, int engineSizeInCC) {
        super(productName, price);
        setType(type);
        setColors(color1, color2);
        setEngineSizeInCC(engineSizeInCC);
    }

    public MCTypes getType() {
        return type;
    }

    public void setType(MCTypes type) {
        this.type = (type == null) ? null : type;
    }

    public Colors getColor1() {
        return color2;
    }

    public Colors getColor2() {
        return color2;
    }

    public void setColors (Colors color1, Colors color2) {
        this.color1 = (color1 == null) ? null : color1;
        this.color2 = (color2 == null) ? null : color2;
    }

    public int getEngineSizeInCC() {
        return engineSizeInCC;
    }

    public void setEngineSizeInCC(int engineSizeInCC) {
        this.engineSizeInCC = (engineSizeInCC < 0) ? 0 : engineSizeInCC;
    }

    @Override
    public double calculatePrice(MCTypes type, Colors color1, Colors color2, int engineSizeInCC) {
        int color1PriceDifference = 0;
        int color2PriceDifference = 0;
        int typeCost = 0;
        int enginePricePerCC = 30;

        switch (type) {
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
        };
        
        switch (color1) {
            case black:
                color1PriceDifference = 3000;
                break;
            case white:
                color1PriceDifference = 2500;
                break;
            case green:
                color1PriceDifference = 2000;
                break;
            case pink:
                color1PriceDifference = 1500;
                break;
        }

        switch (color2) {
            case black:
                color1PriceDifference = 3000;
                break;
            case white:
                color1PriceDifference = 2500;
                break;
            case green:
                color1PriceDifference = 2000;
                break;
            case pink:
                color1PriceDifference = 1500;
                break;
        }

        return (double) color1PriceDifference + color2PriceDifference + typeCost + (enginePricePerCC * engineSizeInCC);
    };


}