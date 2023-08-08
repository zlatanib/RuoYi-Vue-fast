CREATE TABLE `sco_class`
(
    `class_id`    bigint                                 NOT NULL AUTO_INCREMENT COMMENT '班级自增ID',
    `class_no`    varchar(6) COLLATE utf8mb4_general_ci  NOT NULL COMMENT '班级编号',
    `class_name`  varchar(30) COLLATE utf8mb4_general_ci NOT NULL COMMENT '班级名称',
    `part`        int                                    NOT NULL COMMENT '班级所属部分（1：A部分 2：B部分 3：课改部分）',
    `nature`      int                                    NOT NULL COMMENT '班级性质（0：文科 1：理科）',
    `level`       int                                    NOT NULL COMMENT '理科班级所属层次（1：一层次 2：二层次 3：三层次）',
    `status`      char(1) COLLATE utf8mb4_general_ci     NOT NULL COMMENT '班级状态（0正常 1停用）',
    `del_flag`    char(1) COLLATE utf8mb4_general_ci      DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
    `create_by`   varchar(64) COLLATE utf8mb4_general_ci  DEFAULT '' COMMENT '创建者',
    `create_time` datetime                                DEFAULT NULL COMMENT '创建时间',
    `update_by`   varchar(64) COLLATE utf8mb4_general_ci  DEFAULT '' COMMENT '更新者',
    `update_time` datetime                                DEFAULT NULL COMMENT '更新时间',
    `remark`      varchar(500) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='班级信息表';