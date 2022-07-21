package com.example.demo.controller;

import com.example.demo.Utils.CsDate;
import com.example.demo.dao.ShowDao;
import com.example.demo.domain.Info;
import com.example.demo.entity.HookEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * Created by mickjoust on 2016/6/8.
 * com.hjf.boot.demo.boot_mybatis_mvc
 */
//@Controller
@RestController
public class ShowController {

//    @Resource
//    private ShowDao showDao;
//
//    @RequestMapping(value = {"/","/index","/index.do","/index.action"})
//    public String index() {
//        return "page/index";
//    }
//
//    @RequestMapping(value = "/show",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseBody
//    public List<Info> show(Integer age) {
//        System.out.println("test");
//        return showDao.findByAge(age);
//    }

//@RequestMapping("/hello")
//public String say(){
//    return "Hello SpringBoot!";
//}

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello SpringBoot!";
    }

    @RequestMapping(value = "/hookcs",method = RequestMethod.GET)
    public HookEntity hookcs(){

        String phone = CsDate.getTel();

        HookEntity hookEntity = new HookEntity();
        hookEntity.setPhone_city(CsDate.RanCity());
        hookEntity.setPhone_citycode(CsDate.RanCityCode());
        hookEntity.setPhone_stationadcode(CsDate.Rannum(2));
        hookEntity.setPhone_district(CsDate.Rannum(4));
        hookEntity.setPhone_address(CsDate.RanAddress());
        hookEntity.setPhone_province(CsDate.RanProvince());
        hookEntity.setPhone_amaproad(CsDate.getRoad());
        hookEntity.setPhone_amapprovider("");
        hookEntity.setPhone_bluename(CsDate.RanStZm());
        hookEntity.setPhone_bluemac(CsDate.getMac());
        hookEntity.setPhone_nettypename("WIFI");
        hookEntity.setPhone_netinfoextra("");
        hookEntity.setPhone_mac(CsDate.getMac());
        hookEntity.setPhone_gprsip( CsDate.getRandomIp());
        hookEntity.setPhone_deviceid(CsDate.RanDeviceId());
        hookEntity.setPhone_deviceversion("");
        hookEntity.setPhone_androidid(CsDate.RanAndroidID());
        hookEntity.setPhone_osarch("armeabi-v7a");
        hookEntity.setPhone_osversion("19");
        hookEntity.setPhone_dns1ip("");
        hookEntity.setPhone_wifiip( CsDate.getRandomIp());
        hookEntity.setPhone_pid(CsDate.Rannum(4));
        hookEntity.setPhone_phonetype(CsDate.Rannum(4)+"9f6123a9");
        hookEntity.setPhone_netcountryiso("us");
        hookEntity.setPhone_netoperator("310260");
        hookEntity.setPhone_netoperatorname("Android");
        hookEntity.setPhone_voicealphatag("");
        hookEntity.setPhone_voicenumber(phone);
        hookEntity.setPhone_msisdn(phone);
        hookEntity.setPhone_simcountryiso("cn");
        hookEntity.setPhone_simoperator("4600");
        hookEntity.setPhone_simoperatorname("中国移动");
        hookEntity.setPhone_simserialnumber("89"+CsDate.Rannum(18));
        hookEntity.setPhone_subscriberid(CsDate.getImsi());
        hookEntity.setPhone_line1number(phone);
        hookEntity.setPhone_useragent(CsDate.RanUseragent());
        hookEntity.setPhone_bssid(CsDate.getMac());
        hookEntity.setPhone_ssid(CsDate.RanStZm());
        hookEntity.setPhone_scantype(CsDate.Rannum(2));
        hookEntity.setPhone_dpi("320");
        hookEntity.setPhone_dhcpip(CsDate.Rannum(2));
        hookEntity.setPhone_stationlatitude(CsDate.getLng(""+(new Random().nextInt(60)+50)));
        hookEntity.setPhone_stationlongitude(CsDate.getLng(""+(new Random().nextInt(60)+50)));
        hookEntity.setPhone_stationaltitude(CsDate.getLng(""+(new Random().nextInt(60)+50)));
        hookEntity.setPhone_isnetroaming("");
        hookEntity.setPhone_netinfosubname(CsDate.RanPhoneNetinfosubname());
        hookEntity.setPhone_netinfosubtype("2");
        hookEntity.setPhone_hasicccard(CsDate.RanBoolean()+"");
        hookEntity.setPhone_wifienabled(CsDate.RanBoolean()+"");
        hookEntity.setPhone_altitude(CsDate.getLng(""+(new Random().nextInt(60)+50)));
        hookEntity.setPhone_cdmasystemid(CsDate.Rannum(2)+1);
        hookEntity.setPhone_cdmanetworkid(CsDate.Rannum(4));
        hookEntity.setPhone_cdmastationid(CsDate.Rannum(2)+1);
        hookEntity.setPhone_gsmlac("6"+CsDate.Rannum(3));
        hookEntity.setPhone_gsmcid("6"+CsDate.Rannum(4));
        hookEntity.setPhone_getNetworkType(CsDate.Rannum(1)+2);
        hookEntity.setPhone_netinfotype(new Random().nextInt(2)+"");
        hookEntity.setPhone_rssi(CsDate.Rannum(2));
        hookEntity.setPhone_simstate("5");
        hookEntity.setPhone_callstate("0");
        hookEntity.setPhone_voicecount(CsDate.Rannum(2));
        hookEntity.setPhone_linkspeed(CsDate.Rannum(2));
        hookEntity.setPhone_networkid("6"+CsDate.Rannum(3));
        hookEntity.setPhone_wifistate("3");
        hookEntity.setNetworkinfo_gettype(CsDate.Rannum(2)+1);
        hookEntity.setBuild_user(CsDate.RanStZm());
        hookEntity.setBuild_radio("MOLY.WR8.W1328.MD.TG.MP.V1.P22, 2014/07/15 19:57");
        hookEntity.setBuild_brand("Huawei");
        hookEntity.setBuild_id("HUAWEITAG-TLOO");
        hookEntity.setBuild_board("TL00");
        hookEntity.setBuild_serial("YGKBBBB5C1711949");
        hookEntity.setBuild_hardware("mt6592");
        hookEntity.setBuild_bootloader("unkonwn");
        hookEntity.setBuild_fingerprint("Huawei/PE-TL19/hwPE=4.4.4/HuaweiPE-TL19/CHNC00B200=user/ota-rel-keys;release-keys");
        hookEntity.setBuild_host("scmbuild");
        hookEntity.setBuild_product("G750-T01");
        hookEntity.setBuild_incremental("C01B166");
        hookEntity.setBuild_release("4.4.4");
        hookEntity.setBuild_sdkint("19");
        hookEntity.setBuild_cpuabi2("6"+CsDate.Rannum(3));
        hookEntity.setBuild_cpuabi("6"+CsDate.Rannum(3));
        hookEntity.setBuild_device("hwG750-T01");
        hookEntity.setBuild_manufacturer("HUAWEI");
        hookEntity.setBuild_model("HUAWEI G750-T01");
        hookEntity.setBuild_display("TAG-TLOOCO1B166");
        hookEntity.setQiyi_version("1.1");
        hookEntity.setToutiao_version("63"+CsDate.Rannum(1));
        hookEntity.setPhone_density("2.0");
        hookEntity.setPhone_xdpi("422.03");
        hookEntity.setPhone_ydpi("424.069");
        hookEntity.setPhone_scaled("2.0");
        hookEntity.setPhone_width("720");
        hookEntity.setPhone_height("1184");
        hookEntity.setPhone_sdtotal(CsDate.Rannum(2));
        hookEntity.setAppversion("1."+CsDate.Rannum(2));
        hookEntity.setAppversioncode("3."+CsDate.Rannum(2));
        hookEntity.setVersion_SDK("19");
        hookEntity.setToutiao_updateversioncode(CsDate.Rannum(1));
        hookEntity.setToutiao_channel("tx");
        hookEntity.setVersion_RELEASE("4.44");
        hookEntity.setVersion_CODENAME("2");
        hookEntity.setVersion_INCREMENTAL("1");
        hookEntity.setBuild_timelong(""+System.currentTimeMillis());
        hookEntity.setBuild_type("users");

        return hookEntity;
    }
}
