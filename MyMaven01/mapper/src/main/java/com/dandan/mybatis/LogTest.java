package com.dandan.mybatis;


import org.apache.log4j.Logger;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/11/17
 * @Desciption :
 */
public class LogTest {

    //第一步：获取日志记录器，记录器将负责控制日志信息
    private static Logger logger = Logger.getLogger(LogTest.class);

    //第二步：配置Log4j环境
    /* BasicConfigurator.configure()：自动快速地使用缺省Log4j环境
     * PropertyConfigurator.configure(String configFilename)：读取使用java的特性文件编写的配置文件
     * DOMConfigurator.configure(String filename) : 读取xml形式的配置文件
     */

   //第三步：插入记录信息（格式化日志信息）
    //使用不同优先级别的日志记录语句插入到配置文件中指定的日志信息目的地Appender
    //Logger.debug(Object message) Logger.warn(Object message)

    public static void main(String[] args){

        //测试日志信息的优先级，控制台输出和文件输出

        logger.error("this is a error log message");
        //logger.warn("this is a warn log message");
        logger.info("this is a info log message");
        logger.debug("this is a debug log message");
        logger.warn("this is a warn log message");
    }



}
