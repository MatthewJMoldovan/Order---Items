import java.util.*;

public class TestOrder {
    public static void main(String[] args){

      Item item1 = new Item();
      item1.name = "mocha";
      item1.price = 1.00;

      Item item2 = new Item();
      item2.name = "latte";
      item2.price = 2.00;

      Item item3 = new Item();
      item3.name = "drip coffee";
      item3.price = 2.50;

      Item item4 = new Item();
      item4.name = "capuccino";
      item4.price = 3.00;

      Order order1 = new Order();
      order1.name = "Cindhuri";
      order1.ready = true;

      Order order2 = new Order();
      order2.name = "Jimmy";
      order2.items.add(item1);
      order2.total += item1.price;
      order2.ready = true;

      Order order3 = new Order();
      order3.name = "Noah";
      order3.items.add(item4);
      order3.total += item4.price;

      Order order4 = new Order();
      order4.name = "Sam";
      order4.items.add(item2);
      order4.items.add(item2);
      order4.items.add(item2);
      order4.total += item2.price;
      order4.total += item2.price;
      order4.total += item2.price;
      order4.total += item2.price;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }

}