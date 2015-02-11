package com.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class MessageRemind  {
	private int x;	//the x coordinate

	private int y;	//the y coordinate
	
	public void remind(String file,String text) throws IOException{
		BufferedImage image = ImageIO.read(new File(file));  
        Graphics g = image.getGraphics();  
        g.setColor(Color.RED);
        Font font = new Font("Courier New",Font.BOLD,20);
        g.setFont(font);
        g.drawString(text, this.x, this.y);
        g.dispose();
        File f = new File(file);  
        FileOutputStream fos = new FileOutputStream(f);  
        ImageIO.write(image,"PNG",fos);  
        fos.close();  
	} 
	
	public static void main(String[] args){
		MessageRemind mr = new MessageRemind();
		mr.setX(160);
		mr.setY(40);
		String file =  "D:\\image.png";
		int text = new Random().nextInt(20);
		try {
			mr.remind(file, String.valueOf(text));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
