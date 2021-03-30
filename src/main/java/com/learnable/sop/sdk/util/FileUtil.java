package com.learnable.sop.sdk.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Iterator;

/**
 * 文件工具类
 * @author lcl
 */
public class FileUtil {

    /**
     * The default buffer size to use.
     */
    private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;
    private static final int EOF = -1;

    /**
     * 根据坐标获取切图的base64编码
     * @param content
     * @param x
     * @param y
     * @param w
     * @param h
     * @return
     */
    public static String cutImageFromBase64(String content, int x, int y, int w, int h) {
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            InputStream inputStream = new ByteArrayInputStream(decoder.decodeBuffer(content));
            ImageInputStream iis = ImageIO.createImageInputStream(inputStream);
            Iterator it = ImageIO.getImageReaders(iis);
            ImageReader imagereader = (ImageReader) it.next();
            imagereader.setInput(iis);
            ImageReadParam par = imagereader.getDefaultReadParam();
            par.setSourceRegion(new Rectangle(x, y, w, h));
            BufferedImage bi = imagereader.read(0, par);

            String imageString = "";
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bi, "jpg", bos);
            byte[] imageBytes = bos.toByteArray();
            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
            inputStream.close();
            iis.close();
            bos.close();
            return imageString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String cutImage(String filePath, int x, int y, int w, int h) {
        try {
            InputStream inputStream = new URL(filePath).openStream();
            ImageInputStream iis = ImageIO.createImageInputStream(inputStream);
            Iterator it = ImageIO.getImageReaders(iis);
            ImageReader imagereader = (ImageReader) it.next();
            imagereader.setInput(iis);
            ImageReadParam par = imagereader.getDefaultReadParam();
            par.setSourceRegion(new Rectangle(x, y, w, h));
            BufferedImage bi = imagereader.read(0, par);

            String imageString = "";
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bi, "jpg", bos);
            byte[] imageBytes = bos.toByteArray();
            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
            inputStream.close();
            iis.close();
            bos.close();
            return imageString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 将文件流转换成byte[]
     * @param input
     * @return
     * @throws IOException
     */
    public static byte[] toBytes(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int n = 0;
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }

    /**
     * 将文件转换成数据流
     * @param file 文件
     * @return 返回数据流
     * @throws IOException
     */
    public static byte[] toBytes(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (file.canRead() == false) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        InputStream input = null;
        try {
            input = new FileInputStream(file);
            return toBytes(input);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ioe) {
            }
        }
    }
}
