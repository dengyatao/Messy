package com.Tzzzzz.factory.AbstractFactoryeg;

public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button creatButton() {
        return new SummerButton();
    }

    @Override
    public TextField creatTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox creatComboBox() {
        return new SummerComboBox();
    }
}
