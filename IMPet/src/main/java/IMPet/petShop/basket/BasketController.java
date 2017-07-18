package IMPet.petShop.basket;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import IMPet.member.MemberService;
import IMPet.module.CommandMap;

@Controller
@RequestMapping(value="/PetShop")
public class BasketController {
	
	ModelAndView mav = new ModelAndView();
	
	@Resource(name="basketService")
	private BasketService basketService;
	
	@Resource(name="orderService")
	private OrderService orderService;
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@Resource(name="payService")
	private PayService payService;
	
	
	////////////////////////////////////////////////////////////////////////////Basket
	
	//펫샵장바구니리스트
	@RequestMapping(value="/BasketList")
	public ModelAndView BasketList(CommandMap commandMap) throws Exception {
		
		System.out.println("펫샵장바구니리스트");
		List<Map<String, Object>> list = basketService.selectAll(commandMap.getMap());
		
		System.out.println("size"+list.size());
		
		mav.addObject("basketList", list);
		mav.setViewName("BasketList");
		return mav;
	}
	
	//펫샵장바구니추가처리
	@RequestMapping(value="/BasketInsert")
	public ModelAndView BasketInsert(CommandMap commandMap, HttpSession session) throws Exception {

		System.out.println("펫샵장바구니추가처리");
		System.out.println(commandMap.getMap());
		basketService.insert(commandMap.getMap());
		
		String id = session.getAttribute("member_ID").toString();
		
		mav.setViewName("redirect:/PetShop/BasketList?MEMBER_ID="+id);
		return mav;
	}
	
	//펫샵장바구니상품삭제
	@RequestMapping(value="/BasketDelete")
	public ModelAndView BasketDelete(CommandMap commandMap, HttpSession session) throws	Exception {
		
		System.out.println("controller" +commandMap.getMap());
		basketService.delete(commandMap.getMap());
		System.out.println("펫샵장바구니상품삭제");
			
		String id = session.getAttribute("member_ID").toString();
		
		mav.setViewName("redirect:/PetShop/BasketList?MEMBER_ID="+id);
		return mav;
	}

	
	////////////////////////////////////////////////////////////////////////////Order
	
	//펫샵장바구니전체주문폼Basket
	@RequestMapping(value="/OrderFormB")
	public ModelAndView OrderList(CommandMap commandMap, HttpServletRequest request) throws Exception {

		Map<String, Object> map = orderService.selectAll(commandMap.getMap(), request);
		
		

		System.out.println(map.size());
	
		System.out.println(commandMap.getMap());
		System.out.println("펫샵장바구니전체주문폼");
	
		System.out.println(map);
		
		mav.addObject("member", map.get("member"));
		mav.addObject("orderView", map.get("orderView"));
		mav.setViewName("OrderFormB");
		return mav;
	}
	
	//펫샵상품바로주문폼Direct
	@RequestMapping(value="/OrderFormD")
	public ModelAndView OrderView(CommandMap commandMap) throws Exception {

		System.out.println("펫샵상품바로주문폼");
		
		Map<String, Object> map = orderService.selectOne(commandMap.getMap());
		map.put("BASKET_BUYCOUNT", commandMap.get("BASKET_BUYCOUNT"));
		
		System.out.println(map);
		mav.addObject("orderView", map);
		mav.setViewName("OrderFormD");
		return mav;
	
	}
	
	//펫샵주문상품추가
	@RequestMapping(value="/OrderInsert")
	public ModelAndView OrderInsert(CommandMap commandMap, HttpSession session) throws Exception {

		System.out.println("펫샵주문상품추가");
		System.out.println(commandMap.getMap());
		orderService.insert(commandMap.getMap());
		
		String id = session.getAttribute("member_ID").toString();
		
		mav.setViewName("redirect:/PetShop/OrderFormD?MEMBER_ID="+id);
		return mav;
	}
	
	//펫샵주문취소
	@RequestMapping(value="/OrderDelete")
	public ModelAndView OrderDelete(CommandMap commandMap, HttpSession session) throws	Exception {
		
		System.out.println("펫샵주문취소");
		System.out.println("controller" +commandMap.getMap());
		orderService.delete(commandMap.getMap());
			
		String id = session.getAttribute("member_ID").toString();
		
		mav.setViewName("redirect:/PetShop/Main?MEMBER_ID="+id);
		return mav;
	}
	
	//////////////////////////////////////////////////////////////////////////////
	//결제하기버튼을눌렀을때
	/*memberService.update(map);
	payService.insert(map);*/
	//////////////////////////////////////////////////////////////////////////////
	
	//펫상품결제진행
	@RequestMapping(value="/OrderItemPay")
	public ModelAndView OrderItemPay() {
		
		System.out.println("펫상품결제진행");
				
		mav.setViewName("OrderItemPay");
		return mav;
	}
	
	//펫샵주문완료
	@RequestMapping(value="/OrderComplete")
	public ModelAndView OrderShip() {
	
		System.out.println("펫샵주문완료");
			
		mav.setViewName("OrderComplete");
		return mav;
	}
	
	//펫샵구매내역
	@RequestMapping(value="/OrderList")
	public ModelAndView OrderPay() {
		
		System.out.println("펫샵구매내역");
		
		mav.setViewName("OrderList");
		return mav;
	}
	
}
