package com.ttbank.flep.core.test;

/**
 * @Author lucky
 * @Date 2022/1/20 13:45
 */
public enum SeasonEnum {
    //枚举类的实例对象必须在最前面先定义，而且必须每个实例对象都必须维护上chinese成员变量
    SPRING("春天",1201){
        @Override
        void sayHello() {
            System.out.println("hello spring");
        }
    },
    SUMMER("夏天",1202){
        @Override
        void sayHello() {
            System.out.println("hello summer");
        }
    },
    AUTUMN("秋天",1203){
        @Override
        void sayHello() {
            System.out.println("hello autumn");
        }
    },
    WINTER("冬天",1204){
        @Override
        void sayHello() {
            System.out.println("hello winter");
        }
    };

    private String name;
    private Integer code;

    //枚举类型的构造函数默认为private，因为枚举类型的初始化要在当前枚举类中完成。
    SeasonEnum (String name,Integer code){
        this.name=name;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    abstract void sayHello();
}
