package com.c4c._2022server.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.c4c._2022server.entity.Customer;

@Component
public class MailUtils {
    @Autowired
    private JavaMailSender sender;

    /**
     * 顧客登録完了メールを送信する
     * @param customer
     */
    public void sendMail(Customer customer) {
        MimeMessage message = sender.createMimeMessage();
        try {
            //送信情報設定
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setFrom("test370510@gmail.com");
            helper.setTo(customer.getEmail());
            helper.setSubject("会員登録完了のお知らせ");
            helper.setText(createMailTemplate(customer), true);
            //メール送信
            sender.send(message);
        } catch (MessagingException e) {
            System.out.println("メール送信中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    /**
     * 顧客登録完了メールの設定をする
     * @param customer
     * @return insertMessage
     */
    private String createMailTemplate(Customer customer) {
        String link = CommonUtils.DOMAIN + ":3000/customer/login";
                String insertMessage =
                  "<html>"
                + "   <body>"
                + "       <p>" + customer.getLastName() + customer.getFirstName() + " 様</p>"
                + "       <br>"
                + "       <p>ご登録ありがとうございます。</p>"
                + "       <p>会員情報は下記になります。</p>"
                + "       <br>"
                + "       <p>■ログイン情報</p>"
                + "       <p>・ログインID：" + customer.getEmail() + "</p>"
                + "       <p>・パスワード：" + customer.getPassword() + "</p>"
                + "       <p>※パスワードは初回ログイン時に変更してください。</p>"
                + "       <br>"
                + "       <p>ログインはこちら</p>"
                + "       <a href='" + link + "'>・" + link + "</a>"
                + "   </body>"
                + "</html>";

        return insertMessage;
    }
}
