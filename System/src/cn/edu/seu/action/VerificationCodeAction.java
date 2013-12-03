package cn.edu.seu.action;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class VerificationCodeAction {
    public String exec() throws Exception {

       HttpServletResponse response = ServletActionContext.getResponse();
       int codeLength = 4;// ��֤�볤��
       int mixTimes = 1;// ģ���̶Ȳ���
       Color bgColor = getRandColor(200, 250);// ������ɫ
       Color bfColor = new Color(0, 0, 0);// ������ɫ
       boolean ifRandomColor = true;// �����ַ��Ƿ���ɫ���
       boolean ifMixColor = false;// ģ�����Ƿ���ɫ���
       // ����ҳ�治����
       response.setHeader("Pragma", "No-cache");
       response.setHeader("Cache-Control", "no-cache");
       response.setDateHeader("Expires", 0);
       // ���ڴ��д���ͼ��
       int width = 13 * codeLength + 6, height = 20;
       BufferedImage image = new BufferedImage(width, height,
         BufferedImage.TYPE_INT_RGB);
       // ��ȡͼ��������
       Graphics g = image.getGraphics();
       // �趨����ɫ
       g.setColor(bgColor);
       g.fillRect(0, 0, width, height);
       // �趨����
       g.setFont(new Font("Arail", Font.BOLD, 18));
       // ���߿�
       g.setColor(new Color(33, 66, 99));
       g.drawRect(0, 0, width - 1, height - 1);
       // ������������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽
       g.setColor(getRandColor(160, 200));
       for (int i = 0; i < mixTimes * codeLength / 10; i++) {
        if (ifMixColor) {
         g.setColor(getRandColor(160, 200));
        }
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        int xl = random.nextInt(12);
        int yl = random.nextInt(12);
        g.drawLine(x, y, x + xl, y + yl);
       }
       // ȡ�����������֤��(4λ����)
       
    // ��ͼƬ��������ֺ���ĸ
        Random  r=new Random();
       StringBuffer sb = new StringBuffer();
       char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
       int index, len = ch.length;
       String sRand = "";
       for (int i = 0; i < codeLength; i ++) {
 
              index = r.nextInt(len);
      
        String rand =String.valueOf(ch[index]);
        sRand += rand;
        // ����֤����ʾ��ͼ����
        if (ifRandomColor)
         g.setColor(getRandColor(20, 110, 0));
        else
         g.setColor(bfColor);
        // ���ú�����������ɫ��ͬ����������Ϊ����̫�ӽ�������ֻ��ֱ������
        g.drawString(rand, 13 * i + 6, 16);
       }
       // ����֤�����SESSION
       // ͼ����Ч
       HttpSession session =  ServletActionContext.getRequest().getSession();
       session.removeAttribute("rand");
       session.setAttribute("rand",sRand);
       System.out.println(sRand);
       System.out.println(ServletActionContext.getRequest().getSession().getAttribute("rand"));
       g.dispose();
       // ���ͼ��ҳ��
       ImageIO.write(image, "PNG", response.getOutputStream());
       //JspWriter out;
       return  null;
 
    }
 
    private static Random random = new Random();
 
    private Color getRandColor(int fc, int bc) {
       return getRandColor(fc, bc, fc);
    }
    private Color getRandColor(int fc, int bc, int interval) {
       if (fc > 255) {
        fc = 255;
       }
       if (bc > 255) {
        bc = 255;
       }
       int r = fc + random.nextInt(bc - interval);
       int g = fc + random.nextInt(bc - interval);
       int b = fc + random.nextInt(bc - interval);
       return new Color(r, g, b);
    }

}