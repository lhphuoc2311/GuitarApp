package com.cgmouse.v4;


public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;// SỐ DÂY
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec otherSpec) {

        if (this.builder != otherSpec.getBuilder())// true
            return false;
        if ((this.model != null) && (!this.model.equals("")) && (!model.equalsIgnoreCase(otherSpec.getModel())))
            return false;
        if (this.type != otherSpec.getType())
            return false;
        if (this.backWood != otherSpec.getBackWood())
            return false;

        if (this.topWood != otherSpec.getTopWood())
            return false;
        if (this.numStrings != otherSpec.getNumStrings())
            return false;

        return true;
    }

}
