package com.alan.demo.entity;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.bid
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    private Integer bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.bname
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    private String bname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.price
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    private Integer price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.bid
     *
     * @return the value of book.bid
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.bid
     *
     * @param bid the value for book.bid
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.bname
     *
     * @return the value of book.bname
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public String getBname() {
        return bname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.bname
     *
     * @param bname the value for book.bname
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.price
     *
     * @return the value of book.price
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.price
     *
     * @param price the value for book.price
     *
     * @mbg.generated Mon Mar 09 13:47:00 CST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}