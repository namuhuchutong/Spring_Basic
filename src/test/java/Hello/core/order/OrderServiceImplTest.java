package Hello.core.order;

import org.junit.jupiter.api.Test;

public class OrderServiceImplTest {


    /*
        수정자 주입으로 테스트 실행시 NullPointException 발생
        생성자 주입은 컴파일 오류가 발생
     */
    @Test
    void createOrder() {
//        OrderServiceImpl orderService = new OrderServiceImpl();
//        orderService.createOrder(1L, "item1", 1000);
    }
}
