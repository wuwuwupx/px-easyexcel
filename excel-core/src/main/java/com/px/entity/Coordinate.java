package com.px.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 坐标
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {

    /**
     * 横坐标 - 行
     */
    private Integer rowIndex;

    /**
     * 纵坐标 - 列
     */
    private Integer columnIndex;

}