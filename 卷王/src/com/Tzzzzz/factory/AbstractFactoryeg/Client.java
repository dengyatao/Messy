package com.Tzzzzz.factory.AbstractFactoryeg;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory = new SpringSkinFactory();
        Button button = factory.creatButton();
        TextField textField = factory.creatTextField();
        ComboBox comboBox = factory.creatComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }

}
