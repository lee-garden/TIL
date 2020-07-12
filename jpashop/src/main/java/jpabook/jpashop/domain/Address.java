package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Address {

    // 값 타입은 Setter 없이 생성자만 만들어 둔다.
    // 불변객체로 만들기 위해서...

    private String city;
    private String street;
    private String zipCode;

    protected Address() {}

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
