package com.Tzzzzz.iteratoreg;

import java.util.List;

public class ProductList extends AbstractObjectList{


    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator creatIterator() {
        return new ProductIterator(this);
    }
}
