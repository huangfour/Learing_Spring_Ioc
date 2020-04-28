package Test;

import sun.net.ftp.FtpClient;
import sun.net.ftp.FtpProtocolException;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * @author : hong.Four
 * @date : 2020-03-27 22:46
 **/
public class Test {
    //创建ftp
    private static FtpClient ftp;
    public static void main(String[] args) throws IOException, FtpProtocolException {
        Test.connectFTP("onetime.fun",21,"ftpuser","123456789");
        System.out.println(ftp.getWorkingDirectory());

    }

    /**
     * 连接ftp服务器
     * @param url
     * @param port
     * @param username
     * @param password
     * @return
     */
    public static FtpClient connectFTP(String url, int port, String username, String password) {
//        FtpClient ftp = null;
        try {
            //创建地址
            SocketAddress addr = new InetSocketAddress(url, port);
            //连接
            ftp = FtpClient.create();
            ftp.connect(addr);
            System.out.println("连接成功");
            //登陆
            ftp.login(username, password.toCharArray());
            ftp.setBinaryType();
            System.out.println("登陆成功");
        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ftp;
    }

    /**
     * 上传文件
     * @param localFile
     * @param ftpFile
     * @param
     */
    public static void upload(String localFile, String ftpFile) {
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            // 将ftp文件加入输出流中。输出到ftp上
            os = ftp.putFileStream(ftpFile);
            File file = new File(localFile);

            // 创建一个缓冲区
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int c;
            while((c = fis.read(bytes)) != -1){
                os.write(bytes, 0, c);
            }
            System.out.println("upload success!!");
        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os!=null) {
                    os.close();
                }
                if(fis!=null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 下载文件
     * @param localFile
     * @param ftpFile
     * @param ftp
     */
    public static void download(String localFile, String ftpFile, FtpClient ftp) {
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            // 获取ftp上的文件
            is = ftp.getFileStream(ftpFile);
            File file = new File(localFile);
            byte[] bytes = new byte[1024];
            int i;
            fos = new FileOutputStream(file);
            while((i = is.read(bytes)) != -1){
                fos.write(bytes, 0, i);
            }
            System.out.println("download success!!");

        } catch (FtpProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null) {
                    fos.close();
                }
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
