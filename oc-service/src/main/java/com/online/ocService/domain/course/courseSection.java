package com.online.ocService.domain.course;
/**
 * @Author: LiuXX
 * @Description: 课程章节名称类
 * @Date: 13:59 2018/3/16
 */
public class courseSection {

    private Integer id;
    /**
     * 归属课程id
     */
    private Integer courseId;
    /**
     * 父章节id，（只有2级）
     */
    private Integer parentId;
    /**
     * 章节名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 时长
     */
    private String time;
    /**
     * 未上架（0）、上架（1）
     */
    private Integer onsale;
    /**
     * 视频url地址
     */
    private String videoUrl;
}
