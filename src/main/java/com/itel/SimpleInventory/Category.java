package com.itel.SimpleInventory;
public enum Category {
    ELECTRONICS{
        @Override
    public String toString() {
        return "ELECTRONICS";
    }},
    CLOTHING{
        @Override
        public String toString() {
            return "CLOTHING";
        }},
    OFFICE_SUPPLIES{
        @Override
        public String toString() {
            return "OFFICE_SUPPLIES";
        }},
    FOOD_AND_BEVERAGES{
        @Override
        public String toString() {
            return "FOOD_AND_BEVERAGES";
        }},
    TOYS{
        @Override
        public String toString() {
            return "TOYS";
        }},

}