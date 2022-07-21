package com.example.demo.Utils;

import com.example.demo.entity.LogEntity;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class FileUtils {
    public static final String pathName = "D:\\A_jlhd\\log\\";




   static String pateName = "";
    static String logL = "";

    /**
     * @param pathname 路径
     * @param log 追加内容
     */
    public FileUtils(String pathname, String log){


        Date now = new Date();// new Date()为获取当前系统时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        DateFormat df1 = DateFormat.getDateInstance(); //格式化后的时间格式：2016-2-19
        String str1 = df1.format(now);
        String str2 = df.format(now);
        pateName = pathname+str1+".txt";
        logL = str2+" : "+log;
    }

    public   void writeLog() {

        System.out.println("log1111_"+logL);
        System.out.println("log_222_"+pateName);

        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            File file = new File(pateName);
            File fileParent = file.getParentFile();
            if(!fileParent.exists()){
                fileParent.mkdirs();
            }
            fw = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(new String(logL.getBytes(),"GBK"));
            pw.flush();

            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 文件内容的总行数。
    public  int getTotalLines() throws IOException {
        File file = new File(pateName);
        FileReader in = new FileReader(file);
        LineNumberReader reader = new LineNumberReader(in);
        String s = reader.readLine();
        int lines = 0;
        while (s != null) {
            lines++;
            s = reader.readLine();
        }
        reader.close();
        in.close();
        return lines;
    }
    // 文件内容的总行数。
    public  List<LogEntity>  getTotalLinesCom() throws IOException {
        List<LogEntity> list = new ArrayList<LogEntity>();

        File file = new File(pateName);
        System.out.println(pateName);
        FileReader in = new FileReader(file);
        LineNumberReader reader = new LineNumberReader(in);
        String s = reader.readLine();
        StringBuffer stringBuffer = new StringBuffer();
        int lines = 0;
        while (s != null) {
            s = reader.readLine();
            lines++;
            stringBuffer.append(s);
            stringBuffer.append("\n\t\r");
            System.out.println(stringBuffer+"-------------------All services-------------------"+s);
            LogEntity logEntity = new LogEntity();
            logEntity.setLog(s+"");
            list.add(logEntity);
        }
        stringBuffer.append(""+lines+"");
        reader.close();
        in.close();
        return list;
//        return stringBuffer.toString();
    }
}
