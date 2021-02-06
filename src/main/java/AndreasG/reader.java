package AndreasG;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;

public class reader {
    public User reader(){

        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader f = new FileReader(System.getProperty("user.dir")+"/userdata.txt");
            BufferedReader b = new BufferedReader(f);
            String s;
            //判断是否到一行字符串
            while ((s = b.readLine()) != null) {
                arrayList.add(s);
            }
            User user = new User();
            user.setId(arrayList.get(0));
            user.setPass(arrayList.get(1));
            user.setAddress(arrayList.get(2));
            user.setTemperature(arrayList.get(3));
            b.close();
            f.close();
            return user;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "用户信息读取出错");
            return null;
        }
    }
}
