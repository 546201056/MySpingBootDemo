package com.example.demo.controller;

import com.example.demo.Utils.IpUtils;
import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.PhoneConts;
import com.example.demo.entity.TouTEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PhoneController {


    @Autowired
    PersonRepository personRepository;
    @GetMapping(value = "/a")
    private TouTEntity personList() {
        TouTEntity touTEntity = new TouTEntity();
        touTEntity.setMsg("成功");
        touTEntity.setSta("1");
        touTEntity.setPhoneConts(personRepository.findAll());
        return touTEntity;
    }

    @Autowired
    @GetMapping(value = "/b")
    private List<PhoneConts> personList2() {
        List<PhoneConts> s = personRepository.findAll();
        return s;
    }

    /**
     * 查询第几个参数
     *
     * @param index
     * @return
     */
    @GetMapping(value = "/sdknum/{index}")
    public PhoneConts phonesdk(@PathVariable("index") Integer index) {
        int indexId = 1;
        if (personRepository.findAll().get(index).getId()!=null){
           indexId =  personRepository.findAll().get(index).getId();
        }else {
            indexId =  personRepository.findAll().get(0).getId();
        }
        return personRepository.findOne(indexId);
    }

    /**
     *post 传的值
     * @return
     */
    @RequestMapping("/sdkpost")
    public String phonesdkpost(HttpServletRequest request) {
        String username=request.getParameter("username");
        return "suer: "+username;
    }

    /**
     *post 传的值
     * @return
     */
    @RequestMapping("/sdkpost2")
    public String phonesdkpost2(String request) {
        return "suer: "+request;
    }

    /**
     * 判断ID是不是本地IP
     * @param request
     * @return
     */
    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    @ResponseBody
    public String getIp(HttpServletRequest request) {
//        String path = "http://ip.taobao.com/service/getIpInfo.php?ip=";
        boolean b = true;
//        String country = "";
//        String city = "";
        String ipstr = IpUtils.getIpAddr(request);
//        if (IpUtils.internalIp(ipstr)){
//            b = true;
//        }else b = false;

//            AddressUtils addressUtils = new AddressUtils();

        return ipstr;
    }

    /**
     * 添加一个人员
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/person")
    public PhoneConts personAdd(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        PhoneConts person = new PhoneConts();
//        person.setName(name);
//        person.setAge(age);

        return personRepository.save(person);
    }

    /**
     * 查询一个人员
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/person/{id}")
    public PhoneConts personFindOne(@PathVariable("id") Integer id) {
        return personRepository.findOne(id);
    }

    /**
     * 删除一个人员
     *
     * @param id
     */
    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        personRepository.delete(id);
    }

    /**
     * 更新一个人员
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/person/{id}")
    public PhoneConts personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        PhoneConts person = new PhoneConts();
//        person.setId(id);
//        person.setName(name);
//        person.setAge(age);
        return personRepository.save(person);
    }



//    /**
//     * 通过年龄来查询
//     * @param age
//     * @return
//     */
//    @GetMapping(value = "/person/age/{age}")
//    public List<PhoneConts> personListByAge(@PathVariable("age") Integer age) {
//        return personRepository.findByAge(age);
//    }

}
