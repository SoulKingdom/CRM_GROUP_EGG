/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2017/5/5 10:05:40                            */
/*==============================================================*/


alter table ADVANCE_LOG
   drop constraint FK_ADVANCE__REFERENCE_BUSINESS;

alter table BUSINESS
   drop constraint FK_BUSINESS_REFERENCE_CUSTOMER;

alter table BUSINESS
   drop constraint FK_BUSINESS_REFERENCE_LINK_MAN;

alter table BUSINESS
   drop constraint FK_BUSINESS_REFERENCE_BUSINESS;

alter table BUSINESS
   drop constraint FK_BUSINESS_REFERENCE_BUSINESS;

alter table CANVAS
   drop constraint FK_CANVAS_REFERENCE_EMPLOYEE;

alter table "COMMENT"
   drop constraint FK_COMMENT_REFERENCE_DAILY_RE;

alter table "COMMENT"
   drop constraint FK_COMMENT_REFERENCE_EMPLOYEE;

alter table CUSTOMER
   drop constraint FK_CUSTOMER_REFERENCE_WORKING_;

alter table CUSTOMER
   drop constraint FK_CUSTOMER_REFERENCE_SOURCE;

alter table CUSTOMER
   drop constraint FK_CUSTOMER_REFERENCE_LINK_MAN;

alter table DAILY_RECORD
   drop constraint FK_DAILY_RE_REFERENCE_EMPLOYEE;

alter table EMPLOYEE
   drop constraint FK_EMPLOYEE_REFERENCE_DEPARTME;

alter table EMPLOYEE
   drop constraint FK_EMPLOYEE_REFERENCE_EMM_POSI;

alter table INDIVIDUAL_TASK
   drop constraint FK_INDIVIDU_REFERENCE_EMPLOYEE;

alter table INSTATION_MAIL
   drop constraint FK_INSTATIO_REFERENCE_EMPLOYEE;

alter table INSTATION_MAIL
   drop constraint FK_INSTATIO_REFERENCE_EMPLOYEE;

alter table LOG_IN
   drop constraint FK_LOG_IN_REFERENCE_EMPLOYEE;

alter table ORDERS
   drop constraint FK_ORDERS_REFERENCE_CUSTOMER;

alter table ORDERS
   drop constraint FK_ORDERS_REFERENCE_EMPLOYEE;

alter table ORDERS_DETAIL
   drop constraint FK_ORDERS_D_REFERENCE_ORDERS;

alter table POSITION_MENU_RELATIONS
   drop constraint FK_POSITION_REFERENCE_EMM_POSI;

alter table POSITION_MENU_RELATIONS
   drop constraint FK_POSITION_REFERENCE_MENU;

alter table PROCESS
   drop constraint FK_PROCESS_REFERENCE_EMPLOYEE;

alter table PRODUCT
   drop constraint FK_PRODUCT_REFERENCE_PRODUCT_;

alter table PRODUCT_INVENTORY
   drop constraint FK_PRODUCT__REFERENCE_STORE;

alter table PRODUCT_INVENTORY
   drop constraint FK_PRODUCT__REFERENCE_PRODUCT;

alter table TASK_USER_RELATIONS
   drop constraint FK_TASK_USE_REFERENCE_EMPLOYEE;

alter table TASK_USER_RELATIONS
   drop constraint FK_TASK_USE_REFERENCE_INDIVIDU;

drop table ADVANCE_LOG cascade constraints;

drop table BUSINESS cascade constraints;

drop table BUSINESS_SOURCE cascade constraints;

drop table BUSINESS_TYPE cascade constraints;

drop table CANVAS cascade constraints;

drop table "COMMENT" cascade constraints;

drop table CUSTOMER cascade constraints;

drop table DAILY_RECORD cascade constraints;

drop table DEPARTMENT cascade constraints;

drop table EMM_POSITION cascade constraints;

drop table EMPLOYEE cascade constraints;

drop table INDIVIDUAL_TASK cascade constraints;

drop table INSTATION_MAIL cascade constraints;

drop table LINK_MAN cascade constraints;

drop table LOG_IN cascade constraints;

drop table MENU cascade constraints;

drop table ORDERS cascade constraints;

drop table ORDERS_DETAIL cascade constraints;

drop table POSITION_MENU_RELATIONS cascade constraints;

drop table PROCESS cascade constraints;

drop table PRODUCT cascade constraints;

drop table PRODUCT_INVENTORY cascade constraints;

drop table PRODUCT_TYPE cascade constraints;

drop table SOURCE cascade constraints;

drop table STORE cascade constraints;

drop table TASK_USER_RELATIONS cascade constraints;

drop table WORKING_FIELD cascade constraints;

/*==============================================================*/
/* Table: ADVANCE_LOG                                           */
/*==============================================================*/
create table ADVANCE_LOG 
(
   LOG_ID               NUMBER(12,0)         not null,
   BUSINESS_ID          NUMBER(12,0),
   CREATOR              NUMBER(12,0),
   ADVANCE_CONTENT      VARCHAR2(2048),
   CREATE_TIME          TIMESTAMP,
   ADVANCE_STATUS       VARCHAR2(1),
   constraint PK_ADVANCE_LOG primary key (LOG_ID)
);

comment on table ADVANCE_LOG is
'推进记录';

comment on column ADVANCE_LOG.LOG_ID is
'推进编码';

comment on column ADVANCE_LOG.BUSINESS_ID is
'商机编码';

comment on column ADVANCE_LOG.CREATOR is
'负责员工';

comment on column ADVANCE_LOG.ADVANCE_CONTENT is
'推进内容';

comment on column ADVANCE_LOG.CREATE_TIME is
'推进时间';

comment on column ADVANCE_LOG.ADVANCE_STATUS is
'推进状态';

/*==============================================================*/
/* Table: BUSINESS                                              */
/*==============================================================*/
create table BUSINESS 
(
   BUSINESS_ID          NUMBER(12,0)         not null,
   CUSTOMER_ID          NUMBER(12,0),
   LINK_MAIN_ID         NUMBER(12,0),
   BUSINESS_NAME        VARCHAR2(512),
   BUSINESS_TYPE_ID     NUMBER(4,0),
   STATUS               VARCHAR2(1),
   BUSINESS_SOURCE_ID   NUMBER(4,0),
   PERSALE_PRICE        NUMBER(8,0),
   PROBABILITY          NUMBER(2,0),
   VISIT_TIME           TIMESTAMP,
   VISIT_CONTENT        VARCHAR2(2048),
   UPDATE_TIME          TIMESTAMP,
   EMPLOYEE_ID          NUMBER(12,0),
   constraint PK_BUSINESS primary key (BUSINESS_ID)
);

comment on table BUSINESS is
'商机';

comment on column BUSINESS.BUSINESS_ID is
'商机编码';

comment on column BUSINESS.CUSTOMER_ID is
'客户';

comment on column BUSINESS.LINK_MAIN_ID is
'联系人';

comment on column BUSINESS.BUSINESS_NAME is
'商机名';

comment on column BUSINESS.BUSINESS_TYPE_ID is
'商机类型';

comment on column BUSINESS.STATUS is
'0：初步意向
1：合同签订
';

comment on column BUSINESS.BUSINESS_SOURCE_ID is
'商机来源';

comment on column BUSINESS.PERSALE_PRICE is
'预售价格';

comment on column BUSINESS.PROBABILITY is
'赢单率';

comment on column BUSINESS.VISIT_TIME is
'下次联系时间';

comment on column BUSINESS.VISIT_CONTENT is
'下次联系内容';

comment on column BUSINESS.UPDATE_TIME is
'更新时间';

comment on column BUSINESS.EMPLOYEE_ID is
'负责员工';

/*==============================================================*/
/* Table: BUSINESS_SOURCE                                       */
/*==============================================================*/
create table BUSINESS_SOURCE 
(
   SOURCE_ID            NUMBER(4,0)          not null,
   SOURCE_NAME          VARCHAR2(512),
   constraint PK_BUSINESS_SOURCE primary key (SOURCE_ID)
);

comment on table BUSINESS_SOURCE is
'商机来源';

comment on column BUSINESS_SOURCE.SOURCE_ID is
'来源编码';

comment on column BUSINESS_SOURCE.SOURCE_NAME is
'商机来源';

/*==============================================================*/
/* Table: BUSINESS_TYPE                                         */
/*==============================================================*/
create table BUSINESS_TYPE 
(
   TYPE_ID              NUMBER(4,0)          not null,
   TYPE_NAME            VARCHAR2(512),
   constraint PK_BUSINESS_TYPE primary key (TYPE_ID)
);

comment on table BUSINESS_TYPE is
'商机类型';

comment on column BUSINESS_TYPE.TYPE_ID is
'类型编码';

comment on column BUSINESS_TYPE.TYPE_NAME is
'商机类型';

/*==============================================================*/
/* Table: CANVAS                                                */
/*==============================================================*/
create table CANVAS 
(
   CANVAS_ID            NUMBER(12,0)         not null,
   EMPLOYEE_ID          NUMBER(12,0),
   COMMISSION           TIMESTAMP,
   DESCRIPTION          VARCHAR2(4000),
   STATUS               VARCHAR2(1),
   CREATE_TIME          TIMESTAMP,
   constraint PK_CANVAS primary key (CANVAS_ID)
);

comment on table CANVAS is
'个人日程';

comment on column CANVAS.CANVAS_ID is
'日程编码';

comment on column CANVAS.EMPLOYEE_ID is
'员工编码';

comment on column CANVAS.COMMISSION is
'代办日期';

comment on column CANVAS.DESCRIPTION is
'代办事件描述';

comment on column CANVAS.STATUS is
'0：已创建（待办）
1：已完成';

comment on column CANVAS.CREATE_TIME is
'创建时间';

/*==============================================================*/
/* Table: "COMMENT"                                             */
/*==============================================================*/
create table "COMMENT" 
(
   COMMENT_ID           NUMBER(12,0)         not null,
   RECORD_ID            NUMBER（12）,
   COMMENT_EMPLOYEE     NUMBER(12,0),
   DETAIL               VARCHAR2(4000),
   CREATE_TIME          TIMESTAMP,
   constraint PK_COMMENT primary key (COMMENT_ID)
);

comment on table "COMMENT" is
'工作日志评论';

comment on column "COMMENT".COMMENT_ID is
'评论主键';

comment on column "COMMENT".RECORD_ID is
'日志编码';

comment on column "COMMENT".COMMENT_EMPLOYEE is
'评论人';

comment on column "COMMENT".DETAIL is
'评论内容';

comment on column "COMMENT".CREATE_TIME is
'评论时间';

/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
create table CUSTOMER 
(
   CUSTOMER_ID          NUMBER(12,0)         not null,
   PRINPICAL            NUMBER(12,0),
   CUSTOMER_NAME        VARCHAR2(512),
   POST_CODE            VARCHAR2(12),
   FIELD_ID             NUMBER(4,0),
   SOURCE_ID            NUMBER(4,0),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   EMPLOYEE_NUMBERS     VARCHAR2(128),
   ADDRESS              VARCHAR2(1024),
   TAG                  VARCHAR2(512),
   REMARKS              VARCHAR2(2048),
   BUSUBESS_VOLUME      VARCHAR2(512),
   constraint PK_CUSTOMER primary key (CUSTOMER_ID)
);

comment on table CUSTOMER is
'客户表';

comment on column CUSTOMER.CUSTOMER_ID is
'客户编码';

comment on column CUSTOMER.PRINPICAL is
'联系人';

comment on column CUSTOMER.CUSTOMER_NAME is
'客户名称';

comment on column CUSTOMER.POST_CODE is
'邮编';

comment on column CUSTOMER.FIELD_ID is
'所属行业';

comment on column CUSTOMER.SOURCE_ID is
'客户来源';

comment on column CUSTOMER.CREATE_TIME is
'创建时间';

comment on column CUSTOMER.UPDATE_TIME is
'更新时间';

comment on column CUSTOMER.EMPLOYEE_NUMBERS is
'员工数';

comment on column CUSTOMER.ADDRESS is
'地址';

comment on column CUSTOMER.TAG is
'标签';

comment on column CUSTOMER.REMARKS is
'备注';

comment on column CUSTOMER.BUSUBESS_VOLUME is
'年营业额';

/*==============================================================*/
/* Table: DAILY_RECORD                                          */
/*==============================================================*/
create table DAILY_RECORD 
(
   RECORD_ID            NUMBER(12,0)         not null,
   CREATOR              NUMBER(12,0),
   TITLE                VARCHAR2(256),
   CONTENT              CLOB,
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   TYPE                 VARCHAR(1),
   constraint PK_DAILY_RECORD primary key (RECORD_ID)
);

comment on table DAILY_RECORD is
'工作日志';

comment on column DAILY_RECORD.RECORD_ID is
'日志编码';

comment on column DAILY_RECORD.CREATOR is
'创建人';

comment on column DAILY_RECORD.TITLE is
'日志标题';

comment on column DAILY_RECORD.CONTENT is
'日志内容';

comment on column DAILY_RECORD.CREATE_TIME is
'创建时间';

comment on column DAILY_RECORD.UPDATE_TIME is
'更新时间';

comment on column DAILY_RECORD.TYPE is
'0、日报
1、周报
2、月报';

/*==============================================================*/
/* Table: DEPARTMENT                                            */
/*==============================================================*/
create table DEPARTMENT 
(
   DEPARTMENT_ID        NUMBER(12,0)         not null,
   DEPARTMENT_NAME      VARCHAR2(512),
   constraint PK_DEPARTMENT primary key (DEPARTMENT_ID)
);

comment on table DEPARTMENT is
'部门';

comment on column DEPARTMENT.DEPARTMENT_ID is
'部门编码';

comment on column DEPARTMENT.DEPARTMENT_NAME is
'部门名称';

/*==============================================================*/
/* Table: EMM_POSITION                                          */
/*==============================================================*/
create table EMM_POSITION 
(
   POSITION_ID          NUMBER(12,0)         not null,
   POSITION_NAME        VARCHAR2(512),
   POSITION_LEVEL       VARCHAR2(3),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   constraint PK_EMM_POSITION primary key (POSITION_ID)
);

comment on table EMM_POSITION is
'职位';

comment on column EMM_POSITION.POSITION_ID is
'职位编码';

comment on column EMM_POSITION.POSITION_NAME is
'职位名称';

comment on column EMM_POSITION.POSITION_LEVEL is
'职位等级';

comment on column EMM_POSITION.CREATE_TIME is
'创建时间';

comment on column EMM_POSITION.UPDATE_TIME is
'更新时间';

/*==============================================================*/
/* Table: EMPLOYEE                                              */
/*==============================================================*/
create table EMPLOYEE 
(
   EMPLOYEE_ID          NUMBER(12,0)         not null,
   EMPLOYEE_NAME        VARCHAR2(512),
   DEPARTMENT_ID        NUMBER(12,0),
   POSITON_ID           NUMBER(12,0),
   PHONE                VARCHAR(11),
   EMAIL                VARCHAR2(256),
   STATUS               VARCHAR2(1),
   PARENT_EMPLOYEE_ID   NUMBER(12,0),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   constraint PK_EMPLOYEE primary key (EMPLOYEE_ID)
);

comment on table EMPLOYEE is
'员工表';

comment on column EMPLOYEE.EMPLOYEE_ID is
'员工编码';

comment on column EMPLOYEE.EMPLOYEE_NAME is
'员工姓名';

comment on column EMPLOYEE.DEPARTMENT_ID is
'部门';

comment on column EMPLOYEE.POSITON_ID is
'职位';

comment on column EMPLOYEE.PHONE is
'手机';

comment on column EMPLOYEE.EMAIL is
'邮箱';

comment on column EMPLOYEE.STATUS is
'状态';

comment on column EMPLOYEE.PARENT_EMPLOYEE_ID is
'上级员工编号';

comment on column EMPLOYEE.CREATE_TIME is
'创建时间';

comment on column EMPLOYEE.UPDATE_TIME is
'更新时间';

/*==============================================================*/
/* Table: INDIVIDUAL_TASK                                       */
/*==============================================================*/
create table INDIVIDUAL_TASK 
(
   TASK_ID              NUMBER(12,0)         not null,
   TOPIC                VARCHAR2(512),
   DESCRIPTION          CLOB,
   RESPONSIBLE_PERSON   NUMBER(12,0),
   END_TIME             TIMESTAMP,
   PRIORITY             VARCHAR2(2),
   STATUS               VARCHAR2(2),
   CREATE_TIME          TIMESTAMP,
   OPERATOR             NUMBER(12,0),
   LINK_URL             VARCHAR2(512),
   TASK_TYPE            VARCHAR2(1),
   constraint PK_INDIVIDUAL_TASK primary key (TASK_ID)
);

comment on table INDIVIDUAL_TASK is
'个人任务';

comment on column INDIVIDUAL_TASK.TASK_ID is
'任务编码';

comment on column INDIVIDUAL_TASK.TOPIC is
'任务主题';

comment on column INDIVIDUAL_TASK.DESCRIPTION is
'关联信息';

comment on column INDIVIDUAL_TASK.RESPONSIBLE_PERSON is
'负责人';

comment on column INDIVIDUAL_TASK.END_TIME is
'结束时间';

comment on column INDIVIDUAL_TASK.PRIORITY is
'优先级';

comment on column INDIVIDUAL_TASK.STATUS is
'0：新建任务
1：已处理';

comment on column INDIVIDUAL_TASK.CREATE_TIME is
'创建时间';

comment on column INDIVIDUAL_TASK.OPERATOR is
'操作人';

comment on column INDIVIDUAL_TASK.LINK_URL is
'相关链接';

comment on column INDIVIDUAL_TASK.TASK_TYPE is
'0：日志
1：审核
2：自建任务';

/*==============================================================*/
/* Table: INSTATION_MAIL                                        */
/*==============================================================*/
create table INSTATION_MAIL 
(
   MAIL_ID              NUMBER(12,0)         not null,
   SENDER_ID            NUMBER(12,0),
   RECEIVER_ID          NUMBER(12,0),
   THEME                VARCHAR(2048),
   CLOB                 CLOB,
   STATUS               VARCHAR2(1),
   REMARK               VARCHAR2(1),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   constraint PK_INSTATION_MAIL primary key (MAIL_ID)
);

comment on table INSTATION_MAIL is
'站内信';

comment on column INSTATION_MAIL.MAIL_ID is
'站内信编码';

comment on column INSTATION_MAIL.SENDER_ID is
'发送人';

comment on column INSTATION_MAIL.RECEIVER_ID is
'接收人';

comment on column INSTATION_MAIL.THEME is
'主题';

comment on column INSTATION_MAIL.CLOB is
'内容';

comment on column INSTATION_MAIL.STATUS is
'0：已发送（未读邮件）
1：已查看（已读邮件）
2：已删除';

comment on column INSTATION_MAIL.REMARK is
'0：普通邮件
1：星标邮件
2：重要邮件';

comment on column INSTATION_MAIL.CREATE_TIME is
'创建时间';

comment on column INSTATION_MAIL.UPDATE_TIME is
'修改时间';

/*==============================================================*/
/* Table: LINK_MAN                                              */
/*==============================================================*/
create table LINK_MAN 
(
   LINK_MAIN_ID         NUMBER(12,0)         not null,
   NAME                 VARCHAR2(256),
   SEX                  VARCHAR2(1),
   POSITION             VARCHAR2(1024),
   NICKNAME             VARCHAR2(256),
   PHONENUM             VARCHAR2(11),
   EMAIL                VARCHAR2(512),
   QQ                   NUMBER(13,0),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   REMARKS              VARCHAR2(2048),
   QR_CODE              VARCHAR2(2048),
   constraint PK_LINK_MAN primary key (LINK_MAIN_ID)
);

comment on table LINK_MAN is
'联系人';

comment on column LINK_MAN.LINK_MAIN_ID is
'联系人编码';

comment on column LINK_MAN.NAME is
'姓名';

comment on column LINK_MAN.SEX is
'性别';

comment on column LINK_MAN.POSITION is
'职位';

comment on column LINK_MAN.NICKNAME is
'尊称';

comment on column LINK_MAN.PHONENUM is
'电话';

comment on column LINK_MAN.EMAIL is
'邮箱';

comment on column LINK_MAN.QQ is
'QQ';

comment on column LINK_MAN.CREATE_TIME is
'创建时间';

comment on column LINK_MAN.UPDATE_TIME is
'更新时间';

comment on column LINK_MAN.REMARKS is
'备注';

comment on column LINK_MAN.QR_CODE is
'二维码';

/*==============================================================*/
/* Table: LOG_IN                                                */
/*==============================================================*/
create table LOG_IN 
(
   USER_ID              NUMBER(12,0)         not null,
   EMPLOYEE_ID          NUMBER(12,0),
   PASSWORD             VARCHAR2(256),
   constraint PK_LOG_IN primary key (USER_ID)
);

comment on table LOG_IN is
'登录';

comment on column LOG_IN.USER_ID is
'用户编码';

comment on column LOG_IN.EMPLOYEE_ID is
'员工编码';

comment on column LOG_IN.PASSWORD is
'用户密码';

/*==============================================================*/
/* Table: MENU                                                  */
/*==============================================================*/
create table MENU 
(
   MENU_ID              NUMBER(12,0)         not null,
   MENU_NAME            VARCHAR2(256),
   MENU_URL             VARCHAR2(1024),
   PICTURES             VARCHAR2(1024),
   STATUS               VARCHAR2(1),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   PARENT_MENU_ID       NUMBER(12,0),
   constraint PK_MENU primary key (MENU_ID)
);

comment on table MENU is
'菜单';

comment on column MENU.MENU_ID is
'菜单编码';

comment on column MENU.MENU_NAME is
'菜单名称';

comment on column MENU.MENU_URL is
'菜单路径';

comment on column MENU.PICTURES is
'图标';

comment on column MENU.STATUS is
'0：显示为菜单，
1：隐藏为权限';

comment on column MENU.CREATE_TIME is
'创建时间';

comment on column MENU.UPDATE_TIME is
'更新时间';

comment on column MENU.PARENT_MENU_ID is
'父级菜单编码';

/*==============================================================*/
/* Table: ORDERS                                                */
/*==============================================================*/
create table ORDERS 
(
   ORDER_ID             NUMBER(12,0)         not null,
   ORDER_SEQ            VARCHAR2(128),
   TITLE                VARCHAR2(512),
   CUSTOMER_ID          NUMBER(12,0),
   TOTAL_MONEY          NUMBER(8,0),
   STATUS               VARCHAR2(1),
   OPERATOR             NUMBER(12,0),
   ORDER_TIME           TIMESTAMP,
   CREATE_TIME          TIMESTAMP,
   OREDER_TYPE          VARCHAR(1),
   constraint PK_ORDERS primary key (ORDER_ID)
);

comment on table ORDERS is
'订单';

comment on column ORDERS.ORDER_ID is
'清单编码';

comment on column ORDERS.ORDER_SEQ is
'编码';

comment on column ORDERS.TITLE is
'主题';

comment on column ORDERS.CUSTOMER_ID is
'客户';

comment on column ORDERS.TOTAL_MONEY is
'总价';

comment on column ORDERS.STATUS is
'0：新建（待审核）
1：待出库
2：已出库';

comment on column ORDERS.OPERATOR is
'制单人';

comment on column ORDERS.ORDER_TIME is
'下单时间';

comment on column ORDERS.CREATE_TIME is
'创建时间';

comment on column ORDERS.OREDER_TYPE is
'1：采购单
2：销售单';

/*==============================================================*/
/* Table: ORDERS_DETAIL                                         */
/*==============================================================*/
create table ORDERS_DETAIL 
(
   DETAIL_ID            NUMBER(12)           not null,
   ORDER_ID             NUMBER(12),
   STORE_ID             NUMBER(12),
   PRODUCT_ID           NUMBER(12),
   BUY_NUMS             NUMBER(12),
   REAL_PRICES          DECIMAL,
   REAL_TOTALPRICE      DECIMAL,
   constraint PK_ORDERS_DETAIL primary key (DETAIL_ID)
);

comment on table ORDERS_DETAIL is
'订单详情';

comment on column ORDERS_DETAIL.DETAIL_ID is
'详情编码';

comment on column ORDERS_DETAIL.ORDER_ID is
'订单编码';

comment on column ORDERS_DETAIL.STORE_ID is
'仓库编码';

comment on column ORDERS_DETAIL.PRODUCT_ID is
'产品编码';

comment on column ORDERS_DETAIL.BUY_NUMS is
'购买数量';

comment on column ORDERS_DETAIL.REAL_PRICES is
'实际单价';

comment on column ORDERS_DETAIL.REAL_TOTALPRICE is
'订单价格';

/*==============================================================*/
/* Table: POSITION_MENU_RELATIONS                               */
/*==============================================================*/
create table POSITION_MENU_RELATIONS 
(
   RELATION_ID          NUMBER(12,0)         not null,
   POSITION_ID          NUMBER(12,0),
   MENU_ID              NUMBER(12,0),
   constraint PK_POSITION_MENU_RELATIONS primary key (RELATION_ID)
);

comment on table POSITION_MENU_RELATIONS is
'职位菜单关系';

comment on column POSITION_MENU_RELATIONS.RELATION_ID is
'关系编码';

comment on column POSITION_MENU_RELATIONS.POSITION_ID is
'职位编码';

comment on column POSITION_MENU_RELATIONS.MENU_ID is
'菜单编码';

/*==============================================================*/
/* Table: PROCESS                                               */
/*==============================================================*/
create table PROCESS 
(
   PROCESS_ID           NUMBER(12,0)         not null,
   TYPE                 VARCHAR2(1),
   BUSINESS_ID          NUMBER(12,0),
   STATUS               VARCHAR2(1),
   OPINIONS             VARCHAR2(512),
   OPERATOR             NUMBER(12,0),
   CREATE_TIME          TIMESTAMP,
   constraint PK_PROCESS primary key (PROCESS_ID)
);

comment on table PROCESS is
'流程';

comment on column PROCESS.PROCESS_ID is
'流程编码';

comment on column PROCESS.TYPE is
'0：采购单审核';

comment on column PROCESS.BUSINESS_ID is
'操作对象编码';

comment on column PROCESS.STATUS is
'0：审核通过
1：审核不通过';

comment on column PROCESS.OPINIONS is
'意见';

comment on column PROCESS.OPERATOR is
'操作人';

comment on column PROCESS.CREATE_TIME is
'时间';

/*==============================================================*/
/* Table: PRODUCT                                               */
/*==============================================================*/
create table PRODUCT 
(
   PRODUCT_ID           NUMBER(12,0)         not null,
   PROD_TYPE            NUMBER(4,0),
   PROD_NAME            VARCHAR2(512),
   PROD_STANDARD        VARCHAR2(512),
   COST_PRICE           NUMBER(8,0),
   RETAIL_PRICE         NUMBER(8,0),
   REMARKS              VARCHAR2(2048),
   STATUS               VARCHAR2(1),
   CREATE_TIME          TIMESTAMP,
   UPDATE_TIME          TIMESTAMP,
   constraint PK_PRODUCT primary key (PRODUCT_ID)
);

comment on table PRODUCT is
'产品';

comment on column PRODUCT.PRODUCT_ID is
'产品编码';

comment on column PRODUCT.PROD_TYPE is
'产品类型';

comment on column PRODUCT.PROD_NAME is
'产品名称';

comment on column PRODUCT.PROD_STANDARD is
'产品规格';

comment on column PRODUCT.COST_PRICE is
'成本价';

comment on column PRODUCT.RETAIL_PRICE is
'零售价';

comment on column PRODUCT.REMARKS is
'备注';

comment on column PRODUCT.STATUS is
'0：正常
1：已删除';

comment on column PRODUCT.CREATE_TIME is
'创建时间';

comment on column PRODUCT.UPDATE_TIME is
'更新时间';

/*==============================================================*/
/* Table: PRODUCT_INVENTORY                                     */
/*==============================================================*/
create table PRODUCT_INVENTORY 
(
   INVENTORY_ID         NUMBER(12,0)         not null,
   PRODUCT_ID           NUMBER(12,0),
   STORE_ID             NUMBER(12,0),
   INVENTORY            NUMBER(8,0),
   UPDATE_TIME          TIMESTAMP,
   constraint PK_PRODUCT_INVENTORY primary key (INVENTORY_ID)
);

comment on table PRODUCT_INVENTORY is
'产品库存';

comment on column PRODUCT_INVENTORY.INVENTORY_ID is
'库存编码';

comment on column PRODUCT_INVENTORY.PRODUCT_ID is
'产品编码';

comment on column PRODUCT_INVENTORY.STORE_ID is
'仓库';

comment on column PRODUCT_INVENTORY.INVENTORY is
'库存';

comment on column PRODUCT_INVENTORY.UPDATE_TIME is
'更新时间';

/*==============================================================*/
/* Table: PRODUCT_TYPE                                          */
/*==============================================================*/
create table PRODUCT_TYPE 
(
   TYPE_ID              NUMBER(4,0)          not null,
   TYPE_NAME            VARCHAR2(512),
   TYPE_DESCRIPTION     VARCHAR2(1024),
   PARENT_TYPE_ID       NUMBER(12,0),
   constraint PK_PRODUCT_TYPE primary key (TYPE_ID)
);

comment on table PRODUCT_TYPE is
'产品类型';

comment on column PRODUCT_TYPE.TYPE_ID is
'产品类型';

comment on column PRODUCT_TYPE.TYPE_NAME is
'名称';

comment on column PRODUCT_TYPE.TYPE_DESCRIPTION is
'说明';

comment on column PRODUCT_TYPE.PARENT_TYPE_ID is
'上级产品类型';

/*==============================================================*/
/* Table: SOURCE                                                */
/*==============================================================*/
create table SOURCE 
(
   SOURCE_ID            NUMBER(4,0)          not null,
   SOURCE_NAME          VARCHAR2(512),
   constraint PK_SOURCE primary key (SOURCE_ID)
);

comment on table SOURCE is
'客户来源';

comment on column SOURCE.SOURCE_ID is
'来源编码';

comment on column SOURCE.SOURCE_NAME is
'来源名称';

/*==============================================================*/
/* Table: STORE                                                 */
/*==============================================================*/
create table STORE 
(
   STORE_ID             NUMBER(12,0)         not null,
   STORE_NAME           VARCHAR2(512),
   DESCRIPTION          VARCHAR2(1024),
   constraint PK_STORE primary key (STORE_ID)
);

comment on table STORE is
'仓库';

comment on column STORE.STORE_ID is
'仓库编码';

comment on column STORE.STORE_NAME is
'仓库名称';

comment on column STORE.DESCRIPTION is
'仓库说明';

/*==============================================================*/
/* Table: TASK_USER_RELATIONS                                   */
/*==============================================================*/
create table TASK_USER_RELATIONS 
(
   RELATION_ID          NUMBER(12,0)         not null,
   TASK_ID              NUMBER(12,0),
   EMPLOYEE_ID          NUMBER(12,0),
   constraint PK_TASK_USER_RELATIONS primary key (RELATION_ID)
);

comment on table TASK_USER_RELATIONS is
'任务指定相关人员';

comment on column TASK_USER_RELATIONS.RELATION_ID is
'关系编码';

comment on column TASK_USER_RELATIONS.TASK_ID is
'任务编码';

comment on column TASK_USER_RELATIONS.EMPLOYEE_ID is
'任务指定员工';

/*==============================================================*/
/* Table: WORKING_FIELD                                         */
/*==============================================================*/
create table WORKING_FIELD 
(
   FIELD_ID             NUMBER(4,0)          not null,
   FIELD_NAME           VARCHAR2(512),
   constraint PK_WORKING_FIELD primary key (FIELD_ID)
);

comment on table WORKING_FIELD is
'所属行业';

comment on column WORKING_FIELD.FIELD_ID is
'行业编码';

comment on column WORKING_FIELD.FIELD_NAME is
'行业名称';
