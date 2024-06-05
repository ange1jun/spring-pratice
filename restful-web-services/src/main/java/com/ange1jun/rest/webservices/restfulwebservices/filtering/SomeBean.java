package com.ange1jun.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

//@JsonIgnoreProperties({"field1","field2"})
@JsonFilter("filter")
public class SomeBean {
    private String field1;
    private String field2;
    private String field3;

    public SomeBean(String filed1, String filed2, String filed3) {
        this.field1 = filed1;
        this.field2 = filed2;
        this.field3 = filed3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "filed1='" + field1 + '\'' +
                ", filed2='" + field2 + '\'' +
                ", filed3='" + field3 + '\'' +
                '}';
    }
}
