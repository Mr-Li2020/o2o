package com.myself.o2o.util;

import com.myself.o2o.dto.ImageHolder;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class ImageUtil {
    private static String basePath = "E:/photo";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random random = new Random();
    private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    /**
     * 将CommonsMultipartFile转换成File
     *
     * @param cFile
     * @return
     */
    public static File transferCommonsMultipartFileToFile(CommonsMultipartFile cFile) {
        File newFile = new File(cFile.getOriginalFilename());
        try {
            cFile.transferTo(newFile);
        } catch (IOException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return newFile;
    }

    /**
     * 处理缩略图,并返回新生成图片的相对值路径
     *
     * @param thumbnail
     * @param targetAddr
     * @return
     */
    public static String generateThumbnail(ImageHolder thumbnail, String targetAddr) {
        //获取不重复的随机名
        String realFileName = getRandomFileName();
        //获取文件的扩展名如png,jpg等
        String extension = getFileExtension(thumbnail.getImageName());
        //如果目标路径不存在,则自动创建
        makeDirPath(targetAddr);
        //获取文件存储的相对路径(带文件名)
        String relativeAddr = targetAddr + realFileName + extension;
        logger.debug("current relativeAddr is:" + relativeAddr);
        //获取文件要保存到的目标文件
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("current complete addr is:" + PathUtil.getImgBasePath() + relativeAddr);
        try {
            //调用Thumbnails生成带有水印的图片
            Thumbnails.of(thumbnail.getImage()).size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
                    .outputQuality(0.8f).toFile(dest);
        } catch (IOException e) {
            logger.error(e.toString());
            throw new RuntimeException("创建缩略图失败:" + e.toString());
        }
        //返回图片相对路径地址
        return relativeAddr;
    }

    /**
     * 创建目标路径所涉及到的目录,即D:/projectdev/image/xxx.jpg,那么文件夹得自动创建出来
     *
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取输入文件流的扩展名
     *
     * @param fileName
     * @return
     */
    private static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成随机文件名,当前年月日小时分钟秒钟+五位随机数
     *
     * @return
     */
    public static String getRandomFileName() {
        //获取随机的五位数
        int rannum = random.nextInt(89999) + 10000;
        String nowTimeStr = simpleDateFormat.format(new Date());
        return nowTimeStr + rannum;
    }

    /**
     * storePath是文件的路径还是目录的路径
     * 如果是文件路径,则删除该文件
     * 如果是目录路径,则删除该目录下的所有文件
     *
     * @param storePath
     */
    public static void deleteFileOrPath(String storePath) {
        File fileOrPath = new File(PathUtil.getImgBasePath() + storePath);
        if (fileOrPath.exists()) {
            if (fileOrPath.isDirectory()) {
                File files[] = fileOrPath.listFiles();
                for (int i = 0; i < files.length; i++) {
                    files[i].delete();
                }
            }
            fileOrPath.delete();
        }
    }

    public static void main(String[] args) throws IOException {
//        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        //在图片上添加水印
        Thumbnails.of(new File("E:/photo/o2o.jpg")).size(200, 200)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(
                        basePath + "/watermark.jpg")), 0.25f).outputQuality(0.8f)
                .toFile("E:/photo/newo2o.jpg");
    }

    /**
     * 处理详情图,并返回新生成图片的相对值路径
     *
     * @param thumbnail
     * @param targetAddr
     * @return
     */
    public static String generateNormalImg(ImageHolder thumbnail, String targetAddr) {
        //获取不重复的随机名
        String realFileName = getRandomFileName();
        //获取文件的扩展名如png,jpg等
        String extension = getFileExtension(thumbnail.getImageName());
        //如果目标路径不存在,则自动创建
        makeDirPath(targetAddr);
        //获取文件存储的相对路径(带文件名)
        String relativeAddr = targetAddr + realFileName + extension;
        logger.debug("current relativeAddr is:" + relativeAddr);
        //获取文件要保存到的目标文件
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("current complete addr is:" + PathUtil.getImgBasePath() + relativeAddr);
        try {
            //调用Thumbnails生成带有水印的图片
            Thumbnails.of(thumbnail.getImage()).size(337, 640)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
                    .outputQuality(0.9f).toFile(dest);
        } catch (IOException e) {
            logger.error(e.toString());
            throw new RuntimeException("创建缩略图失败:" + e.toString());
        }
        //返回图片相对路径地址
        return relativeAddr;
    }
}
