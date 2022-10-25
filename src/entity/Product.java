/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

public class Product {
    private String title;
    private String price;
    private String countProductInShop;
    private String fabricator;
//    private Info[] infos;

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Info[] getInfos() {
        return infos;
    }

    public void setInfos(Info[] infos) {
        this.infos = infos;
    }
    
    public void addInfo(Info info){
        Info[] newInfos = Arrays.copyOf(infos, infos.length+1);
        newInfos[newInfos.length-1]=info;
        this.infos = newInfos;
    }

    @Override
    public String toString() {
        return "Product{" + "title=" + title + ", infos=" + Arrays.toString(infos) + '}';
    }
    
    
}
