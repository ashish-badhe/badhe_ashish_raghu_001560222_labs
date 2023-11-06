/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ashish
 */
public class FeatureList {
    
    private ArrayList<String> featureNameList;
    
    public FeatureList(){
        
        this.featureNameList = new ArrayList<String>();
        this.featureNameList.add("Country Of Origin");
        this.featureNameList.add("Category");
    }
    
    public ArrayList<String> getFeatureList(){
        return featureNameList;
    }
    
    public void addFeatureToList(String featureName){
        featureNameList.add(featureName);
    }
     
}
