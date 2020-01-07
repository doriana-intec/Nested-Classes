package be.intecbrussel.static_nested_classes;

public class Magnum {
    private MagnumType magnumType;

    public Magnum(MagnumType magnumType) {
        this.magnumType = magnumType;
    }

    public MagnumType getMagnumType() {
        return magnumType;
    }

    enum MagnumType{
        MILKCHOCOLATE,DARKCHOCOLATE,ALPINENUTS;
    }
}
