package com.chscommandcenter.jsonpractice;

/**
 * Created by dubosew on 8/6/2017.
 */

public class Facilities {

    private String division, title, entity, address, city, state, zip, phone, website, intranet, emails, cernerhub, side;

    public Facilities(String division, String title, String entity, String address, String city, String state, String zip, String phone, String website, String intranet, String emails, String cernerhub, String side) {
        this.setDivision(division);
        this.setTitle(title);
        this.setEntity(entity);
        this.setAddress(address);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
        this.setPhone(phone);
        this.setWebsite(website);
        this.setIntranet(intranet);
        this.setEmails(emails);
        this.setCernerhub(cernerhub);
        this.setSide(side);
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIntranet() {
        return intranet;
    }

    public void setIntranet(String intranet) {
        this.intranet = intranet;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getCernerhub() {
        return cernerhub;
    }

    public void setCernerhub(String cernerhub) {
        this.cernerhub = cernerhub;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
