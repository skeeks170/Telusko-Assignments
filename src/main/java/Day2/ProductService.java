package main.java.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

//    public static void main(String[] args) {
//        Product p = new Product("iphone","Mobile","Main Desk",2025);
//        System.out.println(p);

        List<Product> products = new ArrayList<>();

        public void addProduct(Product p){
            products.add(p);
        }

        public List<Product> printAllProducts(){
            return products;
        }

        List<Product> filterProductsOutOfWarranty(){
            List<Product> filteredProductsOutOfWarranty = products.stream().filter(product -> product.getWarrantyYear()<2023).collect(Collectors.toList());
            filteredProductsOutOfWarranty.forEach(System.out::println);
            return filteredProductsOutOfWarranty;
        }

        List<Product> filterProductsByPLace(){
            String findByPlace = "Black Drawer";
            List<Product> filteredProductsByPlace = products.stream().filter(product -> product.getPlace().equals(findByPlace)).collect(Collectors.toList());
            filteredProductsByPlace.forEach(System.out::println);
            return filteredProductsByPlace;
        }


}