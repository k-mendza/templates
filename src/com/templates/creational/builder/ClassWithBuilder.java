package com.templates.creational.builder;

public class ClassWithBuilder {
    private final String field1;
    private final String field2;
    private final String field3;
    private final String field4;

    public static class Builder {
        private String field1;
        private String field2;
        private String field3;
        private String field4;

        public Builder() {}

        public ClassWithBuilder build() {
            return new ClassWithBuilder(this);
        }

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(String field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public Builder field4(String field4) {
            this.field4 = field4;
            return this;
        }
    }

    public ClassWithBuilder(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
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

    public String getField4() {
        return field4;
    }
}
