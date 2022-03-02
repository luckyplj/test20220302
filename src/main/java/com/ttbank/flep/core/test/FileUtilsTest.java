package com.ttbank.flep.core.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Author lucky
 * @Date 2021/12/13 17:48
 */
public class FileUtilsTest {
    public static void main(String[] args) {
        try {
            //Using FileUtils
            //usingFileUtils();
            usingFilenameUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void usingFileUtils() throws IOException {
        //01 获取文件对象
        //File file = FileUtils.getFile("D:\\data\\1.txt");
        File file = new File("D:\\data\\1.txt");
        //02 获取临时目录
        File tmpDir = FileUtils.getTempDirectory();
        System.out.println(tmpDir.getName());
        String tempDirectoryPath = FileUtils.getTempDirectoryPath();
        System.out.println(tempDirectoryPath);
        //03 将指定源文件的内容复制到指定目标目录中的同名文件中。
        FileUtils.copyFileToDirectory(file, tmpDir);
        //04 获取文件对象
        File newTempFile = FileUtils.getFile(tmpDir, file.getName());
        //05 获取文件内容
        String data = FileUtils.readFileToString(newTempFile, String.valueOf(Charset.defaultCharset()));
        //06 打印内容
        System.out.println(data);
    }

    public static void usingFilenameUtils() throws IOException{
        String path = "C:\\dev\\project\\file.txt";
        System.out.println("全路径: " +FilenameUtils.getFullPath(path));
        System.out.println("相对路径: " +FilenameUtils.getPath(path));
        System.out.println("Prefix: " +FilenameUtils.getPrefix(path));
        System.out.println("文件后缀: " + FilenameUtils.getExtension(path));
        System.out.println("文件名称，不包含后缀: " + FilenameUtils.getBaseName(path));
        System.out.println("文件名称，包含后缀: " + FilenameUtils.getName(path));
        String filename = "C:/commons/io/lang/project.xml";
        System.out.println("获取当前系统格式化路径: " + FilenameUtils.normalize(filename));
        System.out.println("移除文件的扩展名:"+FilenameUtils.removeExtension(path));
        System.out.println("转换分隔符为当前系统分隔符:"+FilenameUtils.separatorsToSystem(path));
        System.out.println("转换分隔符为linux系统分隔符:"+FilenameUtils.separatorsToUnix(path));
        System.out.println("转换分隔符为windows系统分隔符:"+FilenameUtils.separatorsToWindows(path));

    }

    public static void test() {
        try {
            BufferedReader br=new BufferedReader(new FileReader("doc/user.txt"));
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close(); //流使用完之后，一定要记得关闭；
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
