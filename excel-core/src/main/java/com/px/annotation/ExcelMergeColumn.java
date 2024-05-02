package com.px.annotation;

import java.lang.annotation.*;

/**
 * 单元格合并
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelMergeColumn {
}
