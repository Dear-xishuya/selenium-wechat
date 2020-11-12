package com.hogwarts.web.annotation;

import com.hogwarts.web.aggregator.MemberAggregator;
import org.junit.jupiter.params.aggregator.AggregateWith;

import java.lang.annotation.*;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 将csv数据转换为Member实体类
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@AggregateWith(MemberAggregator.class)
public @interface CsvToMember {
}
