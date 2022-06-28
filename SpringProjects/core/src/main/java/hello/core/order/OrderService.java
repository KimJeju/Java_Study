package hello.core.order;


//주문에 대한 최종반환 인터페이스
public interface OrderService {
    Order createOrder(Long memberId,String itemName,int itemPrice);
}
