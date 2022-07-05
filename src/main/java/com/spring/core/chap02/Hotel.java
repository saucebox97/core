package com.spring.core.chap02;

public class Hotel {

    private Restaurant restaurant;
    private Chef headChef;
    // 의존성 주입 : 하나의 객체가 다른 객체의 의존성을 제공하는 테크닉이다
    // 의존성 주입의 의도는 객체의 생성과 사용의 관심
//                          의존성 주입 restaurant , headChef
    public Hotel(Restaurant restaurant, Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s이며, 헤드쉐프는 %s 입니다.\n"
                , restaurant.getClass().getSimpleName(), headChef.getClass().getSimpleName());

        restaurant.reserve();
    }
}