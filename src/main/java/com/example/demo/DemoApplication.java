package com.example.demo;

import com.example.demo.Utils.FileUtils;
import com.example.demo.Utils.IpUtils;
import com.example.demo.entity.LogEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration  //1
@ComponentScan  //2
@RestController //3
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/h")
	public String home(String name,String password) {

		return "Hello World name:"+name +"   password: "+password;
	}

	@RequestMapping("/w")
	public String word() {
		return "World";
	}

	@RequestMapping(value = "/log", method = RequestMethod.GET)
	@ResponseBody
	public String log(HttpServletRequest request,String log) {
		FileUtils fileUtils = new  FileUtils(FileUtils.pathName,"log:"+log+"      ip:"+  IpUtils.getIpAddr(request));
		fileUtils.writeLog();
		int num = 1;
		try {
			num =  fileUtils.getTotalLines();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return  IpUtils.getIpAddr(request) +"";
	}

	@RequestMapping("/getlog")
	public List<LogEntity> getlogcon(String log) {
		FileUtils fileUtils = new  FileUtils(FileUtils.pathName,"log:"+log);
		 String  scon= "";
		List<LogEntity> list = new ArrayList<LogEntity>();
		try {
//			scon =  fileUtils.getTotalLinesCom();
			list=  fileUtils.getTotalLinesCom();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return  list;
	}
}
