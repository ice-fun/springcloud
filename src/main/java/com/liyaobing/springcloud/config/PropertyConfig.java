package com.liyaobing.springcloud.config;


import com.liyaobing.springcloud.utils.MD5Utils;

public class PropertyConfig {
    public final static String JPUSH_AK = "e1e9d2e2d14e60e52612c349";
    public final static String JPUSH_SK = "d51506d33f0ace1daa1e4613";
    //老师端小程序
    public final static String TEACHER_MINI_ID = "wxb59fbd2f206a59b0";
    public final static String TEACHER_MINI_SECRET = "a9cdcc6c8df37a9608952e36a30f1fa2";

    //家长端小程序
    public final static String PARENT_MINI_ID = "wx20009411edb3d3fc";
    public final static String PARENT_MINI_SECRET = "a685cbd4c8638828ef52669491bb34b8";

    //腾讯云短信
    public final static Integer TECENT_MSG_APP_ID = 1400100051;
    public final static String TECENT_MSG_APP_KEY = "b6806b131ba3c97ae92ddd04abd7366b";

    //腾讯云直播
    public final static String TECENT_LIVE_PUSH_DOMAIN = "livepush.aibeijiayuan.com";
    public final static String TECENT_LIVE_PLAY_DOMAIN = "liveplay.aibeijiayuan.com";
    public final static String TECENT_LIVE_PUSH_KEY = "fg4h684b3d1hdfh6fy9";
    public final static String TECENT_LIVE_PLAY_KEY = "ert456df4gdfg4fdg456";

    //公众号  https://api.aibeijiayuan.com/kindergarten/gzh/index
    public final static String WECHAT_OFFICIAL_ACCOUNTS_APP_ID = "wx69a4fe32bc31cbec";//wxbc71390a3ecec14b
    public final static String WECHAT_OFFICIAL_ACCOUNTS_APP_SECRET = "d6c00c4e0bb8eccd7de4c3be6a51d108";//27746a41e897dd7e6aa605d7062a75d7
    public final static String WECHAT_OFFICIAL_ACCOUNTS_TOKEN = "aibei";//zhjgzh
    public final static String WECHAT_OFFICIAL_ACCOUNTS_ASE_KEY = "0nyyz0ZnoDOTvCUOlJ00xJeOl1pLnB4NdQqBGuXzMer";//wZR6xI8lvMVUyupkSXmeHqHmTMhmA0kB22bSH0SMNCU

    // 微信商户号
    public static final String MCH_ID = "1579252951"; // 云链校园
    public static final String MCH_APP_KEY = "zImMKgswLQY2cV7fJAMC6Uzwu8e5kP5w";

    // 短信收费商户号（秒知科技）
    public static final String MASTER_MCH_ID = "1531687461"; // 秒知信息科技
    public static final String MASTER_MCH_APP_KEY = "guangzhoumiaozhixinxikeji2020718";


    //角色权限
    public final static String ROLE_ADMIN = "ROLE_ADMIN";  // 集中平台管理员
    public final static String ROLE_MANAGER = "ROLE_MANAGER";  // 幼儿园管理人
    public final static String ROLE_TEACHER = "ROLE_TEACHER";   // 教师
    public final static String ROLE_PARENT = "ROLE_PARENT";  // 家长
    public final static String ROLE_LOGISTICS = "ROLE_LOGISTICS"; // 后勤
    public final static String ROLE_VISITOR = "ROLE_VISITOR"; // 游客
    public final static String ROLE_DEVICE = "ROLE_DEVICE"; // 游客
    public final static String[] ROLES = {ROLE_ADMIN, ROLE_MANAGER, ROLE_TEACHER, ROLE_PARENT, ROLE_LOGISTICS, ROLE_VISITOR, ROLE_DEVICE};

    public final static Integer KINDERGARTEN_STATUS_OPEN = 1; // 开园
    public final static Integer KINDERGARTEN_STATUS_CLOSE = 2; // 退园

    public final static String ADMIN_DEFAULT_PASSWORD = MD5Utils.md5Decode32WithSalt("88888888");

    public final static Integer CARD_STATUS_BLANK = 1; // 空白卡
    public final static Integer CARD_STATUS_BOUND_SCHOOL = 2; // 已绑学校
    public final static Integer CARD_STATUS_BOUND_USER = 3; // 已绑定人员
    public final static Integer CARD_STATUS_LOSS = 4; // 已挂失
    public final static Integer CARD_STATUS_DESTROY = 5; // 已销毁

    public final static Integer ATTENDANCE_DATE_STATUS_SCHOOL_DAY = 1;// 课堂日
    public final static Integer ATTENDANCE_DATE_STATUS_HOLIDAY = 2;// 假日

    public final static Integer CLOCK_TYPE_ENTER = 1;// 打卡进园
    public final static Integer CLOCK_TYPE_LEAVE = 2;// 打卡出园

    public final static Integer ATTENDANCE_DAY_STATUS_ON_DUTY = 1; // 出勤
    public final static Integer ATTENDANCE_DAY_STATUS_HOLIDAY = 2; // 休息
    public final static Integer ATTENDANCE_DAY_STATUS_ASK_FOR_LEAVE = 3;  // 请假
    public final static Integer ATTENDANCE_DAY_STATUS_OFF_DUTY = 4; // 缺勤
    public final static Integer ATTENDANCE_DAY_STATUS_BLANK = 5; // 空白

    public final static int ON_DUTY = 1;
    public final static int HOLIDAY = 2;
    public final static int ASK_FOR_LEAVE = 3;
    public final static int OFF_DUTY = 4;


    public final static Integer TEACHER_STATUS_IN = 1; // 教师状态  在职
    public final static Integer TEACHER_STATUS_LEAVE = 2; // 教师状态  离职

    public final static Integer CHILD_STATUS_IN = 1; // 学生状态 在校
    public final static Integer CHILD_STATUS_GRADUATE = 2; // 毕业
    public final static Integer CHILD_STATUS_QUIT = 3; // 退园

    //    直播状态
    public final static Integer LIVE_STATUS_NOT_START = 1;
    public final static Integer LIVE_STATUS_START = 2;
    public final static Integer LIVE_STATUS_PAUSE = 3;
    public final static Integer LIVE_STATUS_END = 4;

    public final static Integer TRUE = 1;
    public final static Integer FALSE = 0;

    public final static Integer PUSH_STATUS_NEVER_PUSH = 0;
    public final static Integer PUSH_STATUS_PUSHED = 0;

    public final static int MOMENT_TYPE_MOMENT = 1; // 动态
    public final static int MOMENT_TYPE_RECIPES = 2; // 食谱
    public final static int MOMENT_TYPE_WORKS = 3;  // 作品
    public final static int MOMENT_TYPE_TASK = 4;  // 作业

    public final static Integer[] MOMENT_PUSH_LIST = {MOMENT_TYPE_RECIPES, MOMENT_TYPE_TASK};

    public final static Integer PLAN_THIS_WEEK = 1;
    public final static Integer PLAN_NEXT_WEEK = 2;

    public final static Integer PLAN_STATUS_NEW = 1;  // 新发布的
    public final static Integer PLAN_STATUS_CHANGE = 2; // 下周转为本周
    public final static Integer PLAN_STATUS_EXPIRE = 3; // 过期的

    public final static Integer ASK_FOR_LEAVE_STATUS_PENDING = 1;//待审核
    public final static Integer ASK_FOR_LEAVE_STATUS_ACCEPT = 2;//已批准
    public final static Integer ASK_FOR_LEAVE_STATUS_REJECT = 3;//已拒绝
    public final static Integer ASK_FOR_LEAVE_STATUS_EXPIRED = 4;//已过期

    public static final int CLOCK_WAY_CARD = 1;
    public static final int CLOCK_WAY_FACE = 2;

    public static final Integer TYPE_STUDENT = 1;
    public static final Integer TYPE_TEACHER = 2;

    public static final int UPDATE_TYPE_ADD = 1;
    public static final int UPDATE_TYPE_EDIT = 2;
    public static final int UPDATE_TYPE_DELETE = 3;

    public static final Integer PAY_STATUS_NO_PAY = 1;
    public static final Integer PAY_STATUS_PAID = 2;
    public static final Integer PAY_STATUS_REFUNDING = 3;
    public static final Integer PAY_STATUS_REFUND = 4;

    public static final Integer PAY_WAY_ONLINE = 1;
    public static final Integer PAY_WAY_OFFLINE = 2;

    // 每日绩效 加分类型
    public static final int OPERATION_TYPE_INDEX = 1;  // 首页(登录)
    public static final int OPERATION_TYPE_MOMENT_TEXT = 2;  // 发图文动态
    public static final int OPERATION_TYPE_MOMENT_VIDEO = 3;  // 发视频动态
    public static final int OPERATION_TYPE_COMMENT = 4;  // 评论/回复
    public static final int OPERATION_TYPE_WORK = 5;  // 发布作业
    public static final int OPERATION_TYPE_RECIPES = 6;  // 发布食谱
    public static final int OPERATION_TYPE_NOTICE = 7;  // 发布通知
    public static final int OPERATION_TYPE_LIKE = 8;  // 点赞

    public static final int BANNER_POSITION_PARENT_INDEX = 1;
    public static final int BANNER_POSITION_TEACHER_INDEX = 2;

    // 通知类型
    public static final Integer NOTICE_TYPE_NOTICE = 1;
    public static final Integer NOTICE_TYPE_SIGN = 2;
    public static final Integer NOTICE_TYPE_VOTE = 3;

    // 通知类型
    public static final Integer JOIN_STATUS_BLANK = 1;
    public static final Integer JOIN_STATUS_NO = 2;
    public static final Integer JOIN_STATUS_YES = 3;
}
