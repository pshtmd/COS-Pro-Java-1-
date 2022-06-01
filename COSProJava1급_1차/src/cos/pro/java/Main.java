package cos.pro.java;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
	 interface DeliveryStore{
	     public void setOrderList(String[] orderList);
	     public int getTotalPrice();
	 }
	 
	 class Food{
	     public String name;
	     public int price;
	     public Food(String name, int price){
	         this.name = name;
	         this.price = price;
	     }
	 }
//#######################################################

	class PizzaStore implements DeliveryStore{//빈칸 implements DeliveryStore
	    private ArrayList<Food> menuList;
	    private ArrayList<String> orderList;
	    
	    public PizzaStore(){
	        menuList = new ArrayList<Food>();
	        String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
	        int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
	        for(int i = 0; i < 5; i++)
	            menuList.add(new Food(menuNames[i], menuPrices[i]));
	        
	        orderList = new ArrayList<String>();
	    }
	    
	    public void setOrderList(String[] orderList){// 빈칸 void setOrderList(String[] orderList)
	        for(int i = 0; i < orderList.length; i++)
	            this.orderList.add(orderList[i]);
	    }
	    
	    public int getTotalPrice(){//빈칸 int getTotalPrice()
	        int totalPrice = 0;
	        Iterator<String> iter = orderList.iterator();
	        while (iter.hasNext()) {
	            String order = iter.next();
	            for(int i = 0; i < menuList.size(); i++)
	                if(order.equals(menuList.get(i).name))
	                    totalPrice += menuList.get(i).price;
	        }
	        return totalPrice;
	    }
	}

	public int solution(String[] orderList) {
	    DeliveryStore deliveryStore = new PizzaStore();
	    
	    deliveryStore.setOrderList(orderList);
	    int totalPrice = deliveryStore.getTotalPrice();
	    
	    return totalPrice;
	}
}
