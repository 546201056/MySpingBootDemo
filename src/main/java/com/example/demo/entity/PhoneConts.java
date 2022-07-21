package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "android_data")
public class PhoneConts {
    //必须要有构造函数
    public PhoneConts() {
    }
    @Id
    @GeneratedValue
    private  Integer ID;
    private  String SDK;
    private  String MODEL;
    private  String BRAND;
    private  String RELEASE;
    private  String IMEI;
    private  String ANDROID_ID;
    private  String DISPLAY;
    private  String MIDU;
    private  String bssid;
    private  String manufacturer;
    private  String ssid;
    private  String wifimac;
    private  String get_address;
    private  String get_device_id;
    private  String get_line1number;
    private  String get_network_operator_name;
    private  String       get_network_type;
    private  String get_phone_type;
    private  String          get_radio_version;
    private  String get_sim_operator;
    private  String         get_sim_serial_number;

    public Integer getId() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    public String getSDK() {
        return SDK;
    }

    public void setSDK(String SDK) {
        this.SDK = SDK;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getRELEASE() {
        return RELEASE;
    }

    public void setRELEASE(String RELEASE) {
        this.RELEASE = RELEASE;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getANDROID_ID() {
        return ANDROID_ID;
    }

    public void setANDROID_ID(String ANDROID_ID) {
        this.ANDROID_ID = ANDROID_ID;
    }

    public String getDISPLAY() {
        return DISPLAY;
    }

    public void setDISPLAY(String DISPLAY) {
        this.DISPLAY = DISPLAY;
    }

    public String getMIDU() {
        return MIDU;
    }

    public void setMIDU(String MIDU) {
        this.MIDU = MIDU;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getWifimac() {
        return wifimac;
    }

    public void setWifimac(String wifimac) {
        this.wifimac = wifimac;
    }

    public String getGet_address() {
        return get_address;
    }

    public void setGet_address(String get_address) {
        this.get_address = get_address;
    }

    public String getGet_device_id() {
        return get_device_id;
    }

    public void setGet_device_id(String get_device_id) {
        this.get_device_id = get_device_id;
    }

    public String getGet_line1number() {
        return get_line1number;
    }

    public void setGet_line1number(String get_line1number) {
        this.get_line1number = get_line1number;
    }

    public String getGet_network_operator_name() {
        return get_network_operator_name;
    }

    public void setGet_network_operator_name(String get_network_operator_name) {
        this.get_network_operator_name = get_network_operator_name;
    }

    public String getGet_network_type() {
        return get_network_type;
    }

    public void setGet_network_type(String get_network_type) {
        this.get_network_type = get_network_type;
    }

    public String getGet_phone_type() {
        return get_phone_type;
    }

    public void setGet_phone_type(String get_phone_type) {
        this.get_phone_type = get_phone_type;
    }

    public String getGet_radio_version() {
        return get_radio_version;
    }

    public void setGet_radio_version(String get_radio_version) {
        this.get_radio_version = get_radio_version;
    }

    public String getGet_sim_operator() {
        return get_sim_operator;
    }

    public void setGet_sim_operator(String get_sim_operator) {
        this.get_sim_operator = get_sim_operator;
    }

    public String getGet_sim_serial_number() {
        return get_sim_serial_number;
    }

    public void setGet_sim_serial_number(String get_sim_serial_number) {
        this.get_sim_serial_number = get_sim_serial_number;
    }

    public String getGet_sim_state() {
        return get_sim_state;
    }

    public void setGet_sim_state(String get_sim_state) {
        this.get_sim_state = get_sim_state;
    }

    public String getGet_subscriber_id() {
        return get_subscriber_id;
    }

    public void setGet_subscriber_id(String get_subscriber_id) {
        this.get_subscriber_id = get_subscriber_id;
    }

    private  String get_sim_state;
    private  String          get_subscriber_id;





}
