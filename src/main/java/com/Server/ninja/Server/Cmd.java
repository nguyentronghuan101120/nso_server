 package com.Server.ninja.Server;

public class Cmd {
    protected static final byte LOGIN = -127;
    protected static final byte REGISTER = -126;
    protected static final byte CLIENT_INFO = -125;
    protected static final byte SEND_SMS = -124;
    protected static final byte REGISTER_IMEI = -123;
    protected static final byte LOGIN0 = 0;
    protected static final byte REGISTER0 = 1;
    protected static final byte CLEAR_RMS = 2;
    protected static final byte FORGET_PASS = -122;
    protected static final byte FORGET_PASS_IMEI = -121;
    protected static final byte CHECK_KEY1 = -76;
    protected static final byte CHECK_KEY2 = -75;
    protected static final byte CHECK_KEY4 = -73;
    protected static final byte LAT_HINH = -72;
    protected static final byte CLEAR_TRANSACTION_ID = -71;
    protected static final byte MOI_GTC = -70;
    protected static final byte MOI_TATCA_GTC = -69;
    protected static final byte GO_GTCHIEN = -68;
    protected static final byte LOGOUT = -127;
    protected static final byte SELECT_PLAYER = -126;
    protected static final byte CREATE_PLAYER = -125;
    protected static final byte DELETE_PLAYER = -124;
    protected static final byte UPDATE_VERSION = -123;
    protected static final byte UPDATE_DATA = -122;
    protected static final byte UPDATE_MAP = -121;
    protected static final byte UPDATE_SKILL = -120;
    protected static final byte UPDATE_ITEM = -119;
    protected static final byte UPDATE_VERSION_OK = -118;
    protected static final byte UPDATE_PK = -117;
    protected static final byte UPDATE_OUT_CLAN = -116;
    protected static final byte REQUEST_ICON = -115;
    protected static final byte REQUEST_CLAN_LOG = -114;
    protected static final byte REQUEST_CLAN_INFO = -113;
    protected static final byte REQUEST_CLAN_MEMBER = -112;
    protected static final byte REQUEST_CLAN_ITEM = -111;
    protected static final byte REQUEST_SKILL = -110;
    protected static final byte REQUEST_MAPTEMPLATE = -109;
    protected static final byte REQUEST_MOBTEMPLATE = -108;
    protected static final byte REQUEST_NPCPLAYER = -107;
    protected static final byte ME_LOAD_ACTIVE = -106;
    protected static final byte ME_ACTIVE = -105;
    protected static final byte ME_UPDATE_ACTIVE = -104;
    protected static final byte ME_OPEN_LOCK = -103;
    protected static final byte ME_CLEAR_LOCK = -102;
    protected static final byte CLIENT_OK = -101;
    protected static final byte CLIENT_OK_INMAP = -100;
    protected static final byte INPUT_CARD = -99;
    protected static final byte CLEAR_TASK = -98;
    protected static final byte CHANGE_NAME = -97;
    protected static final byte CREATE_CLAN = -96;
    protected static final byte CLAN_CHANGE_ALERT = -95;
    protected static final byte CLAN_CHANGE_TYPE = -94;
    protected static final byte CLAN_MOVEOUT_MEM = -93;
    protected static final byte CLAN_OUT = -92;
    protected static final byte CLAN_UP_LEVEL = -91;
    protected static final byte INPUT_COIN_CLAN = -90;
    protected static final byte OUTPUT_COIN_CLAN = -89; // rút quỹ
    protected static final byte CONVERT_UPGRADE = -88;
    protected static final byte INVITE_CLANDUN = -87;
    protected static final byte NOT_USEACC = -86;
    protected static final byte ITEM_SPLIT = -85;
    protected static final byte POINT_PB = -84;
    protected static final byte REVIEW_PB = -83;
    protected static final byte REWARD_PB = -82;
    protected static final byte CHIENTRUONG_INFO = -81;
    protected static final byte REVIEW_CT = -80;
    protected static final byte REWARD_CT = -79;
    protected static final byte CHAT_ADMIN = -78;
    protected static final byte CHANGE_BG_ID = -77;
    protected static final byte OAN_HON = -67;
    protected static final byte OAN_HON1 = -66;
    protected static final byte NAP_NOKIA = -65;
    protected static final byte GET_PASS2 = -64;
    protected static final byte NAP_GOOGLE = -63;
    protected static final byte OPEN_CLAN_ITEM = -62;
    protected static final byte CLAN_SEND_ITEM = -61;
    protected static final byte CLAN_USE_ITEM = -60;
    protected static final byte GPS = -59;
    protected static final byte ME_LOAD_ALL = -127;
    protected static final byte ME_LOAD_CLASS = -126;
    protected static final byte ME_LOAD_SKILL = -125;
    protected static final byte ME_LOAD_LEVEL = -124;
    protected static final byte ME_LOAD_INFO = -123;
    protected static final byte ME_LOAD_HP = -122;
    protected static final byte ME_LOAD_MP = -121;
    protected static final byte PLAYER_LOAD_ALL = -120;
    protected static final byte PLAYER_LOAD_INFO = -119;
    protected static final byte PLAYER_LOAD_LEVEL = Byte.MIN_VALUE;
    protected static final byte PLAYER_LOAD_VUKHI = -117;
    protected static final byte PLAYER_LOAD_AO = -116;
    protected static final byte PLAYER_LOAD_QUAN = -113;
    protected static final byte PLAYER_LOAD_BODY = -112;
    protected static final byte PLAYER_LOAD_HP = -111;
    protected static final byte PLAYER_LOAD_LIVE = -110;
    protected static final byte POTENTIAL_UP = -109;
    protected static final byte SKILL_UP = -108;
    protected static final byte BAG_SORT = -107;
    protected static final byte BOX_SORT = -106;
    protected static final byte BOX_COIN_IN = -105;
    protected static final byte BOX_COIN_OUT = -104;
    protected static final byte REQUEST_ITEM = -103;
    protected static final byte USE_BOOK_SKILL = -102;
    protected static final byte ME_ADD_EFFECT = -101;
    protected static final byte ME_EDIT_EFFECT = -100;
    protected static final byte ME_REMOVE_EFFECT = -99;
    protected static final byte PLAYER_ADD_EFFECT = -98;
    protected static final byte PLAYER_EDIT_EFFECT = -97;
    protected static final byte PLAYER_REMOVE_EFFECT = -96;
    protected static final byte MAP_TIME = -95;
    protected static final byte NPC_PLAYER_UPDATE = -94;
    protected static final byte CHANGE_TYPE_PK = -93;
    protected static final byte UPDATE_TYPE_PK = -92;
    protected static final byte UPDATE_BAG_COUNT = -91;
    protected static final byte TASK_FOLLOW_FAIL = -90;
    protected static final byte END_WAIT = -89;
    protected static final byte CREATE_PARTY = -88;
    protected static final byte CHANGE_TEAMLEADER = -87;
    protected static final byte MOVE_MEMBER = -86;
    protected static final byte REQUEST_FRIEND = -85;
    protected static final byte REQUEST_ENEMIES = -84;
    protected static final byte FRIEND_REMOVE = -83;
    protected static final byte ENEMIES_REMOVE = -82;
    protected static final byte ME_UPDATE_PK = -81;
    protected static final byte ITEM_BODY_CLEAR = -80;
    protected static final byte BUFF_LIVE = -79;
    protected static final byte CALL_EFFECT_ME = -78;
    protected static final byte FIND_PARTY = -77;
    protected static final byte LOCK_PARTY = -76;
    protected static final byte ITEM_BOX_CLEAR = -75;
    protected static final byte SHOW_WAIT = -74;
    protected static final byte CALL_EFFECT_NPC = -73;
    protected static final byte ME_LOAD_GOLD = -72;
    protected static final byte ME_UP_GOLD = -71;
    protected static final byte ADMIN_MOVE = -70;
    protected static final byte ME_LOAD_THU_NUOI = -69;
    protected static final byte PLAYER_LOAD_THU_NUOI = -68;
    protected static final byte SAVE_RMS = -67;
    protected static final byte LOAD_RMS = -65;
    protected static final byte PLAYER_LOAD_MAT_NA = -64;
    protected static final byte CLAN_INVITE = -63;
    protected static final byte CLAN_ACCEPT_INVITE = -62;
    protected static final byte CLAN_PLEASE = -61;
    protected static final byte CLAN_ACCEPT_PLEASE = -60;
    protected static final byte REFRESH_HP = -59;
    protected static final byte CALL_EFFECT_BALL = -58;
    protected static final byte CALL_EFFECT_BALL_1 = -57;
    protected static final byte PLAYER_LOAD_AO_CHOANG = -56;
    protected static final byte PLAYER_LOAD_GIA_TOC = -55;
    protected static final byte LOAD_THU_CUOI = -54;
    protected static final byte FULL_SIZE = -32;
    protected static final byte KEY_WINPHONE = -31;
    protected static final byte SUB_COMMAND = -30;
    protected static final byte NOT_LOGIN = -29;
    protected static final byte NOT_MAP = -28;
    protected static final byte GET_SESSION_ID = -27;
    protected static final byte SERVER_DIALOG = -26;
    protected static final byte SERVER_ALERT = -25;
    protected static final byte SERVER_MESSAGE = -24;
    protected static final byte CHAT_MAP = -23;
    protected static final byte CHAT_PRIVATE = -22;
    protected static final byte CHAT_SERVER = -21;
    protected static final byte CHAT_PARTY = -20;
    protected static final byte CHAT_CLAN = -19;
    protected static final byte MAP_INFO = -18;
    protected static final byte MAP_CHANGE = -17;
    protected static final byte MAP_CLEAR = -16;
    protected static final byte ITEMMAP_REMOVE = -15;
    protected static final byte ITEMMAP_MYPICK = -14;
    protected static final byte ITEMMAP_PLAYERPICK = -13;
    protected static final byte ME_THROW = -12;
    protected static final byte ME_DIE = -11;
    protected static final byte ME_LIVE = -10;
    protected static final byte ME_BACK = -9;
    protected static final byte ME_UP_COIN_LOCK = -8;
    protected static final byte ME_CHANGE_COIN = -7;
    protected static final byte PLAYER_THROW = -6;
    protected static final byte NPC_LIVE = -5;
    protected static final byte NPC_DIE = -4;
    protected static final byte NPC_ATTACK_ME = -3;
    protected static final byte NPC_ATTACK_PLAYER = -2;
    protected static final byte NPC_HP = -1;
    protected static final byte PLAYER_DIE = 0;
    protected static final byte PLAYER_MOVE = 1;
    protected static final byte PLAYER_REMOVE = 2;
    protected static final byte PLAYER_ADD = 3;
    protected static final byte PLAYER_ATTACK_N_P = 4;
    protected static final byte PLAYER_UP_EXP = 5;
    protected static final byte ITEMMAP_ADD = 6;
    protected static final byte ITEM_BAG_REFRESH = 7;
    protected static final byte ITEM_BAG_ADD = 8;
    protected static final byte ITEM_BAG_ADD_QUANTITY = 9;
    protected static final byte ITEM_BAG_CLEAR = 10;
    protected static final byte ITEM_USE = 11;
    protected static final byte ITEM_USE_CHANGEMAP = 12;
    protected static final byte ITEM_BUY = 13;
    protected static final byte ITEM_SALE = 14;
    protected static final byte ITEM_BODY_TO_BAG = 15;
    protected static final byte ITEM_BOX_TO_BAG = 16;
    protected static final byte ITEM_BAG_TO_BOX = 17;
    protected static final byte ITEM_USE_UPTOUP = 18;
    protected static final byte UPPEARL = 19;
    protected static final byte UPPEARL_LOCK = 20;
    protected static final byte UPGRADE = 21;
    protected static final byte SPLIT = 22;
    protected static final byte PLEASE_INPUT_PARTY = 23;
    protected static final byte ACCEPT_PLEASE_PARTY = 24;
    protected static final byte REQUEST_PLAYERS = 25;
    protected static final byte UPDATE_ACHIEVEMENT = 26;
    protected static final byte MOVE_FAST_NPC = 27;
    protected static final byte ZONE_CHANGE = 28;
    protected static final byte MENU = 29;
    protected static final byte OPEN_UI = 30;
    protected static final byte OPEN_UI_BOX = 31;
    protected static final byte OPEN_UI_PT = 32;
    protected static final byte OPEN_UI_SHOP = 33;
    protected static final byte OPEN_MENU_ID = 34;
    protected static final byte OPEN_UI_COLLECT = 35;
    protected static final byte OPEN_UI_ZONE = 36;
    protected static final byte OPEN_UI_TRADE = 37;
    protected static final byte OPEN_UI_SAY = 38;
    protected static final byte OPEN_UI_CONFIRM = 39;
    protected static final byte OPEN_UI_MENU = 40;
    protected static final byte SKILL_SELECT = 41;
    protected static final byte REQUEST_ITEM_INFO = 42;
    protected static final byte TRADE_INVITE = 43;
    protected static final byte TRADE_INVITE_ACCEPT = 44;
    protected static final byte TRADE_LOCK_ITEM = 45;
    protected static final byte TRADE_ACCEPT = 46;
    protected static final byte TASK_GET = 47;
    protected static final byte TASK_NEXT = 48;
    protected static final byte TASK_FINISH = 49;
    protected static final byte TASK_UPDATE = 50;
    protected static final byte NPC_MISS = 51;
    protected static final byte RESET_POINT = 52;
    protected static final byte ALERT_MESSAGE = 53;
    protected static final byte ALERT_OPEN_WEB = 54;
    protected static final byte ALERT_SEND_SMS = 55;
    protected static final byte TRADE_INVITE_CANCEL = 56;
    protected static final byte TRADE_CANCEL = 57;
    protected static final byte TRADE_OK = 58;
    protected static final byte FRIEND_INVITE = 59;
    protected static final byte PLAYER_ATTACK_NPC = 60;
    protected static final byte PLAYER_ATTACK_PLAYER = 61;
    protected static final byte HAVE_ATTACK_PLAYER = 62;
    protected static final byte OPEN_UI_NEWMENU = 63;
    protected static final byte MOVE_FAST = 64;
    protected static final byte TEST_INVITE = 65;
    protected static final byte TEST_INVITE_ACCEPT = 66;
    protected static final byte TEST_END = 67;
    protected static final byte ADD_CUU_SAT = 68;
    protected static final byte ME_CUU_SAT = 69;
    protected static final byte CLEAR_CUU_SAT = 70;
    protected static final byte PLAYER_UP_EXPDOWN = 71;
    protected static final byte ME_DIE_EXP_DOWN = 72;
    protected static final byte PLAYER_ATTACK_P_N = 73;
    protected static final byte USE_SKILL_MY_BUFF = 74;
    protected static final byte CREATE_BUNHIN = 75;
    protected static final byte NPC_ATTACK_BUNHIN = 76;
    protected static final byte CLEAR_BUNHIN = 77;
    protected static final byte NPC_CHANGE = 78;
    protected static final byte PARTY_INVITE = 79;
    protected static final byte PARTY_ACCEPT = 80;
    protected static final byte PARTY_CANCEL = 81;
    protected static final byte PLAYER_IN_PARTY = 82;
    protected static final byte PARTY_OUT = 83;
    protected static final byte FRIEND_ADD = 84;
    protected static final byte NPC_IS_DISABLE = 85;
    protected static final byte NPC_IS_MOVE = 86;
    protected static final byte ThuNuoi_ATTACK = 87;
    protected static final byte RETURN_POINT_MAP = 88;
    protected static final byte NPC_IS_FIRE = 89;
    protected static final byte NPC_IS_ICE = 90;
    protected static final byte NPC_IS_WIND = 91;
    protected static final byte OPEN_TEXT_BOX_ID = 92;
    protected static final byte VIEW_INFO = 93;
    protected static final byte REQUEST_ITEM_PLAYER = 94;
    protected static final byte ME_UP_COIN_BAG = 95;
    protected static final byte GET_TASK_ORDER = 96;
    protected static final byte GET_TASK_UPDATE = 97;
    protected static final byte CLEAR_TASK_ORDER = 98;
    protected static final byte TEST_DUN_INVITE = 99;
    protected static final byte TEST_DUN_LIST = 100;
    protected static final byte VIEW_INFO1 = 101;
    protected static final byte SEND_ITEM_TO_AUCTION = 102;
    protected static final byte LOAD_ITEM_AUCTION = 103;
    protected static final byte VIEW_ITEM_AUCTION = 104;
    protected static final byte BUY_ITEM_AUCTION = 105;
    protected static final byte TEST_GT_INVITE = 106;
    protected static final byte OPEN_UI_CONFIRM_ID = 107;
    protected static final byte ITEM_MON_TO_BAG = 108;
    protected static final byte OPEN_UI_MENU1 = 109;
    protected static final byte LUYEN_THACH = 110;
    protected static final byte TINH_LUYEN = 111;
    protected static final byte DOI_OPTION = 112;
    protected static final byte CAT_KEO = 113;
    protected static final byte NV_BIAN = 114;
    protected static final byte UPDATE_INFO_ME = 115;
    protected static final byte UPDATE_INFO_CHAR = 116;
    protected static final byte MAP_ITEM = 117;
    protected static final byte COMFIRM_ACCOUNT = 118;
    protected static final byte AUTO_ATTACK_MOVE = 119;
    protected static final byte DOI_MAT_KHAU = 120;
    protected static final byte RANKED_MATCH = 121;
    protected static final byte SERVER_ADD_MOB = 122;
    protected static final byte info_kiemduyet = 123;
    protected static final byte NGOCKHAM = 124;
    protected static final byte GET_EFFECT = 125;
    protected static final byte GIAODO = 126;
}
