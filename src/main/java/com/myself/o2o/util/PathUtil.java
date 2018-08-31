package com.myself.o2o.util;

public class PathUtil {
    private static String separator = System.getProperty("file.separator");

    /**
     * 返回项目图片的根路径
     * @return
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/home/projectdev/image";
        }

        basePath = basePath.replace("/", separator);
        return basePath;
    }

    /**
     * 根据不同的业务需求,返回不同的项目子路径
     * @param shopId
     * @return
     */
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", separator);
    }
}
