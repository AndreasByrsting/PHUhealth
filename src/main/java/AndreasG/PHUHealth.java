package AndreasG;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import javax.swing.*;

public class PHUHealth {
    public static void main(String [] args) {
        reader reader = new reader();
        User user = reader.reader();
        if (user == null) {
            return;
        } else {
            try {
                WebClient webclient = new WebClient();
                webclient.getOptions().setCssEnabled(false);
                webclient.getOptions().setJavaScriptEnabled(false);
                HtmlPage htmlpage = webclient.getPage("http://old.peihua.cn/stuyqcj/login.aspx");
                final HtmlForm form = htmlpage.getForms().get(0);
                HtmlElement button = htmlpage.getHtmlElementById("LoginButton");
                HtmlTextInput txtId = form.getInputByName("UsernameTextbox");
                HtmlPasswordInput txtPass = form.getInputByName("PasswordTextbox");
                txtId.setValueAttribute(user.getId());
                txtPass.setValueAttribute(user.getPass());
                final HtmlPage nextPage = button.click();
                final HtmlForm mainform = nextPage.getForms().get(0);
                HtmlTextInput txtAddress = mainform.getInputByName("ssq");
                HtmlTextInput txttemperature = mainform.getInputByName("tiwen");
                txtAddress.setValueAttribute(user.getAddress());
                txttemperature.setValueAttribute(user.getTemperature());
                HtmlRadioButtonInput radioButton1 = (HtmlRadioButtonInput) nextPage.getElementById("A2");
                radioButton1.setChecked(true);
                HtmlRadioButtonInput radioButton2 = (HtmlRadioButtonInput) nextPage.getElementById("B5");
                radioButton2.setChecked(true);
                HtmlRadioButtonInput radioButton3 = (HtmlRadioButtonInput) nextPage.getElementById("C2");
                radioButton3.setChecked(true);
                HtmlCheckBoxInput CheckBox = nextPage.getElementByName("D1");
                CheckBox.setChecked(true);
                HtmlCheckBoxInput CheckBox2 = nextPage.getElementByName("D2");
                CheckBox2.setChecked(true);
                HtmlCheckBoxInput CheckBox3 = nextPage.getElementByName("D3");
                CheckBox3.setChecked(true);
                HtmlCheckBoxInput CheckBox4 = nextPage.getElementByName("D4");
                CheckBox4.setChecked(true);
                HtmlElement submit = nextPage.getHtmlElementById("Button1");
                final HtmlPage finalPage = submit.click();
                JOptionPane.showMessageDialog(null, "运行完成，不放心去就看看吧");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "糟糕，出错了");
            }
        }
    }
}
