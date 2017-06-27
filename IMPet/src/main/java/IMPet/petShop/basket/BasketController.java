package IMPet.petShop.basket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/PetShop")
public class BasketController {
	
	ModelAndView mav = new ModelAndView();
	
	//펫샵장바구니리스트
	@RequestMapping(value="/BasketList")
	public ModelAndView BasketList() {

		
		System.out.println("펫샵장바구니리스트");
	
		
		mav.setViewName("BasketList");
		return mav;
	}
	
	//펫샵장바구니추가처리
	@RequestMapping(value="/BasketWrite")
	public ModelAndView BasketWrite() {

		
		System.out.println("펫샵장바구니추가처리");
	
		
		mav.setViewName("BasketWrite");
		return mav;
	}
	
	//펫샵장바구니상품삭제
	@RequestMapping(value="/BasketDelete")
	public ModelAndView BasketDelete() {

		
		System.out.println("펫샵장바구니상품삭제");
	
		
		mav.setViewName("BasketDelete");
		return mav;
	}
	
	//펫샵주문상품리스트
	@RequestMapping(value="/OrderList")
	public ModelAndView OrderList() {

		
		System.out.println("펫샵주문상품리스트");
	
		
		mav.setViewName("OrderList");
		return mav;
	}
	
	//펫샵주문배송상태처리
	@RequestMapping(value="/OrderShip")
	public ModelAndView OrderShip() {

		
		System.out.println("펫샵주문배송상태처리");
	
		
		mav.setViewName("OrderShip");
		return mav;
	}
	
	//펫샵주문결제상태처리
	@RequestMapping(value="/OrderPay")
	public ModelAndView OrderPay() {

		
		System.out.println("펫샵주문결제상태처리");
	
		
		mav.setViewName("OrderPay");
		return mav;
	}
	
}