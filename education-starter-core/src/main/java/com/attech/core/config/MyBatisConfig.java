package com.attech.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Desc: MyBatis相关配置
 * Author: Aaron
 * Time: 2018/7/11 22:56.
 * Version: v1.0
 *
 * 在config下创建MyBatisConfig配置文件，通过mapperScannerConfigurer方法配置自动扫描Mapper文件。
 *
 * 注意：注意这里的 MapperScannerConfigurer 是tk.mybatis.spring.mapper.MapperScannerConfigurer，
 *      而不是org.mybatis，否则使用通用Mapper的方法时会报类似下面的这种错误:
 *      java.lang.NoSuchMethodException:tk.mybatis.mapper.provider.base.BaseSelectProvider.<init>()
 */
@Configuration
public class MyBatisConfig {

    /**
     * Mapper扫描配置. 自动扫描将Mapper接口生成代理注入到Spring.
     * @return
     */
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer (){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        /**
         * 注意这里的扫描路径：1、不要扫描到自定义的mapper; 2、定义的路径不要扫描到tk.mybatis.mapper(如定义**.mapper)
         * 两个做法都会导致扫描到tk.mybatis的Mapper，就会产生重复定义的报错.
         */
        mapperScannerConfigurer.setBasePackage("**.attech.**.mapper");
        return mapperScannerConfigurer;
    }

}
