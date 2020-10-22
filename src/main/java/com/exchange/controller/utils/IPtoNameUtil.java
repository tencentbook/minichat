package com.exchange.controller.utils;

import javax.servlet.http.HttpServletRequest;

public class IPtoNameUtil {
    public static String getIpAddress(HttpServletRequest request) {
          String ip = request.getHeader("x-forwarded-for");
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                   ip = request.getHeader("Proxy-Client-IP");
              }
     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                   ip = request.getHeader("WL-Proxy-Client-IP");
               }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
               ip = request.getHeader("HTTP_CLIENT_IP");
           }
           if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
          }
     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
             ip = request.getRemoteAddr();
            }
        return ip;}

    public static String getIpName(String str){
        if (str.length()==11){
            String[] strs=str.split("\\.");
            Integer i= Integer.parseInt(strs[2]);
            String lastname=lastnamelist.substring(i,i+1);
            i= Integer.parseInt(strs[3])*2;
            String name=namelist.substring(i-2,i);
            return  lastname+name;
        }

            return "未知用户";
    }

    //根据ip地址取姓
    private static String lastnamelist="赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜" +
            "戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤" +
            "滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧" +
            "计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童颜郭梅盛林刁钟徐邱骆" +
            "高夏蔡田樊胡凌霍虞万支柯昝管卢莫经房裘缪干解应宗丁宣贲邓郁单杭洪包诸左石崔吉钮龚" +
            "程嵇邢滑裴陆荣翁荀羊於惠甄曲家封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬" +
            "全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘景詹束龙";

    private static String namelist="天地玄黄宇宙洪荒日月盈昃辰宿列张寒来暑往秋收冬藏闰余成岁律吕调阳" +
            "云腾致雨露结为霜金生丽水玉出昆冈剑号巨阙珠称夜光果珍李柰菜重芥姜" +
            "海咸河淡鳞潜羽翔坐朝问道垂拱平章爱育黎首臣伏戎羌鸣凤在竹白驹食场" +
            "化被草木赖及万方恭惟鞠养岂敢毁伤知过必改得能莫忘罔谈彼短靡恃己长" +
            "信使可覆器欲难量景行维贤克念作圣德建名立形端表正空谷传声虚堂习听" +
            "祸因恶积福缘善庆尺璧非宝寸阴是竞资父事君曰严与敬孝当竭力忠则尽命" +
            "临深履薄夙兴温凊似兰斯馨如松之盛川流不息渊澄取映笃初诚美慎终宜令" +
            "荣业所基籍甚无竟学优登仕摄职从政存以甘棠去而益咏交友投分切磨箴规" +
            "仁慈隐恻造次弗离节义廉退颠沛匪亏守真志满逐物意移坚持雅操好爵自縻" +
            "背邙面洛浮渭据泾宫殿盘郁楼观飞惊图写禽兽画彩仙灵丙舍旁启甲帐对楹" +
            "肆筵设席鼓瑟吹笙升阶纳陛弁转疑星右通广内左达承明既集坟典亦聚群英" +
            "杜稿钟隶漆书壁经府罗将相路侠槐卿高冠陪辇驱毂振缨世禄侈富车驾肥轻" +
            "策功茂实勒碑刻铭盘溪伊尹佐时阿衡奄宅曲阜微旦孰营桓公匡合济弱扶倾" +
            "俊义密勿多士实宁晋楚更霸赵魏困横宣威沙漠驰誉丹青九州禹迹百郡秦并" +
            "岳宗泰岱禅主云亭雁门紫塞鸡田赤诚昆池碣石钜野洞庭旷远绵邈岩岫杳冥" +
            "治本于农务兹稼穑孟轲敦素史鱼秉直庶几中庸劳谦谨敕贻厥嘉猷勉其祗植";

    }
