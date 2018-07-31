package test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import me.chanjar.weixin.common.util.json.WxGsonBuilder;

import org.apache.http.entity.ContentType;
import org.jboss.logging.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;


public class test {
	private static Logger logger = Logger.getLogger(test.class);

	public static void main(String[] args) {

		try {

			// 统计接口调用
//			Map<String, String> reqMap = new HashMap<>();
//			reqMap.put("begin_date", "2017-10-28");
//.put("end_date", "2017-10-28");
//			String result = HttpClientUtils
//				.simplePostBody(
//					"https://api.weixin.qq.com/datacube/getarticletotal?access_token=10_w4RGiNmLeAHAIR5YzEIxV2L7BiR_Q6MupaBoh8JkqS8MiMV9IQvAOUnTYJN0E0GqyLG7676IXYVbPPV342_rfH6rEg0LABVcjyQmnyvQl6dbw40rZfMgARGEJjTJktEkBiLUYoN-C-Z9tOPkFPIhAIAWGZ",
//					"{\"begin_date\": \"2018-05-17\",\"end_date\": \"2018-05-17\"");
、			
//			String result = HttpClientUtils
//				.simplePostBody(
//					"https://api.weixin.qq.com/datacube/getarticletotal?access_token=10_YCCseC2iLqck-K1L0TB0jRGzg70cDpiAhd4OvjyxTFOv7B6130HrNdhMCKS8vhdM6hsxCvp6vHOTnIIBbdvAY29sZGbWC99e9NEF6otk64gzVyW6q7_73WKqLYcGov0TLRfFzI9cvSrngmExGKIfAGAAEC",
//					"{\"begin_date\": \"2018-05-16\",\"end_date\": \"2018-05-16\"");

//    创建二维码			
//			String result = HttpClientUtils
//			.simplePostBody(
//				"https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=10_w4RGiNmLeAHAIR5YzEIxV2L7BiR_Q6MupaBoh8JkqS8MiMV9IQvAOUnTYJN0E0GqyLG7676IXYVbPPV342_rfH6rEg0LABVcjyQmnyvQl6dbw40rZfMgARGEJjTJktEkBiLUYoN-C-Z9tOPkFPIhAIAWGZ",
//				"{\"expire_seconds\": 3600, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\": 123}}}");
//			System.out.println(new String(result.getBytes("ISO-8859-1"), "UTF-8"));
			// 创建卡券
			JSONObject te=JSON.parseObject("{\"card\":{\"card_type\":\"GENERAL_COUPON\",\"general_coupon\":{\"base_info\":{\"logo_url\":\"http://mmbiz.qpic.cn/mmbiz/iaL1LJM1mF9aRKPZJkmG8xXhiaHqkKSVMMWeN3hLut7X7hicFNjakmxibMLGWpXrEXB33367o7zHN0CwngnQY7zb7g/0\",\"brand_name\":\"山西联通\",\"code_type\":\"CODE_TYPE_QRCODE\",\"title\":\"100M流量券\",\"color\":\"Color010\",\"notice\":\"111\",\"service_phone\":\"222\",\"description\":\"333\",\"date_info\":{\"type\":\"DATE_TYPE_FIX_TERM\",\"fixed_term\":90,\"fixed_begin_term\":0},\"sku\":{\"quantity\":500000},\"use_limit\":9999,\"get_limit\":9999,\"use_custom_code\":false,\"bind_openid\":false,\"can_share\":false,\"can_give_friend\":true,\"use_all_locations\":true,\"center_title\":\"立即使用\",\"center_sub_title\":\"\",\"center_url\":\"www.qq.com\",\"custom_url_name\":\"立即使用\",\"custom_url\":\"http://www.qq.com\",\"custom_url_sub_title\":\"\",\"promotion_url_name\":\"立即使用\",\"promotion_url\":\"http://www.qq.com\",\"source\":\" \"},\"advanced_info\":{},\"default_detail\":\"兑换100M流量\"}}}");
			 String result = HttpClientUtils
			 .simplePostBody(
			 "https://api.weixin.qq.com/card/create?access_token=",te.toJSONString());
		    System.out.println(new String(result.getBytes("UTF-8"), "UTF-8"));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
