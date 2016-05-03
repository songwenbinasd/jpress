package io.jpress.wechat;

public class WeixinConsts {

	public static final String TYPE_CLICK = "click"; // 点击推事件
	public static final String TYPE_VIEW = "view"; // 跳转URL
	public static final String TYPE_SCANCODE_PUSH = "scancode_push"; // 扫码推事件
	public static final String TYPE_SCANCODE_WAITMSG = "scancode_waitmsg"; // 扫码推事件且弹出“消息接收中”提示框
	public static final String TYPE_PIC_SYSPHOTO = "pic_sysphoto"; // 弹出系统拍照发图
	public static final String TYPE_PIC_PHOTO_OR_ALBUM = "pic_photo_or_album"; // 弹出拍照或者相册发图
	public static final String TYPE_PIC_WEIXIN = "pic_weixin"; // 弹出微信相册发图器
	public static final String TYPE_LOCATION_SELECT = "location_select"; // 弹出地理位置选择器

	// 以下 TYPE_MEDIA_ID 和 TYPE_VIEW_LIMITED 是专门给第三方平台旗下未微信认证
	public static final String TYPE_MEDIA_ID = "media_id"; // 下发消息（除文本消息）
	public static final String TYPE_VIEW_LIMITED = "view_limited"; // 跳转图文消息URL
	
	
	
	
	public static final int CODE_40015 = 40015; //不合法的菜单类型
	public static final int CODE_40016 = 40016; //菜单按钮数量超出限制,一级菜单最多3个,二级菜单最多5个
	public static final int CODE_40017 = 40017; //菜单按钮数量超出限制
	public static final int CODE_40018 = 40018; //"一级菜单名称长度超出限制,一级菜单最多4个汉字
	public static final int CODE_40019 = 40019; //菜单点击事件的key值长度超出限制
	public static final int CODE_40020 = 40020; //菜单URL长度超出限制
	public static final int CODE_40021 = 40021;
	public static final int CODE_40022 = 40022; //菜单级数超出限制,请确保只有两级菜单,且一级菜单不超过三个,二级菜单不超过5个
	public static final int CODE_40023 = 40023; //二级菜单数量超出限制,请确保每个一级菜单下的二级菜单不超过5个
	public static final int CODE_40024 = 40024; //菜单类型错误,请检查菜单类型是否是key和URL的其中一个
	public static final int CODE_40025 = 40025; //二级菜单名称长度超出限制,二级菜单最多7个汉字
	public static final int CODE_40026 = 40026; //二级菜单点击事件的key值长度超出限制
	public static final int CODE_40027 = 40027; //二级菜单URL长度超出限制
	
	public static final int CODE_40119 = 40119; //请确保你的公众号非个人号且已获得认证
	public static final int CODE_40120 = 40120; //请确保你的公众号非个人号且已获得认证
	

}