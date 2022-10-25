/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;


public class Customer {
    
    private String firsname;
    private String lasname;
    private String cash;
    private String telephone;
//    private InfoCustomer[] infoscustomers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InfoCustomer[] getInfoscustomers() {
        return infoscustomers;
    }

    public void setInfoscustomers(InfoCustomer[] infoscustomers) {
        this.infoscustomers = infoscustomers;
    }

    public void addInfo(InfoCustomer infocustomer){
        InfoCustomer[] newInfos = Arrays.copyOf(infoscustomers, infoscustomers.length+1);
        newInfos[newInfos.length-1]=infocustomer;
        this.infoscustomers = newInfos;
    }

    @Override
    public String toString() {
        return "r{"+ "jobtitle=" + name+ ", infocustomers=" + Arrays.toString(infoscustomers) + '}';
    }

}
