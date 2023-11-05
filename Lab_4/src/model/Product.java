/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon productImage;
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<>();
    }
    
    public Feature addNewFeature(){
        Feature newFeature = new Feature();
        this.features.add(newFeature);
        return newFeature;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }
    
    public void removeFeature(Feature feature){
        features.remove(feature);
    }
    
    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
