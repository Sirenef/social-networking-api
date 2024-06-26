package com.social.networking.api.constant;

public class SocialNetworkingConstant {
    public static final String REGION_STATIC = "ap-southeast-1";
    public static final String OTP_SUBJECT_EMAIL = "One-Time Password (OTP) - Expire in 5 minutes!";
    public static final long OTP_VALID_DURATION = 300000; // 5 minutes
    public static final Integer OTP_LENGTH = 6;
    public static final Integer ATTEMPT_CODE_START = 1;
    public static final Integer ATTEMPT_CODE_MAX = 3;
    /**
     * Date format constant
     */
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    /**
     * Security Constant for grant type
     */
    public static final String GRANT_TYPE_PASSWORD = "password";
    public static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
    public static final String GRANT_TYPE_GOOGLE = "google";

    /**
     * Account kind constant
     */
    public static final Integer ACCOUNT_KIND_ADMIN = 1;
    public static final Integer ACCOUNT_KIND_USER = 2;
    public static final Integer ACCOUNT_KIND_EXPERT = 3;

    /**
     * Status constant
     */
    public static final Integer STATUS_ACTIVE = 1;
    public static final Integer STATUS_SEEN = 2;
    public static final Integer STATUS_PENDING = 0;
    public static final Integer STATUS_LOCK = -1;
    public static final Integer STATUS_DELETE = -2;
    public static final Integer STATUS_RESTRICT = -3;

    /**
     * Post kind constant
     */
    public static final Integer POST_KIND_NORMAL = 1;
    public static final Integer POST_KIND_FORUM = 2;

    /**
     * Privacy constant
     */
    public static final Integer PRIVACY_PUBLIC = 1;
    public static final Integer PRIVACY_PRIVATE = 2;

    /**
     * Comment depth constant
     */
    public static final Integer COMMENT_DEPTH_LEVEL_1 = 1;
    public static final Integer COMMENT_DEPTH_LEVEL_2 = 2;

    /**
     * Reaction kind constant
     */
    public static final Integer REACTION_KIND_LOVE = 1;
    public static final Integer REACTION_KIND_LIKE = 2;
    public static final Integer REACTION_KIND_HAHA = 3;
    public static final Integer REACTION_KIND_WOW = 4;
    public static final Integer REACTION_KIND_SAD = 5;
    public static final Integer REACTION_KIND_ANGRY = 6;

    /**
     * Category kind constant
     */
    public static final Integer CATEGORY_KIND_HOSPITAL = 1;
    public static final Integer CATEGORY_KIND_HOSPITAL_ROLE = 2;
    public static final Integer CATEGORY_KIND_DEPARTMENT = 3;
    public static final Integer CATEGORY_KIND_ACADEMIC_DEGREE = 4;
    public static final Integer CATEGORY_KIND_COMMUNITY = 5;
    public static final Integer CATEGORY_KIND_TOPIC = 6;

    /**
     * Notification kind constant
     */
    public static final Integer NOTIFICATION_KIND_NEW_POST_OF_FOLLOWING = 1;
    public static final Integer NOTIFICATION_KIND_COMMENT_IN_MY_POST = 2;
    public static final Integer NOTIFICATION_KIND_REACTION_MY_POST = 3;
    public static final Integer NOTIFICATION_KIND_REACTION_MY_COMMENT = 4;
    public static final Integer NOTIFICATION_KIND_NEW_FOLLOWER = 5;
    public static final Integer NOTIFICATION_KIND_COURSE_APPROVED = 6;
    public static final Integer NOTIFICATION_KIND_TAGGED_IN_COMMENT = 7;
    public static final Integer NOTIFICATION_KIND_REPLIED_MY_COMMENT = 8;
    public static final Integer NOTIFICATION_KIND_NEW_POST_IN_COMMUNITY = 9;

    /**
     * Notification state constant
     */
    public static final Integer NOTIFICATION_STATE_SENT = 0;
    public static final Integer NOTIFICATION_STATE_READ = 1;

    /**
     * Report kind constant
     */
    public static final Integer REPORT_KIND_POST = 1;
    public static final Integer REPORT_KIND_COMMENT = 2;
    public static final Integer REPORT_KIND_ACCOUNT = 3;

    /**
     * Provider constant
     */
    public static final String PROVIDER_FACEBOOK = "facebook";
    public static final String PROVIDER_GOOGLE = "google";

    /**
     * Conversation kind constant
     */
    public static final Integer CONVERSATION_KIND_PRIVATE = 1;
    public static final Integer CONVERSATION_KIND_GROUP = 2;

    /**
     * Community Member kind constant
     */
    public static final Integer COMMUNITY_MEMBER_KIND = 0;
    public static final Integer COMMUNITY_ADMIN_KIND = 1;

    /**
     * Course Money History state constant
     */
    public static final Integer COURSE_MONEY_HISTORY_STATE_PENDING = 0;
    public static final Integer COURSE_MONEY_HISTORY_STATE_SUCCESS = 1;
    public static final Integer COURSE_MONEY_HISTORY_STATE_FAILED = -1;
    public static final Integer COURSE_MONEY_HISTORY_STATE_CANCEL = -2;

    private SocialNetworkingConstant() {
        throw new IllegalStateException("Utility class");
    }
}
