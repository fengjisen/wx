package cn.evafjs.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.evafjs.constant.Constant;
import cn.evafjs.utils.AccessTokenUtil;
import cn.evafjs.utils.WeixinUtil;
import cn.evafjs.weixin.domain.WeixinMenu;
import net.sf.json.JSONObject;

public class AccessTokenTest {
	@Test
	public void testGetAT(){
		
		AccessTokenUtil.getAccessToken(Constant.APPID, Constant.APPSECRET);
	}
	@Test
	public void testAddMenu(){
		String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+AccessTokenUtil.getAccessToken(Constant.APPID, Constant.APPSECRET).getAccess_token();
		List<WeixinMenu> wms = new ArrayList<WeixinMenu>();
		WeixinMenu wm1 = new WeixinMenu();
		wm1.setId(1);
		wm1.setName("ֱ�ӹ���");
		wm1.setType("click");
		wm1.setUrl("http://f74da6c1.ngrok.io/wx/index");
		wms.add(wm1);
		Map<String,List<WeixinMenu>> maps = new HashMap<String,List<WeixinMenu>>();
		maps.put("button",wms);
		JSONObject json = JSONObject.fromObject(maps);
		System.out.println(json.toString());
		WeixinUtil.sendPost(url, json.toString(), "application/json");
	}
	@Test
	public void testWeixinAuth() throws UnsupportedEncodingException{
		String uri = URLEncoder.encode("www.evafjs.cn", "utf-8");
		String url  = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=="+Constant.APPID+"&redirect_uri="
		+uri+"&response_type=code&scope=SCOPE&state="+"java123"+"#wechat_redirect";
		String str = WeixinUtil.sendGet(url);
		System.out.println(str);
	}
	@Test
	public void testGetPic(){
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx67209d4e99e8a478&redirect_uri=http%3A%2F%2Fwww.aysmart.com%2Fyuexiangshenghuo%2Fweixin_router%2Findex.php&response_type=code&scope=snsapi_userinfo&state=yuexiangenjoy;weixin_online_shop&connect_redirect=1#wechat_redirect";
		String url1 = "http://www.aysmart.com/yuexiangshenghuo/weixin_web01_merchandise_single_all/?script_case_init=3802&script_case_session=3njua5pq2odc1n47mfri69jur6&wxh=yuexiangenjoy&task=weixin_online_shop";
		String string = WeixinUtil.sendGet(url1);
		System.out.println(string);
	}
}
