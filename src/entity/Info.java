/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


public class Info {
    private String price;
    private String countProductInShop;
    private String fabricator;


    public Info() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCountProductInShop() {
        return countProductInShop;
    }

    public void setCountProductInShop(String countProductInShop) {
        this.countProductInShop = countProductInShop;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    @Override
    public String toString() {
        return "Info{" + "\tprice=" + price + ", \tcountProductInShop= " + countProductInShop + ", \tfabricator= " + fabricator + "}";
    }
   
}

